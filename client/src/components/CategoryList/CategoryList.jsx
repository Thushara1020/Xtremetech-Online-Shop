import './CategoryList.css';
import {useContext} from "react";
import {AppContext} from "../../context/AppContext.jsx";

const CategoryList = () => {
  const {categories} = useContext(AppContext);
  return (
    <div className="categoty-list-container">

    </div>
  )
}

export default CategoryList;