<%--
  Created by IntelliJ IDEA.
  User: itou86
  Date: 2021/6/22
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改信息</title>
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
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="hidden" name="bookId" value="${book.id}"/>
        书籍名称：<input class="form-control" type="text" name="bookName" value="${book.bookName}"/><br><br><br>
        书籍数量：<input class="form-control" type="text" name="bookCounts" value="${book.bookCounts}"/><br><br><br>
        书籍详情：<input class="form-control" type="text" name="bookDetail" value="${book.bookDetail}"/><br><br><br>
        <input class="btn btn-primary" type="submit" value="提交"/>
    </form>
</div>
</body>
</html>
