<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
</head>
	<body>
	<header>
		<div class="header_box">
			<div>GRAMMZ</div>
			<h5>your everyday music portal</h5>
			<i class="fas fa-music"></i>
		</div>
		<form action="#">
			<input name="Username" type="text" placeholder="Username" required>
			<input type="psw" placeholder="Password" required>
			<input type="submit" value="Register">
			<input type="button" value="Log in">
		</form>
	</header>

		<div class="parent_body">
			<div class="search">
				<form:form action="sersas" modelAttribute="filtras" method="POST">
             <form:label path="inputText">jhhh</form:label>
            <form:input path="inputText" /> <br><br>
            
            <form:select path="inputInt" class="selectBox">
                    <form:option value="1">Ieskoti pagal Dainos pavadinimas</form:option>
                    <form:option value="2">Ieskoti pagal Autorius/Grupe</form:option>
            </form:select>
            
            
             <input type="submit" value="Submit"/>
            </form:form>
            <c:if test="${not empty musuDainos}">
        
	        <table border="1">
			  <tr>
			    <th>Atlikejas</th>
			    <th>Pavadinimas</th>
			  </tr>
			  <c:forEach var="listValue" items="${musuDainos}">
			  <tr>
			    <td>${listValue.author}</td>
			    <td>${listValue.songName}</td>
			  </tr>
			  </c:forEach>
	  		</table>
        
        </c:if>	
			</div>
			<div class="playlist">
				<div>insert playlist here</div>
			</div>
		</div>
	</body>
	<footer>
		<div>GRAMMZ&nbsp; @ &nbsp;2018</div>
	</footer>
</html>