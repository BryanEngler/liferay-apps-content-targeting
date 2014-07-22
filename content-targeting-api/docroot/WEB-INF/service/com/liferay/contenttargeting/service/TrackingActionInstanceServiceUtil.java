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

package com.liferay.contenttargeting.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for TrackingActionInstance. This utility wraps
 * {@link com.liferay.contenttargeting.service.impl.TrackingActionInstanceServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see TrackingActionInstanceService
 * @see com.liferay.contenttargeting.service.base.TrackingActionInstanceServiceBaseImpl
 * @see com.liferay.contenttargeting.service.impl.TrackingActionInstanceServiceImpl
 * @generated
 */
@ProviderType
public class TrackingActionInstanceServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.contenttargeting.service.impl.TrackingActionInstanceServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	/**
	* NOTE FOR DEVELOPERS:
	*
	* Never reference this interface directly. Always use {@link com.liferay.contenttargeting.service.TrackingActionInstanceServiceUtil} to access the tracking action instance remote service.
	*/
	public static com.liferay.contenttargeting.model.TrackingActionInstance addTrackingActionInstance(
		long userId, java.lang.String trackingActionKey, long campaignId,
		java.lang.String alias, java.lang.String referrerClassName,
		long referrerClassPK, java.lang.String elementId,
		java.lang.String eventType, java.lang.String typeSettings,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addTrackingActionInstance(userId, trackingActionKey,
			campaignId, alias, referrerClassName, referrerClassPK, elementId,
			eventType, typeSettings, serviceContext);
	}

	public static com.liferay.contenttargeting.model.TrackingActionInstance deleteTrackingActionInstance(
		long trackingActionInstanceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteTrackingActionInstance(trackingActionInstanceId);
	}

	public static java.util.List<com.liferay.contenttargeting.model.TrackingActionInstance> getTrackingActionInstances(
		long campaignId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTrackingActionInstances(campaignId);
	}

	public static int getTrackingActionInstancesCount(long campaignId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTrackingActionInstancesCount(campaignId);
	}

	public static com.liferay.contenttargeting.model.TrackingActionInstance updateTrackingActionInstance(
		long trackingActionInstanceId, java.lang.String alias,
		java.lang.String referrerClassName, long referrerClassPK,
		java.lang.String elementId, java.lang.String eventType,
		java.lang.String typeSettings,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateTrackingActionInstance(trackingActionInstanceId,
			alias, referrerClassName, referrerClassPK, elementId, eventType,
			typeSettings, serviceContext);
	}

	public static TrackingActionInstanceService getService() {
		if (_service == null) {
			_service = (TrackingActionInstanceService)PortalBeanLocatorUtil.locate(TrackingActionInstanceService.class.getName());

			ReferenceRegistry.registerReference(TrackingActionInstanceServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(TrackingActionInstanceService service) {
	}

	private static TrackingActionInstanceService _service;
}