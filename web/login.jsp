<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	<link href="login/assets/theme.css" rel="stylesheet" id="bootstrap-css">
        <script src="login/assets/theme-js.js"></script>
        <script src="login/assets/code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
	<div class="container">
	<div class="login-container">
            <div id="output"></div>
            
                   <img src="login/assets/logo.png"> 
              
            <div class="form-box">
                <form action="login.log" method="POST">
                    <input name="user" type="text" placeholder="username">
                    <input name ="password" type="password" placeholder="password">
                    <button class="btn btn-primary btn-block login" type="submit">Login</button>
                </form>
            </div>
        </div>
        
</div>
</body>
</html>