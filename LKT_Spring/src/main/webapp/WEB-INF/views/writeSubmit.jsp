<%--
  Created by IntelliJ IDEA.
  User: LKT
  Date: 2015-08-02
  Time: 오후 8:40
  To change this template use File | Settings | File Templates.
--%>
<!-- writeSubmit.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>WriteSubmit</title>
</head>
<body>
<%  %>
${naming}
<input type="text" name="name" placeholder="폰 이름" required="required" readonly="readonly" size="50" value="${phoneDTO.name}"><br>
<input type="text" name="manufacturer" placeholder="폰 제조사" required="required" readonly="readonly" size="50" value="${phoneDTO.manufacturer}"><br>
<input type="text" name="price" placeholder="폰 가격" required="required" readonly="readonly" size="50" value="${phoneDTO.price}"><br>
</body>
</html>