// src/HomePage.js
import React from 'react';

const HomePage = () => {
    return (
        <div>
            <h1>Welcome to the Home Page</h1>
            <button onClick={() => {
                localStorage.removeItem('token');
                window.location.href = '/login';
            }}>
                Logout
            </button>
        </div>
    );
};

export default HomePage;