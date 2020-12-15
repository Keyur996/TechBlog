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
			<div class="col-md-4 offset-md-4">
				<div class="card justify-content-center" style="width:auto;">
					<form action="register" method="POST" class="form" id="form1">
						<div class="card-header text-white text-center" style="background-color: #2196f3;">	
							<i class="fa fa-user-plus fa-3x" aria-hidden="true"></i><br/>	
							<h4>Registration</h4>
						</div>
						<div class="card-body">
							<div class="alert alert-warning alert-dismissible" role="alert">
								<%= (request.getAttribute("errMessage")==null) ? "" : request.getAttribute("errMessage") %>
								<button type="button" class="close" data-dismiss="alert" aria-label="Close"></button>
							</div>
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
									<input class="form-check-input"  name="check" type="checkbox" value="" id="invalidCheck3">
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