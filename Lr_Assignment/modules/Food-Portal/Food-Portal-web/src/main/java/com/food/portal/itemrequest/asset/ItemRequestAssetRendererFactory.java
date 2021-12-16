package com.food.portal.itemrequest.asset;

import com.food.portal.model.ItemRequest;
import com.food.portal.service.ItemRequestLocalService;
import com.food.portal.web.constants.FoodPortalWebPortletKeys;
import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;
import com.liferay.portal.kernel.exception.PortalException;

import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Zeenesh
 *
 */
@Component(
		 immediate = true,
		 property = {"javax.portlet.name="+FoodPortalWebPortletKeys.FOODPORTALWEB},
		 service = AssetRendererFactory.class
		 )
public class ItemRequestAssetRendererFactory extends BaseAssetRendererFactory<ItemRequest>{

	@Reference
	private ItemRequestLocalService itemRequestLocalService;
	
	@Reference
	private ServletContext servletContext;
	
	public ItemRequestAssetRendererFactory() {
		setClassName(ItemRequest.class.getName());
		setCategorizable(true);
        setLinkable(true);
        setPortletId(FoodPortalWebPortletKeys.FOODPORTALWEB);
        setSearchable(true);
         setSelectable(true);
	
	}
	
	
	@Override
	public AssetRenderer<ItemRequest> getAssetRenderer(long classPK, int type) throws PortalException {
		ItemRequest itemRequest= itemRequestLocalService.fetchItemRequest(classPK);
		
		ItemRequestAssetRenderer assetRenderer= new ItemRequestAssetRenderer(itemRequest);
		assetRenderer.setAssetRendererType(type);
		assetRenderer.setServletContext(servletContext);
		
		return assetRenderer;
	}

	@Override
	public String getType() {
		return "itemRequest";
	}

}
