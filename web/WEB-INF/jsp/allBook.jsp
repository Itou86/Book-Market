<%--
  Created by IntelliJ IDEA.
  User: itou86
  Date: 2021/6/19
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>书籍列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表 —— 显示所有书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" name="selectBookByName"
               href="${pageContext.request.contextPath}/book/toAddBook">新增书籍</a>
        </div>
        <div class="col-md-4 column"></div>
        <div class="col-md-4 column">
            <a class="btn btn-primary" name="allBook"
               href="${pageContext.request.contextPath}/book/allBook">返回全部书籍</a>
            <form class="form-inline" style="float: right"
                  action="${pageContext.request.contextPath}/book/selectBookByBookName" method="post">
                <input class="form-control" type="text" name="bookName" placeholder="请输入书名">
                <input class="btn btn-primary" type="submit" value="查询">
            </form>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名字</th>
                    <th>书籍数量</th>
                    <th>书籍详情</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${list}" var="book">
                    <tr>
                        <td>${book.id}</td>
                        <td>${book.bookName}</td>
                        <td>${book.bookCounts}</td>
                        <td>${book.bookDetail}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.id}">更改</a>
                            |
                            <a href="${pageContext.request.contextPath}/book/deleteBook?id=${book.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
