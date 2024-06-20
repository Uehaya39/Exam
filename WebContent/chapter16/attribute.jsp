<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<!--bean.Productをインポート  -->
<%@page import="bean.Product" %>

<!-- Product型のオブジェクトをgetAttribute（）メソッドを使ってサーブレットからデータを受け取る -->
<% Product p=(Product)request.getAttribute("product"); %>
<%=p.getId() %>：<%=p.getName() %>：<%=p.getPrice() %><br>

<%@include file="../footer.html" %>

