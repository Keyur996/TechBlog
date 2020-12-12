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
					<form action="/register" method="POST" class="form">
						<div class="card-header text-white text-center" style="background-color: #2196f3;">	
							<i class="fa fa-user-plus fa-3x" aria-hidden="true"></i><br/>	
							<h4>Registration</h4>
						</div>
						<div class="card-body">
							<div class="form">
								<div class="form-group mb-2">
									<label for="username">UserName:</label>
									<input type="text" name="username" class="form-control" id="username">
								</div>
								<div class="form-group mb-2">
									<label for="password">PassWord:</label>
									<input type="password" name="pass" class="form-control" id="password">
								</div>
								<div class="form-group mb-2">
									<label for="email">Email:</label>
									<input type="text" name="email" class="form-control" id="email">
								</div>
								<div class="form-group mb-2">
									<label for="gender">Gender:</label>
									<input type="radio" name="gender" class="form-radio" id="male" value="Male" checked> Male
									<input type="radio" name="gender" class="form-radio" id="female" value="Female"> Female
								</div>
								<button class="btn btn-primary" type="submit">Submit</button>
							</div>
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