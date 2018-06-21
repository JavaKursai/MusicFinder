<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


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
	<header class="container">

		<img src="/resources/css/antonio-vivaldi.jpg" alt="Vivaldis"
			class="responsive" width="900" height="600">


		<h1>Muzika privalo išskelti ugnį iš žmogaus sielos.Muzika negali
			mąstyti, bet ji gali įkūnyti mintį</h1>


	</header>
	<section class="Label">
		<br> <br>
		<div class="blokas">
			<p>Pasirinkite paieškos būdą:</p>


			<br>
			<form>
				<div class="BendraPaieska">


					<input id="sersas" name="Search" placeholder="Paieška" type="" />
					<button type="button">Eik!</button>
					</input>

				</div>
				<br> <br> <select class="selectBox">

					<option value="0">Pagal ka rusiuot</option>
					<option value="1">Bendra paieska</option>
					<option value="2">Dainos pavadinimas ${profile.songName}
				</select>

			</form>
		</div>
	</section>
	<footer id="Endas">

		<p>Projektą ruošė:Zana,Mindaugas,Rokas,Arnoldas,Mantas,by
			direktorius Gintas.</p>
	</footer>


	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/waypoints/4.0.1/jquery.waypoints.min.js"></script>

	<script src="testas.js"></script>
	<script type="jsCookie.js"></script>
	<script src="jquery3.js"></script>
</body>
</html>