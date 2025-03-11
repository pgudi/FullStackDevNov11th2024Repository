
import axios from 'axios'

const employeeBaseURL= 'http://localhost:8082/api/v1'
export const getAllEmployees=()=>{
    return axios.get(employeeBaseURL+'/employees')
    
}

export const createEmployee=(employee)=>{
    return axios.post(employeeBaseURL+'/employee', employee)
    
}

export const deleteEmployee=(employeeId)=>{
    return axios.delete(employeeBaseURL+'/employee'+'/'+employeeId)
    
}


export const getEmployee=(employeeId)=>{
    return axios.get(employeeBaseURL+'/employee'+'/'+employeeId)
    
}

export const modifyEmployee=(employeeId, employee)=>{
    return axios.put(employeeBaseURL+'/employee'+'/'+employeeId, employee)
}
