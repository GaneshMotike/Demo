function validateForm() {
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    if (username === 'sample@gamil.com' && password === 'password') {
       window.alert('Hello User...Wellcome to the page!')
        return true;
    } else {
        window.alert('Invalid Inputs...!')
        return false;
    }
}
function showmsg()
{
    window.alert('Registration Successfull!...')
}
