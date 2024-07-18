<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="actionUrl" value="/member/join" />
<h1>회원가입</h1>

<form method="post" action="${actionUrl}">
    <button type="submit">제출</button>
</form>