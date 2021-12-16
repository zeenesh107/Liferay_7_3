<%@include file="../init.jsp"%>

<%
    String mvcPath = ParamUtil.getString(request, "mvcPath");

    ResultRow row = (ResultRow) request
                    .getAttribute("SEARCH_CONTAINER_RESULT_ROW");

    ItemRequest entry = (ItemRequest) row.getObject();
%>

<liferay-ui:icon-menu>

    <portlet:renderURL var="editURL">
        <portlet:param name="requestId"
            value="<%=String.valueOf(entry.getRequestId()) %>" />
        <portlet:param name="mvcRenderCommandName" value="/getEntry/itemRequest" />
        <portlet:param name="entryType" value="edit"/>
    </portlet:renderURL>

    <liferay-ui:icon image="edit" message="Edit"
            url="${editURL}" />

    <%-- <portlet:actionURL name="/registration/deleteEntry" var="deleteURL">
            <portlet:param name="entryId"
                value="<%=String.valueOf(entry.getRegistrationId())%>" />
    </portlet:actionURL>

    <liferay-ui:icon image="delete" message="Delete" url="${deleteURL}" />
 --%>
</liferay-ui:icon-menu>