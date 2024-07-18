<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<c:set var="date" value="<%=new Date()%>" />
<h1>대한민국</h1>
<fmt:setLocale value="ko_kr" />
일시: <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>
금액: <fmt:formatNumber value="10000000" type="currency" /><br>

<h1>프랑스</h1>
<fmt:setLocale value="fr_FR" />
일시: <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>
금액: <fmt:formatNumber value="10000000" type="currency" /><br>

<h1>일본</h1>
<fmt:setLocale value="ja_jp" />
일시: <fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="full" /><br>
금액: <fmt:formatNumber value="10000000" type="currency" /><br>
