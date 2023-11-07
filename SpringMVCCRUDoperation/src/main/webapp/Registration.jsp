<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
  <form action="" method="post">
  Name:<input type="text" name="sname"><br>
  Age:<input type="text" name="sage"><br>
  Address:<textarea rows="5" cols="30" name="saddress"></textarea>
  Course:<select name="scourse">
    <option value="B.com">B.com</option>
    <option value="M.com">M.com</option>
    <option value="B.E">B.E</option>
    <option value="M.E">M.E</option>
  </select>
  <input type="submit" value="Register">
  <input type="reset" value="clear">
  </form>

</body>
</html>