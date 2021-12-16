package com.food.portal.itemrequest.asset;

import com.food.portal.model.ItemRequest;
import com.food.portal.web.constants.FoodPortalWebPortletKeys;
import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Zeenesh
 *
 */
public class ItemRequestAssetRenderer extends BaseJSPAssetRenderer<ItemRequest>{

	private final ItemRequest itemRequest;
	
	public ItemRequestAssetRenderer(ItemRequest itemRequest) {
		this.itemRequest=itemRequest;
	
	}
	
	@Override
	public ItemRequest getAssetObject() {
		return itemRequest;
	}

	@Override
	public long getGroupId() {
		return itemRequest.getGroupId();
	}

	@Override
	public long getUserId() {
		return itemRequest.getUserId();
	}

	@Override
	public String getUserName() {
		return itemRequest.getUserName();
	}

	@Override
	public String getUuid() {
		return itemRequest.getUuid();
	}

	@Override
	public String getClassName() {
		return ItemRequest.class.getName();
	}

	@Override
	public long getClassPK() {
		return itemRequest.getRequestId();
	}

	@Override
	public String getTitle(Locale locale) {
		return itemRequest.getItemName();
	}

	@Override
	public String getJspPath(HttpServletRequest httpServletRequest, String template) {
		 if (template.equals(TEMPLATE_FULL_CONTENT)) {
			 httpServletRequest.setAttribute("itemRequestEntry", itemRequest);
	            return "/itemrequestportlet/view_entry.jsp";
	        } else {
	            return null;
	        }
	}

	@Override
	public String getSummary(PortletRequest portletRequest, PortletResponse portletResponse) {
		return "Item Name: "+itemRequest.getItemName()+" Quantity:"+itemRequest.getQuantity()+" Metric:"+itemRequest.getMetric();
	}
	
	@Override
	public PortletURL getURLEdit(LiferayPortletRequest liferayPortletRequest,
			LiferayPortletResponse liferayPortletResponse) throws Exception {
		PortletURL portletURL = liferayPortletResponse.createLiferayPortletURL(
	            getControlPanelPlid(liferayPortletRequest), FoodPortalWebPortletKeys.FOODPORTALWEB,
	            PortletRequest.RENDER_PHASE);
	        portletURL.setParameter("mvcRenderCommandName", "/getEntry/itemRequest");
	        portletURL.setParameter("requestId", String.valueOf(itemRequest.getRequestId()));
	        portletURL.setParameter("entryType", "edit");
	        
	        return portletURL;
	}
	
	@Override
	public String getURLView(LiferayPortletResponse liferayPortletResponse, WindowState windowState) throws Exception {
		return super.getURLView(liferayPortletResponse, windowState);
	}
	
	

}
