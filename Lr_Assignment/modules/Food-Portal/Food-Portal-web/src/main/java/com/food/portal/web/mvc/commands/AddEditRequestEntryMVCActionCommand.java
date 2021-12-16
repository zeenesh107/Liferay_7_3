package com.food.portal.web.mvc.commands;

import com.food.portal.model.ItemRequest;
import com.food.portal.service.ItemRequestLocalService;
import com.food.portal.web.constants.FoodPortalWebPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Zeenesh
 *
 */
@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name="+ FoodPortalWebPortletKeys.FOODPORTALWEB,
	        "mvc.command.name=/saveEntry/itemrequest"
	    },
	    service = MVCActionCommand.class
	)
public class AddEditRequestEntryMVCActionCommand extends BaseMVCActionCommand{

	private static final Log log = LogFactoryUtil.getLog(AddEditRequestEntryMVCActionCommand.class);
	
	@Reference
	private ItemRequestLocalService itemRequestLocalService;
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		ServiceContext serviceContext = ServiceContextFactory.getInstance(ItemRequest.class.getName(), actionRequest);
		long userId = themeDisplay.getUserId();
		
		long requestId= ParamUtil.getLong(actionRequest,"requestId");
		String itemName=ParamUtil.getString(actionRequest,"itemName");
		int quantity=ParamUtil.getInteger(actionRequest,"quantity");
		String metric=ParamUtil.getString(actionRequest,"metric");
		try {
			if(Validator.isNotNull(requestId)&& requestId>0) {
				log.info("Updating an Item request for::"+requestId);
				itemRequestLocalService.updateItemRequest(userId, requestId, itemName, quantity, metric, serviceContext);
				 SessionMessages.add(actionRequest, "entryUpdated");
			}else {
				log.info("Adding an Item request of::"+itemName+"::Quantity::"+quantity+"::metric::"+metric);
				itemRequestLocalService.addItemRequest(userId, itemName, quantity, metric, serviceContext);
				 SessionMessages.add(actionRequest, "entryAdded");
			}
			
		}catch(Exception e) {
			log.error("Error while adding/updating Item Request entry::",e);
			SessionErrors.add(actionRequest,"errorInEntry");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			PortalUtil.copyRequestParameters(actionRequest, actionResponse);
			actionResponse.setRenderParameter("mvcPath", "/itemrequestportlet/edit_entry.jsp");
			
		}
		
		
	}

}
