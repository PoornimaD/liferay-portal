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

package com.liferay.portal.security.wedeploy.auth.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.security.wedeploy.auth.model.WeDeployAuthToken;
import com.liferay.portal.security.wedeploy.auth.service.WeDeployAuthTokenLocalServiceUtil;

/**
 * The extended model base implementation for the WeDeployAuthToken service. Represents a row in the &quot;WeDeployAuth_WeDeployAuthToken&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WeDeployAuthTokenImpl}.
 * </p>
 *
 * @author Supritha Sundaram
 * @see WeDeployAuthTokenImpl
 * @see WeDeployAuthToken
 * @generated
 */
@ProviderType
public abstract class WeDeployAuthTokenBaseImpl
	extends WeDeployAuthTokenModelImpl implements WeDeployAuthToken {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a we deploy auth token model instance should use the {@link WeDeployAuthToken} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			WeDeployAuthTokenLocalServiceUtil.addWeDeployAuthToken(this);
		}
		else {
			WeDeployAuthTokenLocalServiceUtil.updateWeDeployAuthToken(this);
		}
	}
}