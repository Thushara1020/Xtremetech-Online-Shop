import axios from 'axios';

export const addcategory = async (category) => {
    return await axios.post('http://localhost:8080/api/v1.0/categories', category);
}

export const getAllCategories = async () => {
    return await axios.delete(`http://localhost:8080/api/v1.0/categories/${category}`);
}

export const fetchCategories = async () => {
    return await axios.get('http://localhost:8080/api/v1.0/categories');
}