<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>

<script type="text/javascript">

$( document ).ready(function() {
    $("#abc").append("Hello Rakesh");
    $("#abc").click(function(){
        $(this).hide();
    });
});
</script>
<title>Insert title here</title>
</head>
<body>
<h1 id="abc" class="">Home Jsp Page</h1>
</body>
</html>