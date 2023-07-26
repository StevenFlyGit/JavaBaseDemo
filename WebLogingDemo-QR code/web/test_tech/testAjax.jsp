<%--
  User: wpf
  Date: 2020/9/21
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试Ajax</title>
    <style>
        table{
            margin: auto 0;
        }
        #showUsers{
            height: 300px;
            width: 800px;
            border: 1px solid black;
            margin: auto 0;
        }
        table{
            margin: auto;
        }
    </style>
</head>
<body>
    <div>
        <table>
            <caption>
                <button id="findButton">点击查询所有用户名</button>
            </caption>
            <tr>
                <td>
                    <div id="showUsers"></div>
                </td>
            </tr>
        </table>
    </div>
    <script>
        let ajax; //1.创建ajax引擎对象
        if (window.XMLHttpRequest) { //火狐浏览器
            ajax = new XMLHttpRequest();
        } else if (window.ActiveXObject) { //IE浏览器
            ajax = new ActiveXObject("Msxml2.XMLHTTP"); //固定写法
        }

        /*
        复写onreadystatement函数
        该函数会监听ajax对象的readyState属性值的变化
        一共有0-5个值，从对象被创建到最终接收到服务器的响应，会从0变化到5
         */
        ajax.onreadystatechange = function() {
            //判断Ajax对象的readyState属性值
            if (ajax.readyState === 4) {
                //判断响应状态码
                //根据Id获取元素对象
                let allUser = document.getElementById("showUsers");
                if (ajax.status === 200) {
                    //获取响应内容
                    allUser.innerHTML = ajax.responseText;
                } else if (ajax.status === 404) { //相应状态码为404
                    allUser.innerHTML = "找不到用户";
                } else if (ajax.status === 500) { //相应状态码为500
                    allUser.innerHTML = "服务器正忙";
                }
            }
        }
        document.getElementById("findButton").onclick = function findUsers() {
            //绑定点击事件发送ajax请求
            ajax.open("get", "${pageContext.request.contextPath}/Ajax");
            ajax.send(null);
        }

    </script>

</body>
</html>
