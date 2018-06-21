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
        <title>Pixel Perfect</title>
        <link rel="stylesheet" href="Muzik.css">
        <link href="<c:url value="/resources/css/Muzik.css" />" rel="stylesheet">
    </head>
    <body>
        <header>
            <div id="container">
                <div class="title"><h1>Muzika privalo išskelti ugnį iš žmogaus sielos.Muzika negali mąstyti, bet ji gali įkūnyti mintį</h1></div>
                
            </div>
        </header>
        <section class="Label">
            <br>
            <br>
            <div class="blokas">
            <p>Pasirinkite paieškos būdą:</p>
            
            
            <br>
<<<<<<< HEAD
            <form:form action="sersas" modelAttribute="filtras" method="POST">
             <form:label path="inputText">jhhh</form:label>
            <form:input path="inputText" /> <br><br>
            
             <input type="submit" value="Submit"/>
            </form:form>
            
            <select class="selectBox" >

	                    <option value="0" >Pagal ka rusiuot
	                    </option>
=======
            <form>
                    <div class="BendraPaieska">
                    <input id="sersas" name="Search" placeholder="Paieska" type=""/><button type="button">kaip as jusu nekenciu</button>
                </div>
                <br>
                <br>
                
                <select class="selectBox" >
                    <option value="0" >Pagal ka rusiuot</option>
>>>>>>> MP-versija
                    <option value="1">Bendra paieska</option>
                    <option value="2">Dainos pavadinimas
                    </option>
                    <option value="3">Autorius/Grupe</option>
                </select>
        </div>
        </section>
        
        <section>
        	<h1> Musu dainos</h1>
        	
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
        
        </section>
        <footer id="Endas">
                <h1>Projekta ruose</h1>
        </footer>
            
            
        <script src="https://cdnjs.cloudflare.com/ajax/libs/waypoints/4.0.1/jquery.waypoints.min.js"></script>
            
        <script src="testas.js"></script>
        <script type="jsCookie.js"></script>
        <script src="jquery3.js"></script>    
        </body>
    </html>