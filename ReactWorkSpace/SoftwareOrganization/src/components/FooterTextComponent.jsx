import React from 'react'
import { Link } from 'react-router-dom'
const FooterTextComponent = () => {
  return (
    <div>
        <div className="row justify-content-evenly bg-dark pb-2">
            <div className="col-md-3">
                <h5 className='text-white'>Aishu InfoTech</h5>
                <p className='text-white'>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Repudiandae sequi ducimus non aspernatur!</p>
            </div>
            <div className="col-md-3">
            <h5 className='text-white'>Important Links</h5>
            <Link to={'/'} className='text-white text-decoration-none'  >HOME</Link> <br/>
            <Link to={'/services'} className='text-white text-decoration-none'  >Services</Link> <br/>
            <Link to={'/contact'} className='text-white text-decoration-none' >Contact Us</Link> <br/>
            <Link to={'/about'} className='text-white text-decoration-none' >About Us</Link>
            </div>
            <div className="col-md-3">
            <h5 className='text-white'>Address</h5>
            <p className='text-white'>
                Aishu InfoTech <br/>
                Attigupe Metro Station <br/>
                Vijayanagar 2nd Pahse <br/>
                Bangalore -560023 <br/>
                <i className="bi bi-telephone"></i>: 080-234-567-123
            </p>
            </div>
        </div>
    </div>
  )
}

export default FooterTextComponent