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

package com.food.portal.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ItemRequest}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ItemRequest
 * @generated
 */
public class ItemRequestWrapper
	extends BaseModelWrapper<ItemRequest>
	implements ItemRequest, ModelWrapper<ItemRequest> {

	public ItemRequestWrapper(ItemRequest itemRequest) {
		super(itemRequest);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("requestId", getRequestId());
		attributes.put("itemName", getItemName());
		attributes.put("quantity", getQuantity());
		attributes.put("metric", getMetric());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long requestId = (Long)attributes.get("requestId");

		if (requestId != null) {
			setRequestId(requestId);
		}

		String itemName = (String)attributes.get("itemName");

		if (itemName != null) {
			setItemName(itemName);
		}

		Integer quantity = (Integer)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String metric = (String)attributes.get("metric");

		if (metric != null) {
			setMetric(metric);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	/**
	 * Returns the company ID of this item request.
	 *
	 * @return the company ID of this item request
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this item request.
	 *
	 * @return the create date of this item request
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this item request.
	 *
	 * @return the group ID of this item request
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the item name of this item request.
	 *
	 * @return the item name of this item request
	 */
	@Override
	public String getItemName() {
		return model.getItemName();
	}

	/**
	 * Returns the metric of this item request.
	 *
	 * @return the metric of this item request
	 */
	@Override
	public String getMetric() {
		return model.getMetric();
	}

	/**
	 * Returns the modified date of this item request.
	 *
	 * @return the modified date of this item request
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this item request.
	 *
	 * @return the primary key of this item request
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quantity of this item request.
	 *
	 * @return the quantity of this item request
	 */
	@Override
	public int getQuantity() {
		return model.getQuantity();
	}

	/**
	 * Returns the request ID of this item request.
	 *
	 * @return the request ID of this item request
	 */
	@Override
	public long getRequestId() {
		return model.getRequestId();
	}

	/**
	 * Returns the status of this item request.
	 *
	 * @return the status of this item request
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this item request.
	 *
	 * @return the status by user ID of this item request
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this item request.
	 *
	 * @return the status by user name of this item request
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this item request.
	 *
	 * @return the status by user uuid of this item request
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this item request.
	 *
	 * @return the status date of this item request
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the user ID of this item request.
	 *
	 * @return the user ID of this item request
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this item request.
	 *
	 * @return the user name of this item request
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this item request.
	 *
	 * @return the user uuid of this item request
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this item request.
	 *
	 * @return the uuid of this item request
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this item request is approved.
	 *
	 * @return <code>true</code> if this item request is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this item request is denied.
	 *
	 * @return <code>true</code> if this item request is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this item request is a draft.
	 *
	 * @return <code>true</code> if this item request is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this item request is expired.
	 *
	 * @return <code>true</code> if this item request is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this item request is inactive.
	 *
	 * @return <code>true</code> if this item request is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this item request is incomplete.
	 *
	 * @return <code>true</code> if this item request is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this item request is pending.
	 *
	 * @return <code>true</code> if this item request is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this item request is scheduled.
	 *
	 * @return <code>true</code> if this item request is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this item request.
	 *
	 * @param companyId the company ID of this item request
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this item request.
	 *
	 * @param createDate the create date of this item request
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this item request.
	 *
	 * @param groupId the group ID of this item request
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the item name of this item request.
	 *
	 * @param itemName the item name of this item request
	 */
	@Override
	public void setItemName(String itemName) {
		model.setItemName(itemName);
	}

	/**
	 * Sets the metric of this item request.
	 *
	 * @param metric the metric of this item request
	 */
	@Override
	public void setMetric(String metric) {
		model.setMetric(metric);
	}

	/**
	 * Sets the modified date of this item request.
	 *
	 * @param modifiedDate the modified date of this item request
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this item request.
	 *
	 * @param primaryKey the primary key of this item request
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quantity of this item request.
	 *
	 * @param quantity the quantity of this item request
	 */
	@Override
	public void setQuantity(int quantity) {
		model.setQuantity(quantity);
	}

	/**
	 * Sets the request ID of this item request.
	 *
	 * @param requestId the request ID of this item request
	 */
	@Override
	public void setRequestId(long requestId) {
		model.setRequestId(requestId);
	}

	/**
	 * Sets the status of this item request.
	 *
	 * @param status the status of this item request
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this item request.
	 *
	 * @param statusByUserId the status by user ID of this item request
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this item request.
	 *
	 * @param statusByUserName the status by user name of this item request
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this item request.
	 *
	 * @param statusByUserUuid the status by user uuid of this item request
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this item request.
	 *
	 * @param statusDate the status date of this item request
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this item request.
	 *
	 * @param userId the user ID of this item request
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this item request.
	 *
	 * @param userName the user name of this item request
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this item request.
	 *
	 * @param userUuid the user uuid of this item request
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this item request.
	 *
	 * @param uuid the uuid of this item request
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected ItemRequestWrapper wrap(ItemRequest itemRequest) {
		return new ItemRequestWrapper(itemRequest);
	}

}