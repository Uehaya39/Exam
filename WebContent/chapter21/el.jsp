<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<!-- EL式で書かれたソース -->
<p> ID:${product.id}<br>
  NAME:${product.name}<br>
 PRICE:${product.price}</p>

<%@include file="../footer.html" %>