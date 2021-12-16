package com.food.portal.web.portlet;

import com.food.portal.web.constants.FoodPortalWebPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Zeenesh
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=FoodPortalWeb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/itemrequestportlet/view.jsp",
		"javax.portlet.name=" + FoodPortalWebPortletKeys.FOODPORTALWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FoodPortalWebPortlet extends MVCPortlet {
}