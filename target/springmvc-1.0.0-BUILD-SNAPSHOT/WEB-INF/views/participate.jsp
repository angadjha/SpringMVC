<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready( function() {
$('#track1').click(function(){
   $('#wrap').append('<embed id="embed_player" src="${pageContext.request.contextPath}/assets/css/audio.mp3" autostart="true" hidden="true"></embed>');
});
$('#track2').click(function(){
	   $('#wrap2').append('<embed id="embed_player" src="${pageContext.request.contextPath}/assets/css/audio.mp3" autostart="false" hidden="true"></embed>');
	});
});
</script>

</head>
<body>
hello participate 

<img name="track1" src="${pageContext.request.contextPath}/assets/img/trumin2.jpg" width="180" height="180" border="0" id="track1" alt="" />
<div id="wrap">&nbsp;hello </div>
hi
hh
<img name="track2" src="${pageContext.request.contextPath}/assets/img/trumin2.jpg" width="180" height="180" border="0" id="track1" alt="" />
<div id="wrap2">&nbsp;hello </div>
</body>
</html>