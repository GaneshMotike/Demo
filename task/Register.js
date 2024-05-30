
import React, { useState } from 'react';

function Register() {
  const [formData, setFormData] = useState({
    username: '',
    email: '',
    password: ''
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData(prevState => ({
      ...prevState,
      [name]: value
    }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    
    console.log(formData);
  };

  return (
    <div>
      <h2>Register</h2>
      <form onSubmit={handleSubmit}>
        <input  type="text" name="username" placeholder="Username" value={formData.username} onChange={handleChange} /><br/>
        <input type="email" name="email" placeholder="Email" value={formData.email} onChange={handleChange} /><br/>
        <input type="password" name="password" placeholder="Password" value={formData.password} onChange={handleChange} /><br/>
        <button  type="submit">Register</button>
      </form>
    </div>
  );
}

export default Register;