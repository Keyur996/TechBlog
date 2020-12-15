const form = document.getElementById('form1');
const username = document.getElementById("username");
const email = document.getElementById("email");
const password = document.getElementById("password");
// show error message and outline
function showError(input, message) {
   const formControl = input.parentElement;
   formControl.className = "form-group mb-2 error";
   const small = formControl.querySelector('small');
   small.innerHTML = message;
}
// show success outline and removes small inner text 
function showSuccess(input) {
   const formControl = input.parentElement;
   formControl.className = "form-group mb-2 success";
   const small = formControl.querySelector('small');
   small.innerHTML = "";
}
// check required fields
function checkRequired(inputArr) {
   inputArr.forEach(function (input) {
      if (input.value.trim() === '' || input.value === null) {
         showError(input, `${getFieldName(input)} is required`);
         return false;
      } else {
         showSuccess(input);
         return true;
      }
   });
}
// get field Name with first letter capital
function getFieldName(input) {
   return input.id.charAt(0).toUpperCase() + input.id.slice(1);
}
// check Length
function checkLength(input, min, max) {
   if (input.value.length < min) {
      showError(input, `${getFieldName(input)} must be at least ${min} characters`);
      return false;
   } else if(input.value.length > max) {
      showError(input, `${getFieldName(input)} must be less than ${max} characters`);
      return false;
   } else {
      showSuccess(input);
      return true;
   }
}
// check Email
function validateEmail(input){
   var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
   if (reg.test(input.value.trim()) == false) 
   {
      showError(input, "Email is not Valid");
      return false;
   }else{
      showSuccess(input);
      return true;
   }
}

function validate() {
   let valid = true;
   // checked Required
   valid = checkRequired([username, email, password]);
   // check Length
   valid=checkLength(username, 3, 15);
   valid=checkLength(password, 6, 25);
   // validate email
   valid = validateEmail(email);
   return valid;
}
// Check validation on submit form
form.addEventListener('submit', function (e) {
   if (validate()) {
      console.log("success");
   } else {
      e.preventDefault();
   }
})