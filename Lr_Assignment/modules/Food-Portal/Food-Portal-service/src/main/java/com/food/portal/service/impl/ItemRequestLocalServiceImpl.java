/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.food.portal.service.impl;

import com.food.portal.model.ItemRequest;
import com.food.portal.service.base.ItemRequestLocalServiceBaseImpl;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetLinkConstants;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.role.RoleConstants;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the item request local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.food.portal.service.ItemRequestLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ItemRequestLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.food.portal.model.ItemRequest",
	service = AopService.class
)
public class ItemRequestLocalServiceImpl
	extends ItemRequestLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.food.portal.service.ItemRequestLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.food.portal.service.ItemRequestLocalServiceUtil</code>.
	 */
	
	
	 @Indexable(type = IndexableType.REINDEX)
	    public ItemRequest addItemRequest(long userId, String itemName,int quantity,String metric, ServiceContext serviceContext) throws PortalException {
	        long groupId = serviceContext.getScopeGroupId();
	        
	        User user = userLocalService.getUserById(userId);
	        
	        Date now = new Date();
	        
	        long itemRequestId = counterLocalService.increment();
	        
	        ItemRequest itemRequest = itemRequestPersistence.create(itemRequestId);
	        
	        itemRequest.setUuid(serviceContext.getUuid());
	        itemRequest.setUserId(userId);
	        itemRequest.setGroupId(groupId);
	        itemRequest.setCompanyId(user.getCompanyId());
	        itemRequest.setUserName(user.getFullName());
	        itemRequest.setCreateDate(serviceContext.getCreateDate(now));
	        itemRequest.setModifiedDate(serviceContext.getModifiedDate(now));
	        itemRequest.setItemName(itemName);
	        itemRequest.setQuantity(quantity);
	        itemRequest.setMetric(metric);
	        itemRequest.setExpandoBridgeAttributes(serviceContext);
	        
	        itemRequest.setStatus(WorkflowConstants.STATUS_DRAFT);
	        itemRequest.setStatusByUserId(userId);
	        itemRequest.setStatusByUserName(user.getFullName());
	        itemRequest.setStatusDate(serviceContext.getModifiedDate(null));
	        
	        itemRequestPersistence.update(itemRequest);
	        
	        AssetEntry assetEntry = assetEntryLocalService.updateEntry(userId,
	            groupId, itemRequest.getCreateDate(),
	            itemRequest.getModifiedDate(), ItemRequest.class.getName(),
	            itemRequestId, itemRequest.getUuid(), 0,
	            serviceContext.getAssetCategoryIds(),
	            serviceContext.getAssetTagNames(), true, true, null, null, null, null,
	            ContentTypes.TEXT_HTML, itemRequest.getItemName(), null, null, null,
	            null, 0, 0, null);
	        
		
		  assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(),
		  serviceContext.getAssetLinkEntryIds(), AssetLinkConstants.TYPE_RELATED);
		 
	        
	        WorkflowHandlerRegistryUtil.startWorkflowInstance(itemRequest.getCompanyId(),
	            itemRequest.getGroupId(), itemRequest.getUserId(), ItemRequest.class.getName(),
	            itemRequest.getPrimaryKey(), itemRequest, serviceContext);
	        
	        return itemRequest;
	    }
	    
	    @Indexable(type = IndexableType.REINDEX)
	    public ItemRequest updateItemRequest(long userId, long itemRequestId, String itemName,int quantity,String metric, ServiceContext serviceContext) throws PortalException, SystemException {
	        Date now = new Date();
	        
	        ItemRequest itemRequest = getItemRequest(itemRequestId);
	        
	        User user = userLocalService.getUser(userId);
	        
	        itemRequest.setUserId(userId);
	        itemRequest.setUserName(user.getFullName());
	        itemRequest.setModifiedDate(serviceContext.getModifiedDate(now));
	        itemRequest.setItemName(itemName);
	        itemRequest.setQuantity(quantity);
	        itemRequest.setMetric(metric);
	        itemRequest.setExpandoBridgeAttributes(serviceContext);
	        
	        itemRequestPersistence.update(itemRequest);
	        
	        AssetEntry assetEntry = assetEntryLocalService.updateEntry(itemRequest.getUserId(),
	            itemRequest.getGroupId(), itemRequest.getCreateDate(),
	            itemRequest.getModifiedDate(), ItemRequest.class.getName(),
	            itemRequestId, itemRequest.getUuid(), 0,
	            serviceContext.getAssetCategoryIds(),
	            serviceContext.getAssetTagNames(), true, true, itemRequest.getCreateDate(),
	            null, null, null, ContentTypes.TEXT_HTML, itemRequest.getItemName(), null, null,
	            null, null, 0, 0, serviceContext.getAssetPriority());
	        
		
		  assetLinkLocalService.updateLinks(serviceContext.getUserId(),
		  assetEntry.getEntryId(), serviceContext.getAssetLinkEntryIds(),
		  AssetLinkConstants.TYPE_RELATED);
		 
	        
	        return itemRequest;
	    }
	    
	    @Indexable(type = IndexableType.DELETE)
	    public ItemRequest deleteItemRequest(long itemRequestId, ServiceContext serviceContext) throws PortalException, SystemException {
	        ItemRequest itemRequest = getItemRequest(itemRequestId);
	        
	        
	        itemRequest = deleteItemRequest(itemRequest);
	        
	        AssetEntry assetEntry = assetEntryLocalService.fetchEntry(
	            ItemRequest.class.getName(), itemRequestId);

	        assetLinkLocalService.deleteLinks(assetEntry.getEntryId());
	        
	        assetEntryLocalService.deleteEntry(assetEntry);
	        
	        workflowInstanceLinkLocalService.deleteWorkflowInstanceLinks(
	            itemRequest.getCompanyId(), itemRequest.getGroupId(),
	            ItemRequest.class.getName(), itemRequest.getRequestId());
	        
	        return itemRequest;
	    }
	
	
	public ItemRequest updateStatus(long userId, long reqestId, int status, ServiceContext serviceContext) throws PortalException, SystemException {
     User user = userLocalService.getUser(userId);
     ItemRequest itemRequest = getItemRequest(reqestId);
     
     itemRequest.setStatus(status);
     itemRequest.setStatusByUserId(userId);
     itemRequest.setStatusByUserName(user.getFullName());
     itemRequest.setStatusDate(new Date());
     
     itemRequestPersistence.update(itemRequest);
     
     if (status == WorkflowConstants.STATUS_APPROVED) {
         assetEntryLocalService.updateVisible(ItemRequest.class.getName(), reqestId, true);
     } else {
         assetEntryLocalService.updateVisible(ItemRequest.class.getName(), reqestId, false);
     }
     return itemRequest;
 }
	
	
	public List<ItemRequest> getItemRequestsByGroupId(long groupId) {
     return itemRequestPersistence.findByGroupId(groupId);
 }
 
	 public List<ItemRequest> getItemRequestsByGroupId(long groupId, int start, int end, OrderByComparator<ItemRequest> obc) {
	     return itemRequestPersistence.findByGroupId(groupId, start, end, obc);
	 }
	 
	 public List<ItemRequest> getItemRequestsByGroupId(long groupId, int start, int end) {
	     return itemRequestPersistence.findByGroupId(groupId, start, end);
	 }
	 
	 public List<ItemRequest> getItemRequestsByG_S(long groupId, int status) throws SystemException {
	     return itemRequestPersistence.findByG_S(groupId, status);
	 }
	 
	 public int getItemRequestCountByGroupId(long groupId) {
	     return itemRequestPersistence.countByGroupId(groupId);
	 }
 
 
 
	 public List<ItemRequest> getItemRequestsByUserId(long userId) {
	     return itemRequestPersistence.findByuserId(userId);
	 }
	 
	 public List<ItemRequest> getItemRequestsByUserId(long userId, int start, int end) {
	     return itemRequestPersistence.findByuserId(userId,start,end);
	 }
	 
	 public int getItemRequestCountByUserId(long userId) {
	     return itemRequestPersistence.countByuserId(userId);
	 }
}