import React, { useEffect, useState } from 'react'
import { getAllEmployees, deleteEmployee } from '../services/EmployeeServices'
import './../App.css'
import { useNavigate } from 'react-router-dom'
import HeaderComponent from './HeaderComponent'

const DisplayEmployee = () => {

    const [employees, setEmployees] = useState([])
    const navigator = useNavigate();
    useEffect(() => {
        showAllEmployees()
    }, [])

    function showAllEmployees(){
        getAllEmployees().then((response) => {
            console.log(response.data)
            setEmployees(response.data)
        }).catch(error => {
            console.log(error)
        })
    }

    function navigateCreateEmployee() {
        navigator('/add-employee')
    }

    function deleteEmployeeById(id) {
        console.log("id value :"+id)
        let status=window.confirm("Do you want to Delete the Employee Record?")
        console.log("Status value :"+status)
         if(status){
            deleteEmployee(id).then((response) =>{
                console.log(response.data)
                console.log("The Employee with "+id+" has deleted succesfully")
                showAllEmployees()
            }).catch(error =>{
                console.log("Error Message "+error)
            })
            
        }else{
            navigator('/employees')
        }

    }

    function editEmployeeById(id){
        navigator(`/edit-employee/${id}`)
    }
    return (
        <>
            <HeaderComponent/>
            <h3 className="text-center my-5">List of Employees</h3>
            <button className='btn btn-primary mb-2' onClick={navigateCreateEmployee}>Add Employee</button>
            <table className="table table-bordered table-striped table-hover border-primary-subtle">
                <thead>
                    <tr className="table-primary border-primary-subtle">
                        <th>EmployeeId</th>
                        <th>Employee Name</th>
                        <th>Job Name</th>
                        <th>Salary</th>
                        <th>City Name</th>
                        <th>Country Name</th>
                        <th>Created Date</th>
                        <th>Modified Date</th>
                        <th colSpan='2' style={{textAlign:'center'}}>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    {employees.map(employee => (
                        <tr key={employee.id}>
                            <td>{employee.id}</td>
                            <td>{employee.name}</td>
                            <td>{employee.jobName}</td>
                            <td>{employee.salary}</td>
                            <td>{employee.cityName}</td>
                            <td>{employee.countryName}</td>
                            <td>{employee.createdDate}</td>
                            <td>{employee.modifiedDate}</td>
                            <td>
                                <button className='btn btn-info' onClick={() => editEmployeeById(employee.id)}>Edit</button>
                            </td>
                            <td>
                                
                                <button className='btn btn-danger' onClick={() => deleteEmployeeById(employee.id)}>Delete</button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </>
    )
}

export default DisplayEmployee;