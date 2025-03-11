import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'
import { createEmployee, getEmployee, modifyEmployee } from '../services/EmployeeServices'
import HeaderComponent from './HeaderComponent'

const CreateEmployee = () => {
    const [name, setName] =useState('')
    const [jobName, setJobName] =useState('')
    const [salary, setSalary] =useState('')
    const [cityName, setCityName] =useState('')
    const [countryName, setCountryName] =useState('')

    const navigator=useNavigate()
    const {id} = useParams()

    function navigateEmployee(){
        navigator('/employees')
    }

    const handleSaveAndEditEmployee=(e)=>{
        e.preventDefault()

        const employee= {name,jobName,salary,cityName,countryName}
        console.log(employee)

        if(id){
            modifyEmployee(id, employee).then((response) =>{
                console.log(response.data)
                navigator('/employees') 
            })
        }else{
            createEmployee(employee).then((response) =>{
                console.log(response.data)
                navigator('/employees')
            }).catch(error =>{
                console.log(error)
            })
        }
    }

    function showTitle(){
        if(id){
            return <h3 className='text-center'>Modify Employee</h3>
        }
        else{
            return <h3 className='text-center'>Add Employee</h3>
        }
    }

    useEffect(()=>{
        getEmployee(id).then((response)=>{
            setName(response.data.name)
            setJobName(response.data.jobName)
            setSalary(response.data.salary)
            setCityName(response.data.cityName)
            setCountryName(response.data.countryName)
        }).catch(error =>{
            console.log(error)
        })
    },[id])

    return (
        <div>
            <HeaderComponent/>
            <div className="container">
                <div className="row justify-content-evenly">
                    {
                        showTitle()
                    }
                    <div className="col-md-6">
                        <div className="card">
                            <div className="card-body">
                                <form>
                                    <div className='form-group'>
                                        <label className='form-label'>Employee Name</label>
                                        <div>
                                        <input
                                            type='text'
                                            placeholder='Enter Employee Name'
                                            value={name}
                                            className='form-control'
                                            onChange={(e) => setName(e.target.value)}
                                        ></input>
                                        </div>
                                    </div>
                                    <div className='form-group'>
                                        <label className='form-label'>Employee Job Name</label>
                                        <div>
                                        <input
                                            type='text'
                                            placeholder='Enter Job Name'
                                            value={jobName}
                                            className='form-control'
                                            onChange={(e) => setJobName(e.target.value)}
                                        ></input>
                                        </div>
                                    </div>
                                    <div className='form-group'>
                                        <label className='form-label'>Employee Salary</label>
                                        <div>
                                        <input
                                            type='text'
                                            placeholder='Enter Salary'
                                            value={salary}
                                            className='form-control'
                                            onChange={(e) => setSalary(e.target.value)}
                                        ></input>
                                        </div>
                                    </div>
                                    <div className='form-group'>
                                        <label className='form-label'>City Name</label>
                                        <div>
                                        <input
                                            type='text'
                                            placeholder='Enter City Name'
                                            value={cityName}
                                            className='form-control'
                                            onChange={(e) => setCityName(e.target.value)}
                                        ></input>
                                        </div>
                                    </div>
                                    <div className='form-group'>
                                        <label className='form-label'>Country Name</label>
                                        <div>
                                        <input
                                            type='text'
                                            placeholder='Enter Country Name'
                                            value={countryName}
                                            className='form-control'
                                            onChange={(e) => setCountryName(e.target.value)}
                                        ></input>
                                        </div>
                                    </div>
                                    <div className='mt-3'>
                                        <button type='submit' className='btn btn-success' onClick={handleSaveAndEditEmployee}>Save</button>
                                        <button className='btn btn-danger ms-2' onClick={navigateEmployee}>Cancel</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default CreateEmployee 