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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the ItemRequest service. Represents a row in the &quot;FOOD_ItemRequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.food.portal.model.impl.ItemRequestModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.food.portal.model.impl.ItemRequestImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ItemRequest
 * @generated
 */
@ProviderType
public interface ItemRequestModel
	extends BaseModel<ItemRequest>, GroupedModel, ShardedModel,
			StagedAuditedModel, WorkflowedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a item request model instance should use the {@link ItemRequest} interface instead.
	 */

	/**
	 * Returns the primary key of this item request.
	 *
	 * @return the primary key of this item request
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this item request.
	 *
	 * @param primaryKey the primary key of this item request
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this item request.
	 *
	 * @return the uuid of this item request
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this item request.
	 *
	 * @param uuid the uuid of this item request
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the request ID of this item request.
	 *
	 * @return the request ID of this item request
	 */
	public long getRequestId();

	/**
	 * Sets the request ID of this item request.
	 *
	 * @param requestId the request ID of this item request
	 */
	public void setRequestId(long requestId);

	/**
	 * Returns the item name of this item request.
	 *
	 * @return the item name of this item request
	 */
	@AutoEscape
	public String getItemName();

	/**
	 * Sets the item name of this item request.
	 *
	 * @param itemName the item name of this item request
	 */
	public void setItemName(String itemName);

	/**
	 * Returns the quantity of this item request.
	 *
	 * @return the quantity of this item request
	 */
	public int getQuantity();

	/**
	 * Sets the quantity of this item request.
	 *
	 * @param quantity the quantity of this item request
	 */
	public void setQuantity(int quantity);

	/**
	 * Returns the metric of this item request.
	 *
	 * @return the metric of this item request
	 */
	@AutoEscape
	public String getMetric();

	/**
	 * Sets the metric of this item request.
	 *
	 * @param metric the metric of this item request
	 */
	public void setMetric(String metric);

	/**
	 * Returns the group ID of this item request.
	 *
	 * @return the group ID of this item request
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this item request.
	 *
	 * @param groupId the group ID of this item request
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this item request.
	 *
	 * @return the company ID of this item request
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this item request.
	 *
	 * @param companyId the company ID of this item request
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this item request.
	 *
	 * @return the user ID of this item request
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this item request.
	 *
	 * @param userId the user ID of this item request
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this item request.
	 *
	 * @return the user uuid of this item request
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this item request.
	 *
	 * @param userUuid the user uuid of this item request
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this item request.
	 *
	 * @return the user name of this item request
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this item request.
	 *
	 * @param userName the user name of this item request
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this item request.
	 *
	 * @return the create date of this item request
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this item request.
	 *
	 * @param createDate the create date of this item request
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this item request.
	 *
	 * @return the modified date of this item request
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this item request.
	 *
	 * @param modifiedDate the modified date of this item request
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this item request.
	 *
	 * @return the status of this item request
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this item request.
	 *
	 * @param status the status of this item request
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this item request.
	 *
	 * @return the status by user ID of this item request
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this item request.
	 *
	 * @param statusByUserId the status by user ID of this item request
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this item request.
	 *
	 * @return the status by user uuid of this item request
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this item request.
	 *
	 * @param statusByUserUuid the status by user uuid of this item request
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this item request.
	 *
	 * @return the status by user name of this item request
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this item request.
	 *
	 * @param statusByUserName the status by user name of this item request
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this item request.
	 *
	 * @return the status date of this item request
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this item request.
	 *
	 * @param statusDate the status date of this item request
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns <code>true</code> if this item request is approved.
	 *
	 * @return <code>true</code> if this item request is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this item request is denied.
	 *
	 * @return <code>true</code> if this item request is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this item request is a draft.
	 *
	 * @return <code>true</code> if this item request is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this item request is expired.
	 *
	 * @return <code>true</code> if this item request is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this item request is inactive.
	 *
	 * @return <code>true</code> if this item request is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this item request is incomplete.
	 *
	 * @return <code>true</code> if this item request is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this item request is pending.
	 *
	 * @return <code>true</code> if this item request is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this item request is scheduled.
	 *
	 * @return <code>true</code> if this item request is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

}