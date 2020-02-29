<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Home</title>
</head>
<body id="home">

    <img src="./assets/Big logo.svg" id="logo">
    <div id="para">
    <p>Check your horoscope to discover and make the most of your life opportunities</p>
    </div>
    <form  action="/lab-java-astrozone/astrozone" method="post">
    <input type="submit" value="Check Now" id="button" name="submit">
    </form> 
    <img src="./assets/Footer.svg" id="ftr">
</body>
</html>