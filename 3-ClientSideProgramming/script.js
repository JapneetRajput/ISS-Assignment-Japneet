// JavaScript for form validation
document
  .getElementById("userForm")
  .addEventListener("submit", function (event) {
    // Prevent form submission
    event.preventDefault();

    // Clear previous errors
    document.getElementById("nameError").textContent = "";
    document.getElementById("emailError").textContent = "";
    document.getElementById("passwordError").textContent = "";
    document.getElementById("confirmPasswordError").textContent = "";

    // Get form values
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("confirmPassword").value;

    let isValid = true;

    // Validate name
    if (name.trim() === "") {
      document.getElementById("nameError").textContent = "Name is required";
      isValid = false;
    }

    // Validate email
    const emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
    if (!emailPattern.test(email)) {
      document.getElementById("emailError").textContent =
        "Invalid email format";
      isValid = false;
    }

    // Validate password strength
    const passwordPattern = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}$/;
    if (!passwordPattern.test(password)) {
      document.getElementById("passwordError").textContent =
        "Password must be at least 6 characters long and include at least one number, one uppercase and one lowercase letter";
      isValid = false;
    }

    // Validate confirm password
    if (password !== confirmPassword) {
      document.getElementById("confirmPasswordError").textContent =
        "Passwords do not match";
      isValid = false;
    }

    
    if (isValid) {
      alert("Form submitted successfully!");
      this.submit();
    }
  });
