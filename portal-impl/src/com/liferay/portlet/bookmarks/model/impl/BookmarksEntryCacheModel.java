/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.bookmarks.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.portlet.bookmarks.model.BookmarksEntry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BookmarksEntry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see BookmarksEntry
 * @generated
 */
public class BookmarksEntryCacheModel implements CacheModel<BookmarksEntry>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", entryId=");
		sb.append(entryId);
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
		sb.append(", resourceBlockId=");
		sb.append(resourceBlockId);
		sb.append(", folderId=");
		sb.append(folderId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", url=");
		sb.append(url);
		sb.append(", description=");
		sb.append(description);
		sb.append(", visits=");
		sb.append(visits);
		sb.append(", priority=");
		sb.append(priority);
		sb.append("}");

		return sb.toString();
	}

	public BookmarksEntry toEntityModel() {
		BookmarksEntryImpl bookmarksEntryImpl = new BookmarksEntryImpl();

		if (uuid == null) {
			bookmarksEntryImpl.setUuid(StringPool.BLANK);
		}
		else {
			bookmarksEntryImpl.setUuid(uuid);
		}

		bookmarksEntryImpl.setEntryId(entryId);
		bookmarksEntryImpl.setGroupId(groupId);
		bookmarksEntryImpl.setCompanyId(companyId);
		bookmarksEntryImpl.setUserId(userId);

		if (userName == null) {
			bookmarksEntryImpl.setUserName(StringPool.BLANK);
		}
		else {
			bookmarksEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			bookmarksEntryImpl.setCreateDate(null);
		}
		else {
			bookmarksEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			bookmarksEntryImpl.setModifiedDate(null);
		}
		else {
			bookmarksEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		bookmarksEntryImpl.setResourceBlockId(resourceBlockId);
		bookmarksEntryImpl.setFolderId(folderId);

		if (name == null) {
			bookmarksEntryImpl.setName(StringPool.BLANK);
		}
		else {
			bookmarksEntryImpl.setName(name);
		}

		if (url == null) {
			bookmarksEntryImpl.setUrl(StringPool.BLANK);
		}
		else {
			bookmarksEntryImpl.setUrl(url);
		}

		if (description == null) {
			bookmarksEntryImpl.setDescription(StringPool.BLANK);
		}
		else {
			bookmarksEntryImpl.setDescription(description);
		}

		bookmarksEntryImpl.setVisits(visits);
		bookmarksEntryImpl.setPriority(priority);

		bookmarksEntryImpl.resetOriginalValues();

		return bookmarksEntryImpl;
	}

	public void readExternal(ObjectInput objectInput)
		throws ClassNotFoundException, IOException {
		uuid = objectInput.readUTF();
		entryId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		resourceBlockId = objectInput.readLong();
		folderId = objectInput.readLong();
		name = objectInput.readUTF();
		url = objectInput.readUTF();
		description = objectInput.readUTF();
		visits = objectInput.readInt();
		priority = objectInput.readInt();
	}

	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(entryId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(resourceBlockId);
		objectOutput.writeLong(folderId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeInt(visits);
		objectOutput.writeInt(priority);
	}

	public String uuid;
	public long entryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long resourceBlockId;
	public long folderId;
	public String name;
	public String url;
	public String description;
	public int visits;
	public int priority;
}