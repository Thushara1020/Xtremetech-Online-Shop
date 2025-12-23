import Menubar from "./components/Menubar/Menubar.jsx";
import {Route, Routes} from "react-router-dom";
import Dashboard from "./assets/pages/Dashboard/Dashboard.jsx";
import ManageCategory from "./assets/pages/ManageCategory/ManageCategory.jsx";
import ManageUsers from "./assets/pages/ManageUsers/ManageUsers.jsx";
import ManageItems from "./assets/pages/ManageItems/ManageItems.jsx";
import Explore from "./assets/pages/Explore/Explore.jsx";

const App = () => {
    return (
        <div>
            <Menubar />
            <Routes>
                <Route path="/dashboard" element={<Dashboard/>} />
                <Route path="/category" element={<ManageCategory/>} />
                <Route path="/users" element={<ManageUsers/>} />
                <Route path="/items" element={<ManageItems/>} />
                <Route path="/explore" element={<Explore/>} />

                <Route path="/" element={<Dashboard/>} />
            </Routes>
        </div>
    )
}

export default App;