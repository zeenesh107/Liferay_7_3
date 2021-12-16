<%@ include file="../init.jsp" %>

<portlet:actionURL name="/saveEntry/itemrequest" var="saveEntryUrl" >
	<portlet:param name="requestId" value="${itemRequestEntry.registrationId}"/>
</portlet:actionURL>
<portlet:renderURL var="backUrl">
</portlet:renderURL>
<liferay-ui:error key="errorInEntry" message="entry-error"></liferay-ui:error>

<h1><liferay-ui:icon icon="chevron-left" message="Back" url="${backUrl}"/>
<c:choose>
	<c:when test="${itemRequestEntry ne null}">
		Edit Entry
	</c:when>
	<c:otherwise>
		Add Entry
	</c:otherwise>
</c:choose>
</h1>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
		<aui:form action="${saveEntryUrl}">
			<aui:input name="itemName" id="itemName" label="Item Name"  value="${itemRequestEntry.itemName}">
				<aui:validator name="required" />
				<aui:validator name="minLength">2</aui:validator>
			</aui:input>    
			<aui:input name="quantity" id="quantity" label="Quantity"  value="${itemRequestEntry.quantity}">
				<aui:validator name="required" />
				<aui:validator name="digits" />
				<aui:validator name="minLength">1</aui:validator>
			</aui:input>
			<aui:input name="metric" id="metric" label="Metric" helpMessage="Use metric units like: KG,litter,gram. If no needed pass NA" value="${itemRequestEntry.metric}">
				<aui:validator name="required" />
				<aui:validator name="alpha" />
				<aui:validator name="minLength">1</aui:validator>
			</aui:input>
			<aui:button-row>
				<aui:button type="submit" name="submit" value="Submit"></aui:button>
				<aui:button type="cancel" onClick="${backUrl}"></aui:button>
			</aui:button-row>
		</aui:form>
		</div>
	</div>
</div>