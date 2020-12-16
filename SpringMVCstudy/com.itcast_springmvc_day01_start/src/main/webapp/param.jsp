<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/15
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定</title>
</head>
<body>
多个参数
<br>
<!-- 多个参数 -->
<a href="param/testParam1?username=hechuan&&password=123456">传送参数</a>
<br>
<br>
<!--实体类 -->
实体类
<br>
<form action="param/testParam2" method="post">
    用户名:<input type="text" name="username"/><br>
    密码:<input type="text" name="password"/><br>
    金额:<input type="text" name="money"/><br>
    用户名:<input type="text" name="user.username"/><br>
    年龄:<input type="text" name="user.age"/><br>

  <input type="submit" value="提交">
</form>
<br>
<br>

集合
<!--集合类型 -->
<br>
<form action="param/testParam2" method="post">
    用户名:<input type="text" name="username"/><br>
    密码:<input type="text" name="password"/><br>
    金额:<input type="text" name="money"/><br>
    用户名:<input type="text" name="list[0].username"/><br>
    年龄:<input type="text" name="list[0].age"/><br>
    用户名:<input type="text" name="map['one'].username"/><br>
    年龄:<input type="text" name="map['one'].age"/><br>
    <input type="submit" value="提交">
</form>

自定义类型转换器
<!--自定义类型转换器 -->
<form action="param/testParam3" method="post">
    用户名:<input type="text" name="username"/><br>
    年龄:<input type="text" name="age"/><br>
    生日:<input type="text" name="date"/><br>
    <input type="submit" value="提交">
</form>




获取servlet原生api
<br>
<!-- 获取servlet原生api -->
<a href="param/testParam4?username=hechuan&&password=123456">传送参数</a>
<br>
<br>
</body>
</html>
