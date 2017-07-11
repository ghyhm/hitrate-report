<!DOCTYPE html>
<html lang="en-US">
<head>
<meta charset="UTF-8" />
<title>Hitrate Catalog</title>
</head>
<body ng-app="myApp">
	<div ng-controller="HitrateController as hitrateCtrl">
		<h1 class="page-header">Hit Rate Report</h1>
		<form name="hitrateForm">
			<div ng-view></div>
		</form>
	</div>

	<script
		src="${pageContext.request.contextPath}/app-resources/js/lib/angular.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/app-resources/js/lib/angular-resource.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/app-resources/js/lib/angular-aria.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/app-resources/js/lib/angular-route.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/app-resources/js/app.js"></script>
	<script
		src="${pageContext.request.contextPath}/app-resources/js/controller/hitrate_controller.js"></script>
	<script
		src="${pageContext.request.contextPath}/app-resources/js/service/hitrate_service.js"></script>
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/app-resources/css/style.css" />
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/app-resources/css/sb-admin-2.css" />
</body>
</html>
