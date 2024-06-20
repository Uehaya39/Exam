<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>

<p>お名前を入力してください。</p>
<form action="greeting-out.jsp" method="post">
<!-- フォームを使って値を入力させる -->
<!-- action:submit(ボタンを押下)された時の実行されるプログラム -->

<input type="text" name="user">
<input type="submit" value="確定">
</form>

<%@include file="../footer.html" %>
