
import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import HomePage from './Home';
import LoginPage from './Login';
import RouteGuard from './Components/RouteGuard';

const App = () => {
    return (
        <Router>
            <Routes>
                <Route
                    path="/"
                    element={
                        <RouteGuard>
                            <HomePage />
                        </RouteGuard>
                    }
                />
                <Route path="/login" element={<LoginPage />} />
            </Routes>
        </Router>
    );
};

export default App;