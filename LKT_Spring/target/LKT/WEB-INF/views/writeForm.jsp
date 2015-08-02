<%--
  Created by IntelliJ IDEA.
  User: LKT
  Date: 2015-08-02
  Time: 오후 8:42
  To change this template use File | Settings | File Templates.
--%>



<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>WriteForm</title>
</head>
<body>
<form action="write" method="post">
  <input type="text" name="name" placeholder="폰 이름" required="required" size="50"><br>
  <input type="text" name="manufacturer" placeholder="폰 제조사" required="required" size="50"><br>
  <input type="text" name="price" placeholder="폰 가격" required="required" size="50"><br>
  <input type="submit" value="작성"><input type="reset" value="취소">
</form>
</body>
</html>

