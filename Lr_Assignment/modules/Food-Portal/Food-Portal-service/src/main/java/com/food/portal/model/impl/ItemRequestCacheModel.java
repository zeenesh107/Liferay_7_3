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

package com.food.portal.model.impl;

import com.food.portal.model.ItemRequest;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ItemRequest in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ItemRequestCacheModel
	implements CacheModel<ItemRequest>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ItemRequestCacheModel)) {
			return false;
		}

		ItemRequestCacheModel itemRequestCacheModel =
			(ItemRequestCacheModel)obj;

		if (requestId == itemRequestCacheModel.requestId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, requestId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", requestId=");
		sb.append(requestId);
		sb.append(", itemName=");
		sb.append(itemName);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", metric=");
		sb.append(metric);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ItemRequest toEntityModel() {
		ItemRequestImpl itemRequestImpl = new ItemRequestImpl();

		if (uuid == null) {
			itemRequestImpl.setUuid("");
		}
		else {
			itemRequestImpl.setUuid(uuid);
		}

		itemRequestImpl.setRequestId(requestId);

		if (itemName == null) {
			itemRequestImpl.setItemName("");
		}
		else {
			itemRequestImpl.setItemName(itemName);
		}

		itemRequestImpl.setQuantity(quantity);

		if (metric == null) {
			itemRequestImpl.setMetric("");
		}
		else {
			itemRequestImpl.setMetric(metric);
		}

		itemRequestImpl.setGroupId(groupId);
		itemRequestImpl.setCompanyId(companyId);
		itemRequestImpl.setUserId(userId);

		if (userName == null) {
			itemRequestImpl.setUserName("");
		}
		else {
			itemRequestImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			itemRequestImpl.setCreateDate(null);
		}
		else {
			itemRequestImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			itemRequestImpl.setModifiedDate(null);
		}
		else {
			itemRequestImpl.setModifiedDate(new Date(modifiedDate));
		}

		itemRequestImpl.setStatus(status);
		itemRequestImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			itemRequestImpl.setStatusByUserName("");
		}
		else {
			itemRequestImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			itemRequestImpl.setStatusDate(null);
		}
		else {
			itemRequestImpl.setStatusDate(new Date(statusDate));
		}

		itemRequestImpl.resetOriginalValues();

		return itemRequestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		requestId = objectInput.readLong();
		itemName = objectInput.readUTF();

		quantity = objectInput.readInt();
		metric = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(requestId);

		if (itemName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(itemName);
		}

		objectOutput.writeInt(quantity);

		if (metric == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(metric);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long requestId;
	public String itemName;
	public int quantity;
	public String metric;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}