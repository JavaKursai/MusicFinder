<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Spring MVC and List Example</h2>

	<c:if test="${not empty musuDainos}">

		<ul>
			<c:forEach var="listValue" items="${musuDainos}">
				<li><span>Atlikejas:</span> ${listValue.author} <span>Pavadinimas:</span> ${listValue.songName}</li>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>