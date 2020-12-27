<!-- Header -->
<%@include file="includes/header.jsp" %>
<!-- Header -->

<!-- Navbar -->
<%@include file="includes/navbar.jsp" %>
<!-- Navbar -->

<main class="d-flex align-items-center" style="clip-path: polygon(0% 0%, 100% 0%, 100% 93%, 74% 85%, 55% 94%, 21% 86%, 0 96%);
   background-color: #3f51b5;padding-bottom:100px;">
	<div class="container">
		<div class="row">
			<div class="col-lg-5 col-md-8 col-sm-10 mx-auto">
				<div class="card" style="width:auto;">
					<form action="register" method="POST" class="form" id="form1">
						<div class="card-header text-white text-center" style="background-color: #2196f3;">	
							<i class="fa fa-user-plus fa-2x" aria-hidden="true"></i><br/>	
							<h5>Registration</h5>
							<div class="input-group form-group mt-2">
	                        <div class="input-group-prepend">
	                           <span class="input-group-text"><i class="fa fa-envelope"></i></span>
	                       	</div>
	                        	<input type="text" name="user_msg" class="form-control" style="color: red;" readonly
	                        		value='<%= (request.getAttribute("message")==null) ? "Welcome...." : request.getAttribute("message") %>'>
				      	   	</div>
						</div>
						<div class="card-body">
							<div class="form-group mb-2">
								<label for="username">Username:</label>
								<input type="text" name="user_name" class="form-control" id="username">
								<small></small>
							</div>
							<div class="form-group mb-2">
								<label for="password">Password:</label>
								<input type="password" name="user_pass" class="form-control" id="password">
								<small></small>
							</div>
							<div class="form-group mb-2">
								<label for="email">Email:</label>
								<input type="email" name="user_email" class="form-control" id="email">
								<small></small>
							</div>
							<div class="form-group mb-1">
								<label for="gender">Gender:</label>
								<input type="radio" name="user_gender" class="form-radio" id="male" value="Male" checked> Male
								<input type="radio" name="user_gender" class="form-radio" id="female" value="Female"> Female
							</div>
							<div class="form-group mb-2">
								<label for="user_about">About:</label>
								<textarea name="user_about" class="form-control" id="user_about" rows="3" placeholder="Enter Something about you"></textarea>
							</div>
							<div class="form-group">
								<div class="form-check">
									<input class="form-check-input"  name="check" type="checkbox" value="" id="invalidCheck3" required>
									<label class="form-check-label" for="invalidCheck3">
										Agree to terms and conditions
									</label>
								</div>
							</div>
							<button class="btn btn-primary" type="submit">Submit</button>
						</div>	
					</form>
				</div>
			</div>
		</div>
	</div>
</main>
<script src="assets/main.js"></script>

<!-- Footer -->
<%@include file="includes/footer.jsp" %>
<!-- Footer -->