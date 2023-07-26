<%--
  User: wpf
  Date: 2020/9/18
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <script type="text/javascript">

    </script>
    <style>
        .userName {
            width: 300px;
        }

        input[type=password] {
            width: 300px;
        }

        input[name=identifyCode] {
            width: 150px;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="wrap">
        <header><em>Logo</em><span>╳╳╳技术有限公司</span></header>
        <article>
            <section>
                <aside>
                    <em>
                        <img src="img/user.png">
                    </em>
                    <form action="Login" method="post">
                        <p class="name">
                            <i class="lay_font">&#xe66f;</i>
                            <input type="text" name="username" class="userName" placeholder="请输入用户名"onblur="givePwd()">
                        </p>
                        <p class="password">
                            <i class="lay_font">&#xe673;</i>
                            <input type="password" name="password" id="password" class="pwd" placeholder="请输入密码">
                        </p>
                        <p class="password">
                            <i class="lay_font">&#xe679;</i>
                            <input type="text" name="identifyCode" class="pwd" placeholder="请输入验证码">
                            <img src="IdentifyCodeServlet" alt="" title="点击可刷新" width="120px" class="identifyImage" onclick="refresh(this)">
                        </p>
                        <p class="warning">${identifyCodeWrong}${passwordAndUsernameWrong}</p>
                        <button>登录</button>
                        <p class="remember"><input type="checkbox" name="remember">记住密码</p>
                        <p class="regist"><span>没有账号?</span><a href="regist.html">立即注册</a></p>
                        <div class="clear"></div>
                    </form>
                </aside>
                <script>
                    function refresh(img) {
                        //浏览器重新加载图片资源地址的原理：图片的src的值必须改变，每一次的值不一样浏览器就会重新加载达到刷新的目的
                        img.src = "IdentifyCodeServlet?" + new Date().getTime();
                    }

                    /*
                    得到指定cookie的值
                     */
                    function getCookie(cname) {
                        var name = cname + "=";
                        var ca = document.cookie.split(';');
                        for (var i = 0; i < ca.length; i++) {
                            var c = ca[i];
                            while (c.charAt(0) == ' ') {
                                c = c.substring(1);
                            }
                            if (c.indexOf(name) == 0) {
                                return c.substring(name.length, c.length);
                            }
                        }
                        return "";
                    }

                    function givePwd() {
                        let username = getCookie("username");
                        let password = getCookie("password");

                        if (username && password) {
                            let pwdInput = document.getElementById("password");
                            pwdInput.value = password;
                        }
                    }

                </script>
            </section>
        </article>
        <footer>
            <ul>
                <li><a href="#">联系我们</a></li>
                <li><a href="#">关于我们</a></li>
                <li><a href="#">人才招聘</a></li>
                <li><a href="#">友情链接</a></li>
                <li><a href="#">公司地址</a></li>
                <li><a href="#">关注我们</a></li>
            </ul>
            <p>本网站版权归╳╳╳技术有限公司所有，未经许可，不得转载。</p>
        </footer>
    </div>
</div>

</body>
</html>
