<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>
<h2>ユーザー情報登録</h2>
<form action="<%= request.getContextPath() %>/user/submit" method="post">
    名前: <input type="text" name="name" value="${userForm.name}"><br>
    E-mail: <input type="text" name="email" value="${userForm.email}"><br>
    パスワード: <input type="text" name="password" value="${userForm.password}"><br>
    <input type="submit" value="登録">
</form>
</body>
</html>
