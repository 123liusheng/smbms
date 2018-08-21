<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录用户</title>
</head>
<body>
			<form action="login" method="post"  >
						<table  style="text-align: center;  margin: 0px   auto;   "  >
								<tr>
										<td>用户名</td>
										<td><input type = "text"    name = "userName"   ></td>
								</tr>
								<tr>
										<td>密码</td>
										<td><input  type = "password"   name = "userPassword" ></td>
								</tr>
								<tr>
										<td  colspan="2"   style="text-align: center;"   > <input  type = "submit"  value = "登录"  > </td>
								</tr>
						</table>
			</form>
</body>
</html>