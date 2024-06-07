function validateLoginForm() 
{
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var errorMessage = document.getElementById("errorMessage");
    
    if (username === "" || password === "")
         {
        errorMessage.innerHTML = "Username and password are required.";
    }
     else if (username !== "Ganesh" || password !== "12345")
         {
        errorMessage.innerHTML = "Invalid Data !";
    } 
    else
     {
        errorMessage.innerHTML = "";
        alert("Wellcome to GYM !");
    }
}