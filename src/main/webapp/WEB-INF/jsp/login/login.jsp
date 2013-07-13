<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Talent Acquisition System</title>
<link href="resources/css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery-1.4.2.js"></script>

</head>
<body>
<div class="header">
  <div class="wrap">
    <div class="logo fl"> <img src="resources/images/YASH.png" width="116" height="70" hspace="10" alt="Talent Acquisition System"> </div>
    <div class="appName fr">
    	<h1>Talent Acquisition System</h1>
    </div>
    <div class="clear"></div>
  </div>
  
</div>
<!-------main content div start---->
<div class="mainContent">
  <div class="wrap">
    <div id="centerContent" class="paddinLogin">
    <form id="loginForm" name="loginForm"  action="login" method="post">
      <div class="wrapLogin">
        <div class="pageTitle">
          <h4 class="pageTitleHead">Login</h4>
        </div>
        
        <div class="loginDetail">
          <label>User Name/Email :</label>
          <input type="text" value="" name="email" id="email" />
          <div class="clear"></div>
        </div>
        <div class="loginDetail">
          <label>Password :</label>
          <input type="password" value="" name="password" id="password" />
          <div class="clear"></div>
        </div>
        <div class="loginDetail">
          <label>&nbsp;</label>
          <input name="login" type="submit" value="Sign In" class="blueBtn" id="login" />
          &nbsp;
          <input name="cancel" type="reset" value="Reset" class="blueBtn" id="cancel" />
          <div class="clear"></div>
        </div>
        <div class="clear"></div>
      </div>
    </form>  
    </div>
    <!--footer--->
    <div class="footer"> Copyright © 2013. All Rights Reserved. </div>
    <!--footer end---> 
  </div>
</div>
<!-------main content div start---->
</body>
</html>
