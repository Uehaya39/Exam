<%-- 教科書P102 LIST 07-02  --%>
<%@page contentType="text/html; charset=UTF-8"%>

<%-- カレントディレクトリはJSPのフォルダー（URL）になる  --%>
<%@include file="../header.html"%>

<%--メッセージの出力--%>
<p>Hello!</p>
<p>こんにちは！</p>

<%--Javaプログラムを記述 システム日付を表示 --%>
<p><%=new java.util.Date() %></p>

<%@include file="../footer.html"%>