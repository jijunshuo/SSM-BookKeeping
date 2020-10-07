<%--
  Created by IntelliJ IDEA.
  User: 吉俊烁
  Date: 2020/10/7
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
<body>
<form action="/" method="post">
    类型:<select id="selType" name="typeId">
    <option value="0">不限</option>
</select>
    时间:从<input type="date" name="billTime1"/> 到<input type="date" name="billTime2"/>
    <input type="submit" value="搜索"/>
    <input type="button" value="记账">
</form>
<table border="1px" width="500px">
    <tr>
        <td>标题</td>
        <td>记账时间</td>
        <td>类别</td>
        <td>金额</td>
        <td>说明</td>
    </tr>
    <c:forEach items="${bills}" var="b">
        <tr>
            <td>${b.title}</td>
            <td><fmt:formatDate value="${b.billTime}" pattern="yyyy-MM-dd" type="both"></fmt:formatDate></td>
            <td></td>
            <td>${b.price}</td>
            <td>${b.explaind}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
<script type="text/javascript">
    $(function () {
        $.post("/selType", function (date) {
            if (date != null) {
                $.each(date, function (i, v) {
                    $("#selType").append("<option value='" + v.id + "'>" + v.name + "</option>")
                })
            }
        }, "json");
    })


</script>
