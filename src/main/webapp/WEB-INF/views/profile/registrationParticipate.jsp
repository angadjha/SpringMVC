<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/assets/css/registration.css" rel="stylesheet">
</head>
<body>
<h1>participate registration form </h1>
<form action="saveParticipate.do" class="registration-form" method="post">
<p id="fname">First Name :<label><input type="text" name="firstname" id="firstname" placeholder="firstname" /></label></p>
<p id="lname">Last Name :<label><input type="text" name="lastname" id="lastname" placeholder="lastname"/></label></p>
<p id="gender">Gender :<label><select>
		<option></option>
		<option>M</option>
		<option>F</option>
		</select></label></p> 
<p id="dob">Date Of Birth :<label> <input type="text" name="dob" id="dob" placeholder="dd/mm/yyyy"/></label></p>
<p id="email">Email :<label><input type="text" name="email" id="email" placeholder="email"/></label></p>
<p id="address">Address :<label><input type="text" name="address" id="address" placeholder="address"/></label></p>
<p id="contact">Contact Number :<label><input type="text" name="contactnumber" id="contactnumber" placeholder="contactnumber"/></label></p>
<p id="country">Country :<label><input type="text" name="country" id="country" placeholder="country"/></label></p>
<p id="postcode">Post Code :<label><input type="text" name="postcode" id="postcode" placeholder="postcode"/></label></p>
<p id="submit"><label><button type="submit">Submit</button></label></p>
</form>

</body>
</html>