import React from 'react'
import { Link } from 'react-router-dom'

const HeaderComponent = () => {
  return (
    <div>
      <nav className="navbar navbar-expand-lg bg-primary">
        <div className="container-fluid">
          <Link to={'/'} className="navbar-brand text-white fw-bolder" href="#">Employee Application</Link>
          <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
              <li className="nav-item">
                <Link to={'/employees'} className="nav-link active text-white" aria-current="page" href="#">Employee</Link>
              </li>
            </ul>
            
            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
              <li className="nav-item" style={{marginLeft:'500px'}}>
                <Link to={'/'} className="nav-link active text-white" aria-current="page" href="#">Logout</Link>
              </li>
            </ul>
          </div>
        </div>
      </nav>
    </div>
  )
}

export default HeaderComponent