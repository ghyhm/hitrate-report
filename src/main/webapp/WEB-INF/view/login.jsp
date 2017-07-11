<!DOCTYPE html>
<html lang="en-US">
<head>
<meta charset="UTF-8" />
<title>Login</title>
</head>
<body ng-app="myApp">
	<div ng-controller="LoginController as loginCtrl">
		<h1 class="page-header">Login</h1>
		<form name="loginForm" method="post">
			<table>
				<tr>
					<td>Username:</td>
					<td><input type="text" name="name" ng-model="loginCtrl.user.name" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="text" name="password" ng-model="loginCtrl.user.password" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Login" />
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>