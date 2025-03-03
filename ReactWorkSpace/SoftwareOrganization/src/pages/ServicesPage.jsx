import React from 'react'
import ServiceImage from './../assets/images/service1.jpg'
import FooterTextComponent from '../components/FooterTextComponent'
const ServicesPage = () => {
  return (
    <div>
      <div className="container-fluid">
        <div className="row justify-content-evenly mt-4">
          <h4 className='text-center py-3'>Our Services</h4>
          <div className="col-md-3">
            <div className="card">
              <img src={ServiceImage} className="card-img-top" alt="Team Image" />
              <div className="card-body">
                <h5 className="card-title">Development</h5>
                <p className="card-text">Some quick example text to build on the card title and.</p>
                <a href="#" className="btn btn-primary">Read More</a>
              </div>
            </div>
          </div>
          <div className="col-md-3">
          <div className="card">
              <img src={ServiceImage} className="card-img-top" alt="Team Image" />
              <div className="card-body">
                <h5 className="card-title">Software Testing</h5>
                <p className="card-text">Some quick example text to build on the card title and.</p>
                <a href="#" className="btn btn-primary">Read More</a>
              </div>
            </div>
          </div>
          <div className="col-md-3">
          <div className="card">
              <img src={ServiceImage} className="card-img-top" alt="Team Image" />
              <div className="card-body">
                <h5 className="card-title">Maintenance</h5>
                <p className="card-text">Some quick example text to build on the card title and.</p>
                <a href="#" className="btn btn-primary">Read More</a>
              </div>
            </div>
          </div>
        </div>

        <div className="row justify-content-evenly py-4 mb-4">
          <div className="col-md-3">
            <div className="card">
              <img src={ServiceImage} className="card-img-top" alt="Team Image" />
              <div className="card-body">
                <h5 className="card-title">DevOps</h5>
                <p className="card-text">Some quick example text to build on the card title and.</p>
                <a href="#" className="btn btn-primary">Read More</a>
              </div>
            </div>
          </div>
          <div className="col-md-3">
          <div className="card">
              <img src={ServiceImage} className="card-img-top" alt="Team Image" />
              <div className="card-body">
                <h5 className="card-title">Performance</h5>
                <p className="card-text">Some quick example text to build on the card title and.</p>
                <a href="#" className="btn btn-primary">Read More</a>
              </div>
            </div>
          </div>
          <div className="col-md-3">
          <div className="card">
              <img src={ServiceImage} className="card-img-top" alt="Team Image" />
              <div className="card-body">
                <h5 className="card-title">Mobile App</h5>
                <p className="card-text">Some quick example text to build on the card title and.</p>
                <a href="#" className="btn btn-primary">Read More</a>
              </div>
            </div>
          </div>
        </div>

        {/* Footer Text Component */}
        <FooterTextComponent />
      </div>

    </div>
  )
}

export default ServicesPage