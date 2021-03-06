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

package com.food.portal.service;

import com.food.portal.model.ItemRequest;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for ItemRequest. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ItemRequestLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ItemRequestLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ItemRequestLocalServiceUtil} to access the item request local service. Add custom service methods to <code>com.food.portal.service.impl.ItemRequestLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Adds the item request to the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemRequest the item request
	 * @return the item request that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ItemRequest addItemRequest(ItemRequest itemRequest);

	@Indexable(type = IndexableType.REINDEX)
	public ItemRequest addItemRequest(
			long userId, String itemName, int quantity, String metric,
			ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Creates a new item request with the primary key. Does not add the item request to the database.
	 *
	 * @param requestId the primary key for the new item request
	 * @return the new item request
	 */
	@Transactional(enabled = false)
	public ItemRequest createItemRequest(long requestId);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Deletes the item request from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemRequest the item request
	 * @return the item request that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public ItemRequest deleteItemRequest(ItemRequest itemRequest);

	/**
	 * Deletes the item request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestId the primary key of the item request
	 * @return the item request that was removed
	 * @throws PortalException if a item request with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public ItemRequest deleteItemRequest(long requestId) throws PortalException;

	@Indexable(type = IndexableType.DELETE)
	public ItemRequest deleteItemRequest(
			long itemRequestId, ServiceContext serviceContext)
		throws PortalException, SystemException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.food.portal.model.impl.ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.food.portal.model.impl.ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ItemRequest fetchItemRequest(long requestId);

	/**
	 * Returns the item request matching the UUID and group.
	 *
	 * @param uuid the item request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching item request, or <code>null</code> if a matching item request could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ItemRequest fetchItemRequestByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the item request with the primary key.
	 *
	 * @param requestId the primary key of the item request
	 * @return the item request
	 * @throws PortalException if a item request with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ItemRequest getItemRequest(long requestId) throws PortalException;

	/**
	 * Returns the item request matching the UUID and group.
	 *
	 * @param uuid the item request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching item request
	 * @throws PortalException if a matching item request could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ItemRequest getItemRequestByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getItemRequestCountByGroupId(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getItemRequestCountByUserId(long userId);

	/**
	 * Returns a range of all the item requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.food.portal.model.impl.ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @return the range of item requests
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ItemRequest> getItemRequests(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ItemRequest> getItemRequestsByG_S(long groupId, int status)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ItemRequest> getItemRequestsByGroupId(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ItemRequest> getItemRequestsByGroupId(
		long groupId, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ItemRequest> getItemRequestsByGroupId(
		long groupId, int start, int end, OrderByComparator<ItemRequest> obc);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ItemRequest> getItemRequestsByUserId(long userId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ItemRequest> getItemRequestsByUserId(
		long userId, int start, int end);

	/**
	 * Returns all the item requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the item requests
	 * @param companyId the primary key of the company
	 * @return the matching item requests, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ItemRequest> getItemRequestsByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of item requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the item requests
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching item requests, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ItemRequest> getItemRequestsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ItemRequest> orderByComparator);

	/**
	 * Returns the number of item requests.
	 *
	 * @return the number of item requests
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getItemRequestsCount();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Updates the item request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param itemRequest the item request
	 * @return the item request that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public ItemRequest updateItemRequest(ItemRequest itemRequest);

	@Indexable(type = IndexableType.REINDEX)
	public ItemRequest updateItemRequest(
			long userId, long itemRequestId, String itemName, int quantity,
			String metric, ServiceContext serviceContext)
		throws PortalException, SystemException;

	public ItemRequest updateStatus(
			long userId, long reqestId, int status,
			ServiceContext serviceContext)
		throws PortalException, SystemException;

}