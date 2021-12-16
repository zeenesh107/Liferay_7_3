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

import com.food.portal.exception.NoSuchItemRequestException;
import com.food.portal.model.ItemRequest;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the item request service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ItemRequestUtil
 * @generated
 */
@ProviderType
public interface ItemRequestPersistence extends BasePersistence<ItemRequest> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ItemRequestUtil} to access the item request persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the item requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching item requests
	 */
	public java.util.List<ItemRequest> findByUuid(String uuid);

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
	public java.util.List<ItemRequest> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<ItemRequest> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

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
	public java.util.List<ItemRequest> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first item request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public ItemRequest findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Returns the first item request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public ItemRequest fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

	/**
	 * Returns the last item request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public ItemRequest findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Returns the last item request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public ItemRequest fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

	/**
	 * Returns the item requests before and after the current item request in the ordered set where uuid = &#63;.
	 *
	 * @param requestId the primary key of the current item request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item request
	 * @throws NoSuchItemRequestException if a item request with the primary key could not be found
	 */
	public ItemRequest[] findByUuid_PrevAndNext(
			long requestId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Removes all the item requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of item requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching item requests
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the item request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchItemRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public ItemRequest findByUUID_G(String uuid, long groupId)
		throws NoSuchItemRequestException;

	/**
	 * Returns the item request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public ItemRequest fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the item request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public ItemRequest fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the item request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the item request that was removed
	 */
	public ItemRequest removeByUUID_G(String uuid, long groupId)
		throws NoSuchItemRequestException;

	/**
	 * Returns the number of item requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching item requests
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the item requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching item requests
	 */
	public java.util.List<ItemRequest> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<ItemRequest> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<ItemRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

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
	public java.util.List<ItemRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first item request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public ItemRequest findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Returns the first item request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public ItemRequest fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

	/**
	 * Returns the last item request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public ItemRequest findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Returns the last item request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public ItemRequest fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

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
	public ItemRequest[] findByUuid_C_PrevAndNext(
			long requestId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Removes all the item requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of item requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching item requests
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the item requests where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching item requests
	 */
	public java.util.List<ItemRequest> findByuserId(long userId);

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
	public java.util.List<ItemRequest> findByuserId(
		long userId, int start, int end);

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
	public java.util.List<ItemRequest> findByuserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

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
	public java.util.List<ItemRequest> findByuserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first item request in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public ItemRequest findByuserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Returns the first item request in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public ItemRequest fetchByuserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

	/**
	 * Returns the last item request in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public ItemRequest findByuserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Returns the last item request in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public ItemRequest fetchByuserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

	/**
	 * Returns the item requests before and after the current item request in the ordered set where userId = &#63;.
	 *
	 * @param requestId the primary key of the current item request
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item request
	 * @throws NoSuchItemRequestException if a item request with the primary key could not be found
	 */
	public ItemRequest[] findByuserId_PrevAndNext(
			long requestId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Removes all the item requests where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByuserId(long userId);

	/**
	 * Returns the number of item requests where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching item requests
	 */
	public int countByuserId(long userId);

	/**
	 * Returns all the item requests where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching item requests
	 */
	public java.util.List<ItemRequest> findByGroupId(long groupId);

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
	public java.util.List<ItemRequest> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<ItemRequest> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

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
	public java.util.List<ItemRequest> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first item request in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public ItemRequest findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Returns the first item request in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public ItemRequest fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

	/**
	 * Returns the last item request in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public ItemRequest findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Returns the last item request in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public ItemRequest fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

	/**
	 * Returns the item requests before and after the current item request in the ordered set where groupId = &#63;.
	 *
	 * @param requestId the primary key of the current item request
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item request
	 * @throws NoSuchItemRequestException if a item request with the primary key could not be found
	 */
	public ItemRequest[] findByGroupId_PrevAndNext(
			long requestId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Removes all the item requests where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of item requests where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching item requests
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the item requests where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching item requests
	 */
	public java.util.List<ItemRequest> findByG_S(long groupId, int status);

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
	public java.util.List<ItemRequest> findByG_S(
		long groupId, int status, int start, int end);

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
	public java.util.List<ItemRequest> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

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
	public java.util.List<ItemRequest> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first item request in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public ItemRequest findByG_S_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Returns the first item request in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public ItemRequest fetchByG_S_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

	/**
	 * Returns the last item request in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request
	 * @throws NoSuchItemRequestException if a matching item request could not be found
	 */
	public ItemRequest findByG_S_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Returns the last item request in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item request, or <code>null</code> if a matching item request could not be found
	 */
	public ItemRequest fetchByG_S_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

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
	public ItemRequest[] findByG_S_PrevAndNext(
			long requestId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
				orderByComparator)
		throws NoSuchItemRequestException;

	/**
	 * Removes all the item requests where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_S(long groupId, int status);

	/**
	 * Returns the number of item requests where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching item requests
	 */
	public int countByG_S(long groupId, int status);

	/**
	 * Caches the item request in the entity cache if it is enabled.
	 *
	 * @param itemRequest the item request
	 */
	public void cacheResult(ItemRequest itemRequest);

	/**
	 * Caches the item requests in the entity cache if it is enabled.
	 *
	 * @param itemRequests the item requests
	 */
	public void cacheResult(java.util.List<ItemRequest> itemRequests);

	/**
	 * Creates a new item request with the primary key. Does not add the item request to the database.
	 *
	 * @param requestId the primary key for the new item request
	 * @return the new item request
	 */
	public ItemRequest create(long requestId);

	/**
	 * Removes the item request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestId the primary key of the item request
	 * @return the item request that was removed
	 * @throws NoSuchItemRequestException if a item request with the primary key could not be found
	 */
	public ItemRequest remove(long requestId) throws NoSuchItemRequestException;

	public ItemRequest updateImpl(ItemRequest itemRequest);

	/**
	 * Returns the item request with the primary key or throws a <code>NoSuchItemRequestException</code> if it could not be found.
	 *
	 * @param requestId the primary key of the item request
	 * @return the item request
	 * @throws NoSuchItemRequestException if a item request with the primary key could not be found
	 */
	public ItemRequest findByPrimaryKey(long requestId)
		throws NoSuchItemRequestException;

	/**
	 * Returns the item request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requestId the primary key of the item request
	 * @return the item request, or <code>null</code> if a item request with the primary key could not be found
	 */
	public ItemRequest fetchByPrimaryKey(long requestId);

	/**
	 * Returns all the item requests.
	 *
	 * @return the item requests
	 */
	public java.util.List<ItemRequest> findAll();

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
	public java.util.List<ItemRequest> findAll(int start, int end);

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
	public java.util.List<ItemRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator);

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
	public java.util.List<ItemRequest> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ItemRequest>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the item requests from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of item requests.
	 *
	 * @return the number of item requests
	 */
	public int countAll();

}