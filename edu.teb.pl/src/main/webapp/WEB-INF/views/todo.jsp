<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<body>
	<div class="container">
		<h1>Add Todo</h1>
		<form:form method="post" commandName="todo">

			<form:hidden path="id"/>
			
			<fieldset class="form-group">
				<form:label path="desc">Description</form:label>
				<form:input path="desc" type="text" class="form-control" required="required"/>
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="targetDate">Target Date</form:label>
				<form:input path="targetDate" type="text" class="form-control" required="required"/>
			</fieldset>

			<input class="btn btn-success" type="submit" value="Submit" />
		</form:form>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
<%@ include file="common/footer.jspf"%>