/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.documentlibrary.model.impl;

import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.bean.ReadOnlyBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.documentlibrary.model.DLFileVersion;
import com.liferay.portlet.documentlibrary.model.DLFileVersionSoap;
import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.model.impl.ExpandoBridgeImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <a href="DLFileVersionModelImpl.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This interface is a model that represents the DLFileVersion table in the
 * database.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see    DLFileVersionImpl
 * @see    com.liferay.portlet.documentlibrary.model.DLFileVersion
 * @see    com.liferay.portlet.documentlibrary.model.DLFileVersionModel
 * @generated
 */
public class DLFileVersionModelImpl extends BaseModelImpl<DLFileVersion> {
	public static final String TABLE_NAME = "DLFileVersion";
	public static final Object[][] TABLE_COLUMNS = {
			{ "fileVersionId", new Integer(Types.BIGINT) },
			

			{ "groupId", new Integer(Types.BIGINT) },
			

			{ "companyId", new Integer(Types.BIGINT) },
			

			{ "userId", new Integer(Types.BIGINT) },
			

			{ "userName", new Integer(Types.VARCHAR) },
			

			{ "createDate", new Integer(Types.TIMESTAMP) },
			

			{ "folderId", new Integer(Types.BIGINT) },
			

			{ "name", new Integer(Types.VARCHAR) },
			

			{ "version", new Integer(Types.DOUBLE) },
			

			{ "size_", new Integer(Types.INTEGER) }
		};
	public static final String TABLE_SQL_CREATE = "create table DLFileVersion (fileVersionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,folderId LONG,name VARCHAR(255) null,version DOUBLE,size_ INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table DLFileVersion";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portlet.documentlibrary.model.DLFileVersion"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portlet.documentlibrary.model.DLFileVersion"),
			true);

	public static DLFileVersion toModel(DLFileVersionSoap soapModel) {
		DLFileVersion model = new DLFileVersionImpl();

		model.setFileVersionId(soapModel.getFileVersionId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setFolderId(soapModel.getFolderId());
		model.setName(soapModel.getName());
		model.setVersion(soapModel.getVersion());
		model.setSize(soapModel.getSize());

		return model;
	}

	public static List<DLFileVersion> toModels(DLFileVersionSoap[] soapModels) {
		List<DLFileVersion> models = new ArrayList<DLFileVersion>(soapModels.length);

		for (DLFileVersionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portlet.documentlibrary.model.DLFileVersion"));

	public DLFileVersionModelImpl() {
	}

	public long getPrimaryKey() {
		return _fileVersionId;
	}

	public void setPrimaryKey(long pk) {
		setFileVersionId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_fileVersionId);
	}

	public long getFileVersionId() {
		return _fileVersionId;
	}

	public void setFileVersionId(long fileVersionId) {
		_fileVersionId = fileVersionId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		return GetterUtil.getString(_userName);
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public long getFolderId() {
		return _folderId;
	}

	public void setFolderId(long folderId) {
		_folderId = folderId;

		if (!_setOriginalFolderId) {
			_setOriginalFolderId = true;

			_originalFolderId = folderId;
		}
	}

	public long getOriginalFolderId() {
		return _originalFolderId;
	}

	public String getName() {
		return GetterUtil.getString(_name);
	}

	public void setName(String name) {
		_name = name;

		if (_originalName == null) {
			_originalName = name;
		}
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	public double getVersion() {
		return _version;
	}

	public void setVersion(double version) {
		_version = version;

		if (!_setOriginalVersion) {
			_setOriginalVersion = true;

			_originalVersion = version;
		}
	}

	public double getOriginalVersion() {
		return _originalVersion;
	}

	public int getSize() {
		return _size;
	}

	public void setSize(int size) {
		_size = size;
	}

	public DLFileVersion toEscapedModel() {
		if (isEscapedModel()) {
			return (DLFileVersion)this;
		}
		else {
			DLFileVersion model = new DLFileVersionImpl();

			model.setNew(isNew());
			model.setEscapedModel(true);

			model.setFileVersionId(getFileVersionId());
			model.setGroupId(getGroupId());
			model.setCompanyId(getCompanyId());
			model.setUserId(getUserId());
			model.setUserName(HtmlUtil.escape(getUserName()));
			model.setCreateDate(getCreateDate());
			model.setFolderId(getFolderId());
			model.setName(HtmlUtil.escape(getName()));
			model.setVersion(getVersion());
			model.setSize(getSize());

			model = (DLFileVersion)Proxy.newProxyInstance(DLFileVersion.class.getClassLoader(),
					new Class[] { DLFileVersion.class },
					new ReadOnlyBeanHandler(model));

			return model;
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = new ExpandoBridgeImpl(DLFileVersion.class.getName(),
					getPrimaryKey());
		}

		return _expandoBridge;
	}

	public Object clone() {
		DLFileVersionImpl clone = new DLFileVersionImpl();

		clone.setFileVersionId(getFileVersionId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setFolderId(getFolderId());
		clone.setName(getName());
		clone.setVersion(getVersion());
		clone.setSize(getSize());

		return clone;
	}

	public int compareTo(DLFileVersion dlFileVersion) {
		int value = 0;

		if (getFolderId() < dlFileVersion.getFolderId()) {
			value = -1;
		}
		else if (getFolderId() > dlFileVersion.getFolderId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = getName().compareTo(dlFileVersion.getName());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		if (getVersion() < dlFileVersion.getVersion()) {
			value = -1;
		}
		else if (getVersion() > dlFileVersion.getVersion()) {
			value = 1;
		}
		else {
			value = 0;
		}

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		DLFileVersion dlFileVersion = null;

		try {
			dlFileVersion = (DLFileVersion)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = dlFileVersion.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("{fileVersionId=");
		sb.append(getFileVersionId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", folderId=");
		sb.append(getFolderId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", version=");
		sb.append(getVersion());
		sb.append(", size=");
		sb.append(getSize());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBuilder sb = new StringBuilder();

		sb.append("<model><model-name>");
		sb.append("com.liferay.portlet.documentlibrary.model.DLFileVersion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>fileVersionId</column-name><column-value><![CDATA[");
		sb.append(getFileVersionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>folderId</column-name><column-value><![CDATA[");
		sb.append(getFolderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>version</column-name><column-value><![CDATA[");
		sb.append(getVersion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>size</column-name><column-value><![CDATA[");
		sb.append(getSize());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _fileVersionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private long _folderId;
	private long _originalFolderId;
	private boolean _setOriginalFolderId;
	private String _name;
	private String _originalName;
	private double _version;
	private double _originalVersion;
	private boolean _setOriginalVersion;
	private int _size;
	private transient ExpandoBridge _expandoBridge;
}