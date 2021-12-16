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

package com.food.portal.service.persistence;

import com.food.portal.model.ItemRequest;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the item request service. This utility wraps <code>com.food.portal.service.persistence.impl.ItemRequestPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ItemRequestPersistence
 * @generated
 */
public class ItemRequestUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ItemRequest itemRequest) {
		getPersistence().clearCache(itemRequest);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, ItemRequest> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ItemRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ItemRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ItemRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ItemRequest update(ItemRequest itemRequest) {
		return getPersistence().update(itemRequest);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ItemRequest update(
		ItemRequest itemRequest, ServiceContext serviceContext) {

		return getPersistence().update(itemRequest, serviceContext);
	}

	/**
	 * Returns all the item requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching item requests
	 */
	public static List<ItemRequest> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the item requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @return the range of matching item requests
	 */
	public static List<ItemRequest> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the item requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching item requests
	 */
	public static List<ItemRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the item requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching item requests
	 */
	public static List<ItemRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ItemRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public static ItemRequest findByUuid_First(
			String uuid, OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first item request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public static ItemRequest fetchByUuid_First(
		String uuid, OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last item request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public static ItemRequest findByUuid_Last(
			String uuid, OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last item request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public static ItemRequest fetchByUuid_Last(
		String uuid, OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the item requests before and after the current item request in the ordered set where uuid = &#63;.
	 *
	 * @param requestId the primary key of the current item request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item request
	 * @throws NoSuchItemRequestException if a item request with the primary key could not be found
	 */
	public static ItemRequest[] findByUuid_PrevAndNext(
			long requestId, String uuid,
			OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByUuid_PrevAndNext(
			requestId, uuid, orderByComparator);
	}

	/**
	 * Removes all the item requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of item requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching item requests
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the item request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchItemRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public static ItemRequest findByUUID_G(String uuid, long groupId)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the item request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public static ItemRequest fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the item request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public static ItemRequest fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the item request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the item request that was removed
	 */
	public static ItemRequest removeByUUID_G(String uuid, long groupId)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of item requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching item requests
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the item requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching item requests
	 */
	public static List<ItemRequest> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the item requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @return the range of matching item requests
	 */
	public static List<ItemRequest> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the item requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching item requests
	 */
	public static List<ItemRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the item requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching item requests
	 */
	public static List<ItemRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ItemRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public static ItemRequest findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first item request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public static ItemRequest fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last item request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public static ItemRequest findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last item request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public static ItemRequest fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the item requests before and after the current item request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param requestId the primary key of the current item request
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item request
	 * @throws NoSuchItemRequestException if a item request with the primary key could not be found
	 */
	public static ItemRequest[] findByUuid_C_PrevAndNext(
			long requestId, String uuid, long companyId,
			OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByUuid_C_PrevAndNext(
			requestId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the item requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of item requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching item requests
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the item requests where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching item requests
	 */
	public static List<ItemRequest> findByuserId(long userId) {
		return getPersistence().findByuserId(userId);
	}

	/**
	 * Returns a range of all the item requests where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @return the range of matching item requests
	 */
	public static List<ItemRequest> findByuserId(
		long userId, int start, int end) {

		return getPersistence().findByuserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the item requests where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching item requests
	 */
	public static List<ItemRequest> findByuserId(
		long userId, int start, int end,
		OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().findByuserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the item requests where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching item requests
	 */
	public static List<ItemRequest> findByuserId(
		long userId, int start, int end,
		OrderByComparator<ItemRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByuserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item request in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public static ItemRequest findByuserId_First(
			long userId, OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByuserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first item request in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public static ItemRequest fetchByuserId_First(
		long userId, OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().fetchByuserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last item request in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public static ItemRequest findByuserId_Last(
			long userId, OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByuserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last item request in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public static ItemRequest fetchByuserId_Last(
		long userId, OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().fetchByuserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the item requests before and after the current item request in the ordered set where userId = &#63;.
	 *
	 * @param requestId the primary key of the current item request
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item request
	 * @throws NoSuchItemRequestException if a item request with the primary key could not be found
	 */
	public static ItemRequest[] findByuserId_PrevAndNext(
			long requestId, long userId,
			OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByuserId_PrevAndNext(
			requestId, userId, orderByComparator);
	}

	/**
	 * Removes all the item requests where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByuserId(long userId) {
		getPersistence().removeByuserId(userId);
	}

	/**
	 * Returns the number of item requests where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching item requests
	 */
	public static int countByuserId(long userId) {
		return getPersistence().countByuserId(userId);
	}

	/**
	 * Returns all the item requests where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching item requests
	 */
	public static List<ItemRequest> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the item requests where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @return the range of matching item requests
	 */
	public static List<ItemRequest> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the item requests where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching item requests
	 */
	public static List<ItemRequest> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the item requests where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching item requests
	 */
	public static List<ItemRequest> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<ItemRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item request in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public static ItemRequest findByGroupId_First(
			long groupId, OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first item request in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public static ItemRequest fetchByGroupId_First(
		long groupId, OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last item request in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public static ItemRequest findByGroupId_Last(
			long groupId, OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last item request in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public static ItemRequest fetchByGroupId_Last(
		long groupId, OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the item requests before and after the current item request in the ordered set where groupId = &#63;.
	 *
	 * @param requestId the primary key of the current item request
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item request
	 * @throws NoSuchItemRequestException if a item request with the primary key could not be found
	 */
	public static ItemRequest[] findByGroupId_PrevAndNext(
			long requestId, long groupId,
			OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByGroupId_PrevAndNext(
			requestId, groupId, orderByComparator);
	}

	/**
	 * Removes all the item requests where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of item requests where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching item requests
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the item requests where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching item requests
	 */
	public static List<ItemRequest> findByG_S(long groupId, int status) {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	 * Returns a range of all the item requests where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @return the range of matching item requests
	 */
	public static List<ItemRequest> findByG_S(
		long groupId, int status, int start, int end) {

		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the item requests where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching item requests
	 */
	public static List<ItemRequest> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the item requests where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching item requests
	 */
	public static List<ItemRequest> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<ItemRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item request in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public static ItemRequest findByG_S_First(
			long groupId, int status,
			OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the first item request in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public static ItemRequest fetchByG_S_First(
		long groupId, int status,
		OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().fetchByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last item request in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public static ItemRequest findByG_S_Last(
			long groupId, int status,
			OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last item request in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public static ItemRequest fetchByG_S_Last(
		long groupId, int status,
		OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().fetchByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the item requests before and after the current item request in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param requestId the primary key of the current item request
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item request
	 * @throws NoSuchItemRequestException if a item request with the primary key could not be found
	 */
	public static ItemRequest[] findByG_S_PrevAndNext(
			long requestId, long groupId, int status,
			OrderByComparator<ItemRequest> orderByComparator)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByG_S_PrevAndNext(
			requestId, groupId, status, orderByComparator);
	}

	/**
	 * Removes all the item requests where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public static void removeByG_S(long groupId, int status) {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	 * Returns the number of item requests where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching item requests
	 */
	public static int countByG_S(long groupId, int status) {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	 * Caches the item request in the entity cache if it is enabled.
	 *
	 * @param itemRequest the item request
	 */
	public static void cacheResult(ItemRequest itemRequest) {
		getPersistence().cacheResult(itemRequest);
	}

	/**
	 * Caches the item requests in the entity cache if it is enabled.
	 *
	 * @param itemRequests the item requests
	 */
	public static void cacheResult(List<ItemRequest> itemRequests) {
		getPersistence().cacheResult(itemRequests);
	}

	/**
	 * Creates a new item request with the primary key. Does not add the item request to the database.
	 *
	 * @param requestId the primary key for the new item request
	 * @return the new item request
	 */
	public static ItemRequest create(long requestId) {
		return getPersistence().create(requestId);
	}

	/**
	 * Removes the item request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestId the primary key of the item request
	 * @return the item request that was removed
	 * @throws NoSuchItemRequestException if a item request with the primary key could not be found
	 */
	public static ItemRequest remove(long requestId)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().remove(requestId);
	}

	public static ItemRequest updateImpl(ItemRequest itemRequest) {
		return getPersistence().updateImpl(itemRequest);
	}

	/**
	 * Returns the item request with the primary key or throws a <code>NoSuchItemRequestException</code> if it could not be found.
	 *
	 * @param requestId the primary key of the item request
	 * @return the item request
	 * @throws NoSuchItemRequestException if a item request with the primary key could not be found
	 */
	public static ItemRequest findByPrimaryKey(long requestId)
		throws com.food.portal.exception.NoSuchItemRequestException {

		return getPersistence().findByPrimaryKey(requestId);
	}

	/**
	 * Returns the item request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requestId the primary key of the item request
	 * @return the item request, or <code>null</code> if a item request with the primary key could not be found
	 */
	public static ItemRequest fetchByPrimaryKey(long requestId) {
		return getPersistence().fetchByPrimaryKey(requestId);
	}

	/**
	 * Returns all the item requests.
	 *
	 * @return the item requests
	 */
	public static List<ItemRequest> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the item requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @return the range of item requests
	 */
	public static List<ItemRequest> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the item requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of item requests
	 */
	public static List<ItemRequest> findAll(
		int start, int end, OrderByComparator<ItemRequest> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the item requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of item requests
	 * @param end the upper bound of the range of item requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of item requests
	 */
	public static List<ItemRequest> findAll(
		int start, int end, OrderByComparator<ItemRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the item requests from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of item requests.
	 *
	 * @return the number of item requests
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ItemRequestPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ItemRequestPersistence, ItemRequestPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ItemRequestPersistence.class);

		ServiceTracker<ItemRequestPersistence, ItemRequestPersistence>
			serviceTracker =
				new ServiceTracker
					<ItemRequestPersistence, ItemRequestPersistence>(
						bundle.getBundleContext(), ItemRequestPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}