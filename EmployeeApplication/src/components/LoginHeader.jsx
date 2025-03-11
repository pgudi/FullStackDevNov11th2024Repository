import React from 'react'
import { Link } from 'react-router-dom'
const LoginHeader = () => {
  return (
    <div>
        <nav className="navbar navbar-expand-lg bg-primary">
        <div className="container-fluid">
          <Link to={'/'} className="navbar-brand text-white fw-bolder" href="#">Employee Application</Link>
          <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
          </div>
        </div>
      </nav>
    </div>
  )
}

export default LoginHeader