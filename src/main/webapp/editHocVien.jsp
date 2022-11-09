<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31/10/2022
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<div align="center">
  <form action="/edit" method="post">
    <table>
      <tr>
        <td>Nhập id</td>
        <td><input name="id" value="${h.getId()}"></td>
      </tr>
      <tr>
        <td>Nhập name</td>
        <td><input name="name" value="${h.getName()}"></td>
      </tr>
      <tr>
        <td>Nhập năm Sinh</td>
        <td><input name="DateOfBirth" value="${h.getDateOfBirth()}"></td>
      </tr>
      <tr>
        <td>Nhập Địa Chỉ</td>
        <td><input name="address" value="${h.getAddress()}"></td>
      </tr>
      <tr>
        <td>Nhập Số Điện Thoại</td>
        <td><input name="phoneNumber" value="${h.getPhoneNumber()}"></td>
      </tr>
      <tr>
        <td>Nhập Email</td>
        <td><input name="email" value="${h.getEmail()}"></td>
      </tr>
      <tr>
        <td>Nhập Tên Lớp</td>
        <td><input name="classRoom" value="${h.getClassRoom()}"></td>
      </tr>
    </table>
    <button type="submit">Submit</button>
  </form>
</div>
</body>
</html>
