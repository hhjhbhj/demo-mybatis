<%@ include file="../common/style.jsp" %>
<!DOCTYPE html>
<html class="bg-black">
<head>
  <title>AdminLTE | Log in</title>
</head>
<body class="bg-black">

<div class="form-box" id="login-box">
  <div class="header">Sign In</div>
  <form action="<%= path %>/index.html" method="post">
    <div class="body bg-gray">
      <div class="form-group">
        <input type="text" name="userid" class="form-control" placeholder="User ID"/>
      </div>
      <div class="form-group">
        <input type="password" name="password" class="form-control" placeholder="Password"/>
      </div>
      <div class="form-group">
        <input type="checkbox" name="remember_me"/> Remember me
      </div>
    </div>
    <div class="footer">
      <button type="submit" class="btn bg-olive btn-block">Sign me in</button>

      <p><a href="#">I forgot my password</a></p>

      <a href="register.html" class="text-center">Register a new membership</a>
    </div>
  </form>

  <div class="margin text-center">
    <span>Sign in using social networks</span>
    <br/>
    <button class="btn bg-light-blue btn-circle"><i class="fa fa-facebook"></i></button>
    <button class="btn bg-aqua btn-circle"><i class="fa fa-twitter"></i></button>
    <button class="btn bg-red btn-circle"><i class="fa fa-google-plus"></i></button>

  </div>
</div>

<!-- include js -->
<jsp:include page="../common/footer.jsp"/>
<script src="<%= path %>/js/AdminLTE/app.js" type="text/javascript"></script>
</body>
</html>