<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31/10/2022
  Time: 8:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">


    <a type="button"class="btn btn-success" href="createHocVien.jsp">Create</a>
    <div class="col-md-6">
        <div class="header-search">
            <form class="d-flex" action="search" method="post">
                <input name="txt" class="input" type="text"
                       placeholder="Nội dung tìm kiếm" aria-label="Search">
                <button class="search-btn" type="submit">Tìm</button>
            </form>
        </div>
    </div>
    <table class="table table-dark table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>DateOfBirth</th>
            <th>Address</th>
            <th>PhoneNumber</th>
            <th>Email</th>
            <th>ClassRoom</th>
            <th>EDIT</th>
            <th>DELETE</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${hocviens}" var="hv">
            <tr>
                <td>${hv.id}</td>
                <td>${hv.name}</td>
                <td>${hv.getDateOfBirth()}</td>
                <td>${hv.address}</td>
                <td>${hv.phoneNumber}</td>
                <td>${hv.email}</td>
                <td>${hv.classRoom}</td>
                <td><a type="button" class="btn btn-warning" href="/edit?id=${hv.id}">Edit</a> </td>
                <td><a type="button" class="btn btn-danger" href="/delete?id=${hv.id}">Delete</a> </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
</body>
</html>
