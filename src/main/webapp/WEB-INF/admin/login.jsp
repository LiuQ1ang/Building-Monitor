<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>楼宇防火监测系统登陆页面</title>

<!--- CSS --->
<link rel="stylesheet" href="css/style.css" type="text/css" />

<link rel="icon" href="images/bm.ico" type="image/x-icon">
<link rel="shortcut icon" href="images/bm.ico" type="image/x-icon">

</head>
<body>
	<div id="container">
		<form action="login" method="post">
			<div class="login">楼宇防火监测系统登陆</div>
			<div class="username-text">用户名:</div>
			<div class="password-text">密码:</div>
			<div class="username-field">
				<input type="text" name="username" value="" />
			</div>
			<div class="password-field">
				<input type="password" name="password" value="" />
			</div>
			<input type="checkbox" name="remember-me" id="remember-me" /><label
				for="remember-me">Remember me</label>
			<div class="forgot-usr-pwd">
				Forgot <a href="#">username</a> or <a href="#">password</a>?
			</div>
			<input type="submit" name="submit" value="GO" />
		</form>
	</div>
	<div id="footer">
		Copyright &copy; 2014.HUST CA. All rights reserved.
	</div>
</body>
</body>
</html>
