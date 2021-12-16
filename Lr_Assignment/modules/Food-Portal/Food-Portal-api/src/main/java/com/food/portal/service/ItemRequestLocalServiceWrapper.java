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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ItemRequestLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ItemRequestLocalService
 * @generated
 */
public class ItemRequestLocalServiceWrapper
	implements ItemRequestLocalService,
			   ServiceWrapper<ItemRequestLocalService> {

	public ItemRequestLocalServiceWrapper(
		ItemRequestLocalService itemRequestLocalService) {

		_itemRequestLocalService = itemRequestLocalService;
	}

	/**
	 * Adds the item request to the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemRequest the item request
	 * @return the item request that was added
	 */
	@Override
	public com.food.portal.model.ItemRequest addItemRequest(
		com.food.portal.model.ItemRequest itemRequest) {

		return _itemRequestLocalService.addItemRequest(itemRequest);
	}

	@Override
	public com.food.portal.model.ItemRequest addItemRequest(
			long userId, String itemName, int quantity, String metric,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemRequestLocalService.addItemRequest(
			userId, itemName, quantity, metric, serviceContext);
	}

	/**
	 * Creates a new item request with the primary key. Does not add the item request to the database.
	 *
	 * @param requestId the primary key for the new item request
	 * @return the new item request
	 */
	@Override
	public com.food.portal.model.ItemRequest createItemRequest(long requestId) {
		return _itemRequestLocalService.createItemRequest(requestId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemRequestLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the item request from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemRequest the item request
	 * @return the item request that was removed
	 */
	@Override
	public com.food.portal.model.ItemRequest deleteItemRequest(
		com.food.portal.model.ItemRequest itemRequest) {

		return _itemRequestLocalService.deleteItemRequest(itemRequest);
	}

	/**
	 * Deletes the item request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestId the primary key of the item request
	 * @return the item request that was removed
	 * @throws PortalException if a item request with the primary key could not be found
	 */
	@Override
	public com.food.portal.model.ItemRequest deleteItemRequest(long requestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemRequestLocalService.deleteItemRequest(requestId);
	}

	@Override
	public com.food.portal.model.ItemRequest deleteItemRequest(
			long itemRequestId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _itemRequestLocalService.deleteItemRequest(
			itemRequestId, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemRequestLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _itemRequestLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _itemRequestLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _itemRequestLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _itemRequestLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _itemRequestLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _itemRequestLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.food.portal.model.ItemRequest fetchItemRequest(long requestId) {
		return _itemRequestLocalService.fetchItemRequest(requestId);
	}

	/**
	 * Returns the item request matching the UUID and group.
	 *
	 * @param uuid the item request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching item request, or <code>null</code> if a matching item request could not be found
	 */
	@Override
	public com.food.portal.model.ItemRequest fetchItemRequestByUuidAndGroupId(
		String uuid, long groupId) {

		return _itemRequestLocalService.fetchItemRequestByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _itemRequestLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _itemRequestLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _itemRequestLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the item request with the primary key.
	 *
	 * @param requestId the primary key of the item request
	 * @return the item request
	 * @throws PortalException if a item request with the primary key could not be found
	 */
	@Override
	public com.food.portal.model.ItemRequest getItemRequest(long requestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemRequestLocalService.getItemRequest(requestId);
	}

	/**
	 * Returns the item request matching the UUID and group.
	 *
	 * @param uuid the item request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching item request
	 * @throws PortalException if a matching item request could not be found
	 */
	@Override
	public com.food.portal.model.ItemRequest getItemRequestByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemRequestLocalService.getItemRequestByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public int getItemRequestCountByGroupId(long groupId) {
		return _itemRequestLocalService.getItemRequestCountByGroupId(groupId);
	}

	@Override
	public int getItemRequestCountByUserId(long userId) {
		return _itemRequestLocalService.getItemRequestCountByUserId(userId);
	}

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
	@Override
	public java.util.List<com.food.portal.model.ItemRequest> getItemRequests(
		int start, int end) {

		return _itemRequestLocalService.getItemRequests(start, end);
	}

	@Override
	public java.util.List<com.food.portal.model.ItemRequest>
			getItemRequestsByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _itemRequestLocalService.getItemRequestsByG_S(groupId, status);
	}

	@Override
	public java.util.List<com.food.portal.model.ItemRequest>
		getItemRequestsByGroupId(long groupId) {

		return _itemRequestLocalService.getItemRequestsByGroupId(groupId);
	}

	@Override
	public java.util.List<com.food.portal.model.ItemRequest>
		getItemRequestsByGroupId(long groupId, int start, int end) {

		return _itemRequestLocalService.getItemRequestsByGroupId(
			groupId, start, end);
	}

	@Override
	public java.util.List<com.food.portal.model.ItemRequest>
		getItemRequestsByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.food.portal.model.ItemRequest> obc) {

		return _itemRequestLocalService.getItemRequestsByGroupId(
			groupId, start, end, obc);
	}

	@Override
	public java.util.List<com.food.portal.model.ItemRequest>
		getItemRequestsByUserId(long userId) {

		return _itemRequestLocalService.getItemRequestsByUserId(userId);
	}

	@Override
	public java.util.List<com.food.portal.model.ItemRequest>
		getItemRequestsByUserId(long userId, int start, int end) {

		return _itemRequestLocalService.getItemRequestsByUserId(
			userId, start, end);
	}

	/**
	 * Returns all the item requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the item requests
	 * @param companyId the primary key of the company
	 * @return the matching item requests, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.food.portal.model.ItemRequest>
		getItemRequestsByUuidAndCompanyId(String uuid, long companyId) {

		return _itemRequestLocalService.getItemRequestsByUuidAndCompanyId(
			uuid, companyId);
	}

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
	@Override
	public java.util.List<com.food.portal.model.ItemRequest>
		getItemRequestsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.food.portal.model.ItemRequest> orderByComparator) {

		return _itemRequestLocalService.getItemRequestsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of item requests.
	 *
	 * @return the number of item requests
	 */
	@Override
	public int getItemRequestsCount() {
		return _itemRequestLocalService.getItemRequestsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _itemRequestLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _itemRequestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the item request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param itemRequest the item request
	 * @return the item request that was updated
	 */
	@Override
	public com.food.portal.model.ItemRequest updateItemRequest(
		com.food.portal.model.ItemRequest itemRequest) {

		return _itemRequestLocalService.updateItemRequest(itemRequest);
	}

	@Override
	public com.food.portal.model.ItemRequest updateItemRequest(
			long userId, long itemRequestId, String itemName, int quantity,
			String metric,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _itemRequestLocalService.updateItemRequest(
			userId, itemRequestId, itemName, quantity, metric, serviceContext);
	}

	@Override
	public com.food.portal.model.ItemRequest updateStatus(
			long userId, long reqestId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return _itemRequestLocalService.updateStatus(
			userId, reqestId, status, serviceContext);
	}

	@Override
	public ItemRequestLocalService getWrappedService() {
		return _itemRequestLocalService;
	}

	@Override
	public void setWrappedService(
		ItemRequestLocalService itemRequestLocalService) {

		_itemRequestLocalService = itemRequestLocalService;
	}

	private ItemRequestLocalService _itemRequestLocalService;

}