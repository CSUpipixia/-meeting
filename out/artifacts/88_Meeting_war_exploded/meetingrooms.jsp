<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>会议管理系统</title>
</head>
<body>
<jsp:include page="top.jsp"/>
<!-- banner -->
<div class="banner about-banner">
    <div class="header about-header">
        <div th:replace="/common/Common::Header"></div>
    </div>
    <div class="about-heading">
        <div class="container">
            <h2>My Meetings <span style="font-weight:100; font-size: 36px;">我的会议</span></h2>
        </div>
    </div>
</div>
<!-- //banner -->
<div class="blog">
    <!-- container -->
    <div class="container">
        <div class="blog-top-grids">
            <div class="col-md-4 blog-top-right-grid">
                <jsp:include page="leftMenu.jsp"/>
            </div>
            <div class="col-md-8 blog-top-left-grid">
                <ol class="breadcrumb">
                    <li><a href="#">个人中心</a></li>
                    <li><a href="#">查看会议室</a></li>
                </ol>
                <table class="table">
                    <caption>所有会议室:</caption>
                    <tr>
                        <th>门牌编号</th>
                        <th>会议室名称</th>
                        <th>容纳人数</th>
                        <th>当前状态</th>
                        <th>操作</th>
                    </tr>
                    <c:forEach items="${list}" var="mr">
                        <tr>
                            <td>${mr.roomnum}</td>
                            <td>${mr.roomname}</td>
                            <td>${mr.capacity}</td>
                            <td>
                                <c:choose>
                                    <c:when test="${mr.status==0}">启用</c:when>
                                    <c:when test="${mr.status==1}">停用</c:when>
                                </c:choose>
                            </td>
                            <td>
                                <a class="btn btn-success" href="/meeting/roomdetails?roomid=${mr.roomid}">查看</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <!-- //container -->
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
