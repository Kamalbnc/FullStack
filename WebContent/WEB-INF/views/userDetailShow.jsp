<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Description Page</title>
</head>
<body>
<h1>${message}</h1>
<form action="userDetailShow" method="post">
<table border="1">
          
			<tr>
				<td>Name :${userDetail.name}</td>
			</tr>
			<tr><td>DOB :${userDetail.dob}</td></tr>
<tr><td>Hobby :${userDetail.hobby}</td></tr>
<tr><td>Mobile :${userDetail.mob}</td></tr>
<tr><td>Skill :${userDetail.skill}</td></tr>
<tr><td>Country :${userDetail.userDetailAddress.country}
State :${userDetail.userDetailAddress.state}
City :${userDetail.userDetailAddress.city}
Pin :${userDetail.userDetailAddress.pin}</td>
</tr>


</table>

</form>
</body>
</html>