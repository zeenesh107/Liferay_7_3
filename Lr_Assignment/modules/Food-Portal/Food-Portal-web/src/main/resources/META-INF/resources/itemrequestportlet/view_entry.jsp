<%@ include file="../init.jsp" %>

<h1>View Entry</h1>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
		<aui:form action="">
			<aui:input name="itemName" id="itemName" label="Item Name"  value="${itemRequestEntry.itemName}" readonly="true">
			</aui:input>    
			<aui:input name="quantity" id="quantity" label="Quantity"  value="${itemRequestEntry.quantity}" readonly="true">
			</aui:input>
			<aui:input name="metric" id="metric" label="Metric" value="${itemRequestEntry.metric}" readonly="true">
			</aui:input>
		</aui:form>
		</div>
	</div>
</div>