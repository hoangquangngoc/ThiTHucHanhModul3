<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31/10/2022
  Time: 10:11 AM
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
  <form action="/create">
    <table>
      <tr>
        <td>Nhập id</td>
        <td><input name="id" placeholder="Nhập id"></td>
      </tr>

      <tr>
        <td>Nhập name</td>
        <td><input name="name" placeholder="Nhập name"></td>
      </tr>
      <tr>
        <td>Nhập Năm Sinh</td>
        <td><input name="DateOfBirth" placeholder="Nhập năm Sinh"></td>
      </tr>
      <tr>
        <td>Nhập Địa Chi</td>
        <td><input name="address" placeholder="Nhập Địa Chỉ"></td>
      </tr>
      <tr>
        <td>Nhập Số Điện Thoại </td>
        <td><input name="phoneNumber" placeholder="Nhập Số Điện Thoại"></td>
      </tr>
      <tr>
        <td>Nhập email</td>
        <td><input name="email" placeholder="Nhập email"></td>
      </tr>
      <tr>
        <td>Nhập lớp</td>
        <td><input name="classRoom" placeholder="Nhập lớp"></td>
      </tr>
    </table>
    <button type="submit">Submit</button>
  </form>
</div>
</body>
</html>
