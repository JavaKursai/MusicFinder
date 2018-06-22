<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="descprition" content="">
<meta name="keywords" content="">
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<title>GRAMMZ music portal</title>
<link rel="stylesheet" href="Muzik.css">
<link href="<c:url value="/resources/css/Muzik.css" />" rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.1.0/css/all.css"
	integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt"
	crossorigin="anonymous">
</head>
<header>
	<div class="header_box">
		<div>GRAMMZ</div>
		<h5>your everyday music portal</h5>
		<i class="fas fa-music"></i>
	</div>
	<form action="#">
		<input name="Username" type="text" placeholder="Username" required>
		<input type="psw" placeholder="Password" required> <input
			type="submit" value="Register"> <input type="button"
			value="Log in">
	</form>
</header>
<body>

	<div class="parent_body">
		<div class="search">
			<form:form action="sersas" modelAttribute="filtras" method="POST">
				<form:input path="inputText" name="" type="text" placeholder="Search"
					size="37" required /> 
					<form:select path="inputInt" class="selectBox">
                    <form:option value="1">Ieskoti pagal Dainos pavadinimas</form:option>
                    <form:option value="2">Ieskoti pagal Autorius/Grupe</form:option>
            </form:select>
            
             <input type="submit" value="Submit"/>
            </form:form>
		</div>
		<div class="playlist">
			<div>insert playlist here</div>
		</div>
	</div>
</body>
<footer>
	<div>GRAMMZ&nbsp; @ &nbsp;2018</div>
</footer>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/waypoints/4.0.1/jquery.waypoints.min.js"></script>

<script src="testas.js"></script>
<script type="jsCookie.js"></script>
<script src="jquery3.js"></script>
</body>
</html>