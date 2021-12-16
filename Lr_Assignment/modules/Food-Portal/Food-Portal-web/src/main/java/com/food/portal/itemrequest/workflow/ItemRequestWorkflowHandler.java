package com.food.portal.itemrequest.workflow;

import com.food.portal.model.ItemRequest;
import com.food.portal.service.ItemRequestLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ResourceActions;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandler;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Zeenesh
 *
 */
@Component(immediate = true, service = WorkflowHandler.class)
public class ItemRequestWorkflowHandler extends BaseWorkflowHandler<ItemRequest> {

	@Override
	public String getClassName() {
		return ItemRequest.class.getName();
	}

	@Override
	public String getType(Locale locale) {
		return _resourceActions.getModelResource(locale, getClassName());
	}

	@Override
	public ItemRequest updateStatus(int status, Map<String, Serializable> workflowContext) throws PortalException {
		long userId = GetterUtil.getLong((String) workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
	    long resourcePrimKey =GetterUtil.getLong((String)workflowContext.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));
	    ServiceContext serviceContext =(ServiceContext) workflowContext.get("serviceContext");

	    return _itemRequestLocalService.updateStatus(userId, resourcePrimKey, status, serviceContext);
	}
	
	
	@Reference
	private ItemRequestLocalService _itemRequestLocalService;

	
	@Reference
	private ResourceActions _resourceActions;

}
