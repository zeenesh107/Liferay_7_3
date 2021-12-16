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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for ItemRequest. This utility wraps
 * <code>com.food.portal.service.impl.ItemRequestLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ItemRequestLocalService
 * @generated
 */
public class ItemRequestLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.food.portal.service.impl.ItemRequestLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the item request to the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemRequest the item request
	 * @return the item request that was added
	 */
	public static com.food.portal.model.ItemRequest addItemRequest(
		com.food.portal.model.ItemRequest itemRequest) {

		return getService().addItemRequest(itemRequest);
	}

	public static com.food.portal.model.ItemRequest addItemRequest(
			long userId, String itemName, int quantity, String metric,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addItemRequest(
			userId, itemName, quantity, metric, serviceContext);
	}

	/**
	 * Creates a new item request with the primary key. Does not add the item request to the database.
	 *
	 * @param requestId the primary key for the new item request
	 * @return the new item request
	 */
	public static com.food.portal.model.ItemRequest createItemRequest(
		long requestId) {

		return getService().createItemRequest(requestId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the item request from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemRequest the item request
	 * @return the item request that was removed
	 */
	public static com.food.portal.model.ItemRequest deleteItemRequest(
		com.food.portal.model.ItemRequest itemRequest) {

		return getService().deleteItemRequest(itemRequest);
	}

	/**
	 * Deletes the item request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestId the primary key of the item request
	 * @return the item request that was removed
	 * @throws PortalException if a item request with the primary key could not be found
	 */
	public static com.food.portal.model.ItemRequest deleteItemRequest(
			long requestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteItemRequest(requestId);
	}

	public static com.food.portal.model.ItemRequest deleteItemRequest(
			long itemRequestId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().deleteItemRequest(itemRequestId, serviceContext);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.food.portal.model.ItemRequest fetchItemRequest(
		long requestId) {

		return getService().fetchItemRequest(requestId);
	}

	/**
	 * Returns the item request matching the UUID and group.
	 *
	 * @param uuid the item request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public static com.food.portal.model.ItemRequest
		fetchItemRequestByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchItemRequestByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the item request with the primary key.
	 *
	 * @param requestId the primary key of the item request
	 * @return the item request
	 * @throws PortalException if a item request with the primary key could not be found
	 */
	public static com.food.portal.model.ItemRequest getItemRequest(
			long requestId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getItemRequest(requestId);
	}

	/**
	 * Returns the item request matching the UUID and group.
	 *
	 * @param uuid the item request's UUID
	 * @param groupId the primary key of the group
	 * @return the matching item request
	 * @throws PortalException if a matching item request could not be found
	 */
	public static com.food.portal.model.ItemRequest
			getItemRequestByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getItemRequestByUuidAndGroupId(uuid, groupId);
	}

	public static int getItemRequestCountByGroupId(long groupId) {
		return getService().getItemRequestCountByGroupId(groupId);
	}

	public static int getItemRequestCountByUserId(long userId) {
		return getService().getItemRequestCountByUserId(userId);
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
	public static java.util.List<com.food.portal.model.ItemRequest>
		getItemRequests(int start, int end) {

		return getService().getItemRequests(start, end);
	}

	public static java.util.List<com.food.portal.model.ItemRequest>
			getItemRequestsByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {

		return getService().getItemRequestsByG_S(groupId, status);
	}

	public static java.util.List<com.food.portal.model.ItemRequest>
		getItemRequestsByGroupId(long groupId) {

		return getService().getItemRequestsByGroupId(groupId);
	}

	public static java.util.List<com.food.portal.model.ItemRequest>
		getItemRequestsByGroupId(long groupId, int start, int end) {

		return getService().getItemRequestsByGroupId(groupId, start, end);
	}

	public static java.util.List<com.food.portal.model.ItemRequest>
		getItemRequestsByGroupId(
			long groupId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.food.portal.model.ItemRequest> obc) {

		return getService().getItemRequestsByGroupId(groupId, start, end, obc);
	}

	public static java.util.List<com.food.portal.model.ItemRequest>
		getItemRequestsByUserId(long userId) {

		return getService().getItemRequestsByUserId(userId);
	}

	public static java.util.List<com.food.portal.model.ItemRequest>
		getItemRequestsByUserId(long userId, int start, int end) {

		return getService().getItemRequestsByUserId(userId, start, end);
	}

	/**
	 * Returns all the item requests matching the UUID and company.
	 *
	 * @param uuid the UUID of the item requests
	 * @param companyId the primary key of the company
	 * @return the matching item requests, or an empty list if no matches were found
	 */
	public static java.util.List<com.food.portal.model.ItemRequest>
		getItemRequestsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getItemRequestsByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<com.food.portal.model.ItemRequest>
		getItemRequestsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.food.portal.model.ItemRequest> orderByComparator) {

		return getService().getItemRequestsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of item requests.
	 *
	 * @return the number of item requests
	 */
	public static int getItemRequestsCount() {
		return getService().getItemRequestsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the item request in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param itemRequest the item request
	 * @return the item request that was updated
	 */
	public static com.food.portal.model.ItemRequest updateItemRequest(
		com.food.portal.model.ItemRequest itemRequest) {

		return getService().updateItemRequest(itemRequest);
	}

	public static com.food.portal.model.ItemRequest updateItemRequest(
			long userId, long itemRequestId, String itemName, int quantity,
			String metric,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().updateItemRequest(
			userId, itemRequestId, itemName, quantity, metric, serviceContext);
	}

	public static com.food.portal.model.ItemRequest updateStatus(
			long userId, long reqestId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			   com.liferay.portal.kernel.exception.SystemException {

		return getService().updateStatus(
			userId, reqestId, status, serviceContext);
	}

	public static ItemRequestLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ItemRequestLocalService, ItemRequestLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ItemRequestLocalService.class);

		ServiceTracker<ItemRequestLocalService, ItemRequestLocalService>
			serviceTracker =
				new ServiceTracker
					<ItemRequestLocalService, ItemRequestLocalService>(
						bundle.getBundleContext(),
						ItemRequestLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}