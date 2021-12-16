package com.food.portal.web.mvc.commands;

import com.food.portal.model.ItemRequest;
import com.food.portal.service.ItemRequestLocalService;
import com.food.portal.web.constants.FoodPortalWebPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Zeenesh
 *
 */
@Component(
	    immediate = true,
	    property = {
	    		"javax.portlet.name="+FoodPortalWebPortletKeys.FOODPORTALWEB,
	       "mvc.command.name=/getEntry/itemRequest"
	    },
	    service = MVCRenderCommand.class
	)
public class AddEditRequestEntryMVCRenderCommand implements MVCRenderCommand{
	
	private static final Log log = LogFactoryUtil.getLog(AddEditRequestEntryMVCRenderCommand.class);

	@Reference
	private ItemRequestLocalService itemRequestLocalService;
	
	
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		long requestId= ParamUtil.getLong(renderRequest,"requestId");
		String entryType=ParamUtil.getString(renderRequest,"entryType");
		log.info("Fetching RequestItem for::"+requestId);
		if(Validator.isNotNull(requestId)&& requestId>0) {
			ItemRequest itemRequest=itemRequestLocalService.fetchItemRequest(requestId);
			if(Validator.isNotNull(itemRequest)) {
				renderRequest.setAttribute("itemRequestEntry",itemRequest);
			}
		}
		String redirectPage=(Validator.isNotNull(entryType)&& "view".equalsIgnoreCase(entryType)?"/itemrequestportlet/view_entry.jsp":"/itemrequestportlet/edit_entry.jsp");
		return redirectPage;
	}

}
