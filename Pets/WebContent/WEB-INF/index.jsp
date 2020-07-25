<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style>

.box {
	background-color: #E2F2F1;
	display: inline-block;
	width: 150px;
	height: 150px;
	border: 0px solid black;
	margin-padding: 10px;
}

.middle {
	position: absolute;
	top: 20%;
	left: 20%;
	font-family: Helvetica;
}


</style>

<title>Pet Registration</title>
</head>
<body bgcolor="#E8F2E2">
 <div class=middle> 
    <center> Register your pet</center>
    
    <br>
    <br>
      <div class="box">
		<center>Dogs</center>
		<form action="<%=request.getContextPath()%>/Dogs" method="post">
     	Name: <input type="text" name="dogNameParam">
     	Breed: <input type="text" name="dogBreedParam">
     	Weight: <input type="text" name="dogWeightParam">
     	<br>
     	<center><input type="submit" value="Register Dog"></center>
      </form>
     </div>
     
     <div class="box">
     	<center>Cats</center>
     <form action="<%=request.getContextPath()%>/Cats" method="post">
     	Name: <input type="text" name="catNameParam">
     	Breed: <input type="text" name="catBreedParam">
     	Weight: <input type="text" name="catWeightParam">  
     	<br>
     	<center><input type="submit" value="Register Cat"></center>
       </form>
     </div>
 </div>
</body>
</html>