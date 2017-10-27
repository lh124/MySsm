<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("UTF-8");
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
	String login_url = basePath + "loginForm.action" ;
%>
<html>
<head>
<base href="<%=basePath%>" />
<title>WEB开发</title>
</head>
<body> 
<h1>
	<c:if test="${error == org.apache.shiro.authc.UnknownAccountException }">
		登录帐号错误！
	</c:if>
</h1> 
<form action="<%=login_url%>" method="post">
	<p>用户名：<input type="text" name="mid" id="mid"/><br/></p>
	<p>密&nbsp;码：<input type="password" name="password" id="password"/><br/></p>
	<p>验证码：<input type="text" name="code" id="code"><img src="image.jsp" style="width: 60px;height: 30px;text-align: center;"><br/></p>
	<p><input type="checkbox" name="rememberme" value="true">下次免登录<br/></p>
	<p><input type="submit" value="登录"/></p>
</form>
</body>
</html>