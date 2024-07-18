<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="num1" value="100" />
<c:set var="num1" value="200" scope="reaquset"/>
<c:set var="num1" value="300" scope=""/>
pageScope.num1 : ${pageScpe.num1}<br>
requestScope.num1 :${requestScope.num1}<br>
sessionScope.num1 ${sessionScope.num1}<br>
