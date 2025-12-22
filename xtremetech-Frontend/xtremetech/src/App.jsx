import React from 'react';
import { Routes, Route } from 'react-router-dom';
import Menubar from './components/Menubar/Menubar';
import DashBoard from "./pages/Dashboard/DashBoard";
import ManageCategory from "./pages/ManageCategory/ManageCategory";
import ManageUsers from "./pages/ManageUsers/ManageUsers";
import ManageItems from "./pages/ManageItems/ManageItems";
import Explore from "./pages/Explore/Explore";

const App = () => {
  return (
    <div>
      <Menubar />
      <Routes> 
        <Route path="/dashboard" element={<DashBoard />} />
        <Route path="/category" element={<ManageCategory />} />
        <Route path="/users" element={<ManageUsers />} />
        <Route path="/items" element={<ManageItems />} />
        <Route path="/explore" element={<Explore />} />

        <Route path="/" element={<DashBoard />} />
      </Routes>
    </div>
  );
}

export default App;