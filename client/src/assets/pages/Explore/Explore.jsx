import'./Explore.css';
import {useContext} from "react";
import {AppContext} from "../../../context/AppContext.jsx";


const Explore = () => {
    const { categories } = useContext(AppContext);
    console.log(categories);
    return (
        <div className="explore-container text-light">
            <div className="left-column">
                <div className="fist-row" style={{overflowY: 'auto'}}>
                    categories
                </div>
                <hr className="horizontal-line" />
                <div className="second-row" style={{overflowY: 'auto'}}>
                    items
                </div>
            </div>
            <div className="right-column d-flex flex-column">
                <div className="customer-form-container" style={{height:'15%'}}>
                    costumer form
                </div>
                <hr className="my-3 text-light"/>
                <div className="cart-items-contaner" style={{height:'55%', overflowY: 'auto'}}>
                    cart items
                </div>
                <hr className="my-3 text-light"/>
                <div className="cart-items-contaner" style={{height:'30%'}}>
                    customer summary
                </div>
            </div>
        </div>
    )
}
export default Explore;