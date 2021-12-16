<%@ include file="../init.jsp" %>


<liferay-ui:success key="entryAdded" message="entry-added"/>
<liferay-ui:success key="entryUpdated" message="entry-updated"/>
<liferay-ui:success key="entryDeleted" message="entry-deleted"/>

<portlet:renderURL var="addEntryURL">
      <portlet:param name="mvcRenderCommandName" value="/getEntry/itemRequest"/>
      <portlet:param name="entryType" value="add"/>
</portlet:renderURL>
<aui:button-row >
        <aui:button onClick="${addEntryURL}" value="Add Item Request"></aui:button>
</aui:button-row>


<liferay-ui:search-container
        total="<%= ItemRequestLocalServiceUtil.getItemRequestCountByUserId(user.getUserId()) %>" emptyResultsMessage="no-results-were-found" emptyResultsMessageCssClass="taglib-empty-result-message-header">
    <liferay-ui:search-container-results
            results="<%= ItemRequestLocalServiceUtil.getItemRequestsByUserId(user.getUserId(),
            searchContainer.getStart(), searchContainer.getEnd()) %>"/>

    <liferay-ui:search-container-row
            className="com.food.portal.model.ItemRequest" modelVar="itemRequest">

        <liferay-ui:search-container-column-text property="itemName" name="Item Name"/>
        <liferay-ui:search-container-column-text property="quantity" name="Quantity"/>
        <liferay-ui:search-container-column-text property="metric" name="Metric"/>
         <liferay-ui:search-container-column-text property="userName" name="Raised By"/>
        <liferay-ui:search-container-column-status property="status" name="status"/>
        <liferay-ui:search-container-column-date property="createDate" name="Raised On"/>
        <liferay-ui:search-container-column-date property="modifiedDate" name="Modified On"/>

        <%-- <liferay-ui:search-container-column-jsp
                align="right"
                path="/itemrequestportlet/entry_actions.jsp"/> --%>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator markupView="lexicon"/>
</liferay-ui:search-container>