<%@ page contentType="text/html; charset=UTF-8" %>
<%
    Cookie cookie = new Cookie("key2", "value2");
    cookie.setMaxAge(60 * 60 * 24 * 7); //일주일 초 시간
    response.addCookie(cookie);
%>