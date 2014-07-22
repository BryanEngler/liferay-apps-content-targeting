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

package com.liferay.contenttargeting.reports.campaigntrackingaction.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CampaignTrackingActionService}.
 *
 * @author Brian Wing Shun Chan
 * @see CampaignTrackingActionService
 * @generated
 */
@ProviderType
public class CampaignTrackingActionServiceWrapper
	implements CampaignTrackingActionService,
		ServiceWrapper<CampaignTrackingActionService> {
	public CampaignTrackingActionServiceWrapper(
		CampaignTrackingActionService campaignTrackingActionService) {
		_campaignTrackingActionService = campaignTrackingActionService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _campaignTrackingActionService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_campaignTrackingActionService.setBeanIdentifier(beanIdentifier);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CampaignTrackingActionService getWrappedCampaignTrackingActionService() {
		return _campaignTrackingActionService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCampaignTrackingActionService(
		CampaignTrackingActionService campaignTrackingActionService) {
		_campaignTrackingActionService = campaignTrackingActionService;
	}

	@Override
	public CampaignTrackingActionService getWrappedService() {
		return _campaignTrackingActionService;
	}

	@Override
	public void setWrappedService(
		CampaignTrackingActionService campaignTrackingActionService) {
		_campaignTrackingActionService = campaignTrackingActionService;
	}

	private CampaignTrackingActionService _campaignTrackingActionService;
}