<%--
  User: wpf
  Date: 2020/9/18
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link rel="stylesheet" type="text/css" href="css/简单通用文章系统后台管理模板/admin_login.css">
</head>
<body>
<div class="admin_login_wrap">
    <h1>后台管理${pageContext.request.contextPath }</h1>
    <div class="adming_login_border">
        <div class="admin_input">
            <form action="${pageContext.request.contextPath }/Login" method="post">
                <ul class="admin_items">
                    <li>
                        <label for="user">用户名：</label>
                        <input type="text" name="username" value="admin" id="user" size="40" class="admin_input_style"/>
                    </li>
                    <li>
                        <label for="pwd">密码：</label>
                        <input type="password" name="password" value="123456" id="pwd" size="40"
                               class="admin_input_style"/>
                    </li>
                    <li>
                        <input type="submit" tabindex="3" value="提交" class="btn btn-primary"/>
                    </li>
                </ul>
            </form>
        </div>
    </div>
    <p class="admin_copyright">
        <a tabindex="5" href="#" target="_blank">返回首页</a> &copy; 2014 Powered by 更多模板：
        <a href="http://www.lmonkey.com/" target="_blank">学习猿地</a>
    </p>
</div>
</body>
</html>
