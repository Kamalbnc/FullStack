<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Description Page</title>
</head>
<body>
<h1>${message}</h1>
<br></br>
<h5><font color="red">${errormsg}</font></h5>

<form action="userDetailShow" method="post">
<table>
<tr><td>Name :</td><td><input type="text" name="name" value="${userlogin.loginName}"/></td></tr>
<tr><td>DOB :</td><td><input type="text" name="dob"/></td></tr>
<tr><td>Hobby :</td><td><input type="text" name="hobby"/></td></tr>
<tr><td>Mobile :</td><td><input type="text" name="mob"/></td></tr>
<tr><td>Skill :</td><td><select name="skill" multiple="multiple">
<option value="JAVA">JAVA</option>
<option value="HADOOP">HADOOP</option>
<option value="SPRING MVC">SPRING MVC</option>
<option value="HIBERNATE">HIBERNATE</option>
</select></td></tr>
<tr><td>Country :<input type="text" name="userDetailAddress.country"/></td>
<td>State :<input type="text" name="userDetailAddress.state"/></td>
<td>City :<input type="text" name="userDetailAddress.city"/></td>
<td>Pin :<input type="text" name="userDetailAddress.pin"/></td>
</tr>

<tr><td><input
			type="submit" value="SubmitDescription"></td></tr>
</table>

</form>
</body>
</html>