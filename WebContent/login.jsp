<!-- Header -->
<%@include file="includes/header.jsp" %>
<!-- Header -->

<!-- Navbar -->
<%@include file="includes/navbar.jsp" %>
<!-- Navbar -->

<main class="d-flex align-items-center" id="banner">
   <div class="container">
      <div class="row">
         <div class="col-md-4 offset-md-4">
            <div class="card">
               <div class="card-header text-center text-white" style="background-color: #2196f3;">
                  <i class="fa fa-users fa-3x" aria-hidden="true"></i>
                  <h4>LogIn</h4>
               </div>
               <div class="card-body">
                  <form action="#" method="post" class="form" id="form2">
<!--                      <div class="alert alert-success alert-dimissible" role="alert"> -->
					 <div>	
					      <%= (request.getAttribute("success")==null) ? "" : request.getAttribute("success") %>
<!-- 					      <button type="button" class="close" data-dismiss="alert" aria-label="Close"></button> -->
					 </div>
                     <div class="alert alert-warning alert-dimissible" role="alert">
					      <%= (request.getAttribute("errMessage")==null) ? "" : request.getAttribute("errMessage") %>
					      <button type="button" class="close" data-dismiss="alert" aria-label="Close"></button>
			      	 </div>
                     <div class="input-group form-group">
                        <div class="input-group-prepend">
                           <span class="input-group-text"><i class="fa fa-user-circle" aria-hidden="true"></i></span>
                        </div>
                        <input type="email" class="form-control" name="user_email" placeholder="Email" required>
                     </div>
                     <div class="input-group form-group">
                        <div class="input-group-prepend">
                           <span class="input-group-text"><i class="fa fa-key" aria-hidden="true"></i></span>
                        </div>
                        <input type="password" class="form-control" name="user_pass" placeholder="Password" required>
                     </div>
                     <div class="form-check">
                        <input type="checkbox" name="check" class="form-check-input" id="exampleCheck1">
                        <label class="form-check-label" for="exampleCheck1">Remember Me</label>
                     </div>
                     <div class="form-group">
                        <input type="submit" value="Login" class="btn btn-outline-primary float-right">
                     </div>
                  </form>
               </div>
               <div class="card-footer">
                  <div class="d-flex justify-content-center links">
                     Don't have an account?<a href="register.jsp">Sign Up</a>
                  </div>
                  <div class="d-flex justify-content-center">
                     <a href="#">Forgot my Password? </a>
                  </div>
               </div>
            </div>
         </div>
      </div>
   </div>
</main>

<!-- Footer -->
<%@include file="includes/footer.jsp" %>
<!-- Footer -->