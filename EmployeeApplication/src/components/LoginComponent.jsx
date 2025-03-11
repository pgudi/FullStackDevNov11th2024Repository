import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import LoginHeader from './LoginHeader'

const LoginComponent = () => {
    const [userName, setUserName] = useState('')
    const [password, setPassword] = useState('')

    const navigator=useNavigate()
    function handleLogin(){
        if(userName=='admin' && password =='manager'){
            navigator('/home')
        }
    }

    function handleCancel(){
        navigator('/')
    }
  return (
    <div>
        <LoginHeader/>
        <div className="container">
                <div className="row justify-content-evenly">
                    <h3 className='text-center'>Login Aplication</h3>
                    <div className="col-md-6">
                        <div className="card">
                            <div className="card-body">
                                <form>
                                    <div className='form-group'>
                                        <label className='form-label'>User Name</label>
                                        <div>
                                        <input
                                            type='text'
                                            placeholder='Enter User Name'
                                            value={userName}
                                            className='form-control'
                                            onChange={(e) => setUserName(e.target.value)}
                                        ></input>
                                        </div>
                                    </div>
                                    <div className='form-group'>
                                        <label className='form-label'>Password</label>
                                        <div>
                                        <input
                                            type='password'
                                            placeholder='Enter Password'
                                            value={password}
                                            className='form-control'
                                            onChange={(e) => setPassword(e.target.value)}
                                        ></input>
                                        </div>
                                    </div>
                                    
                                    <div className='mt-3'>
                                        <button type='submit' className='btn btn-success' onClick={handleLogin}>SignIn</button>
                                        <button className='btn btn-danger ms-2' onClick={handleCancel}>Cancel</button>
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

export default LoginComponent