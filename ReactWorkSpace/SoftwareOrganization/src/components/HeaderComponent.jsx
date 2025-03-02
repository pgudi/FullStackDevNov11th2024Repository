import React from 'react'
import { Link } from 'react-router-dom'

const HeaderComponent = () => {
    return (
        <div>
            <nav className="navbar navbar-expand-lg bg-primary">
                <div className="container-fluid">
                    <a className="navbar-brand text-white fw-bolder fs-4" href="#">Aishu InfoTech</a>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div className="navbar-nav">
                            <Link to={'/'} className="nav-link active text-white" aria-current="page" href="#">Home</Link>
                            <Link to={'/services'} className="nav-link text-white" href="#">Services</Link>
                            <Link to={'/about'} className="nav-link text-white" href="#">About Us</Link>
                            <Link to={'/contact'} className="nav-link text-white" href="#">Contact Us</Link>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
    )
}

export default HeaderComponent