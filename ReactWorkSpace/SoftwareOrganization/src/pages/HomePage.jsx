import React from 'react'
import SliderComponent from '../components/SliderComponent'
import TeamImage from './../assets/images/user1.jpg'
import GrowthImage from './../assets/images/growth1.jpg'
import FooterTextComponent from '../components/FooterTextComponent'
const HomePage = () => {
  return (
    <div>
      <SliderComponent />
      {/* ---- tag line start here ----- */}
      <div className="container-fluid">
        <div className="row">
          <div className="col-12">
            <h3 className='display-6 text-center my-4'>Software development is the act of examining the <br />
              artifacts and the behavior of the software</h3>
          </div>
        </div>
      </div>
      {/* ---- tag line end here ----- */}

      {/* Our Vision Mission and Aims Start here */}
      <div className="row justify-content-evenly">
        <div className="col-md-3">
          <h1 className='text-primary text-center'><i className="bi bi-file-code-fill"></i></h1>
          <h5 className='text-center'>Our Vision</h5>
          <p className='text-center'>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eius ut quam officia, libero magni consectetur architecto quasi.</p>
        </div>
        <div className="col-md-3">
          <h1 className='text-danger text-center'><i className="bi bi-bookmarks-fill"></i></h1>
          <h5 className='text-center'>Our Mission</h5>
          <p className='text-center'>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eius ut quam officia, libero magni consectetur architecto quasi.</p>
        </div>
        <div className="col-md-3">
          <h1 className='text-success text-center'><i className="bi bi-calendar-range-fill"></i></h1>
          <h5 className='text-center'>Our Aims</h5>
          <p className='text-center'>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eius ut quam officia, libero magni consectetur architecto quasi.</p>
        </div>
      </div>
      {/* Our Vision Mission and Aims End here */}

      {/* Our Team Members start here */}
      <div className="row justify-content-evenly my-5">
        <h4 className='text-center pt-5'>Our Team Members</h4>
        <div className="col-md-3">
          <div className="card">
            <img src={TeamImage} className="card-img-top" alt="Team Image" />
            <div className="card-body">
              <h5 className="card-title">Santosh</h5>
              <p className="card-text">Some quick example text to build on the card title and.</p>
              <a href="#" className="btn btn-primary">Read More</a>
            </div>
          </div>
        </div>
        <div className="col-md-3">
          <div className="card">
            <img src={TeamImage} className="card-img-top" alt="Team Image" />
            <div className="card-body">
              <h5 className="card-title">Ankitha</h5>
              <p className="card-text">Some quick example text to build on the card title and.</p>
              <a href="#" className="btn btn-primary">Read More</a>
            </div>
          </div>
        </div>
        <div className="col-md-3">
          <div className="card">
            <img src={TeamImage} className="card-img-top" alt="Team Image" />
            <div className="card-body">
              <h5 className="card-title">Manikantha</h5>
              <p className="card-text">Some quick example text to build on the card title and.</p>
              <a href="#" className="btn btn-primary">Read More</a>
            </div>
          </div>
        </div>
      </div>

      <div className="row justify-content-evenly my-5">
        <div className="col-md-3">
          <div className="card">
            <img src={TeamImage} className="card-img-top" alt="Team Image" />
            <div className="card-body">
              <h5 className="card-title">Richard</h5>
              <p className="card-text">Some quick example text to build on the card title and.</p>
              <a href="#" className="btn btn-primary">Read More</a>
            </div>
          </div>
        </div>
        <div className="col-md-3">
          <div className="card">
            <img src={TeamImage} className="card-img-top" alt="Team Image" />
            <div className="card-body">
              <h5 className="card-title">Adams</h5>
              <p className="card-text">Some quick example text to build on the card title and.</p>
              <a href="#" className="btn btn-primary">Read More</a>
            </div>
          </div>
        </div>
        <div className="col-md-3">
          <div className="card">
            <img src={TeamImage} className="card-img-top" alt="Team Image" />
            <div className="card-body">
              <h5 className="card-title">Miller</h5>
              <p className="card-text">Some quick example text to build on the card title and.</p>
              <a href="#" className="btn btn-primary">Read More</a>
            </div>
          </div>
        </div>
      </div>
      {/* Our Team Members end here */}

      {/* Our Organization Growth start here */}
      <div className="row justify-content-evenly my-5">
        <h4 className='text-center py-5'>Our Organization Growth</h4>
        <div className="col-md-5">
          <img src={GrowthImage} className="img-thumbnail" alt="GrowthImage" />
        </div>
        <div className="col-md-5">
          <h5 className='pt-4'>MySQL Development</h5>
          <div className="progress" role="progressbar" aria-label="Success example" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100">
            <div className="progress-bar bg-success" style={{width: '25%'}}>25%</div>
          </div>
          <h5 className='pt-4'>Springboot Development</h5>
          <div className="progress" role="progressbar" aria-label="Info example" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100">
            <div className="progress-bar bg-info text-dark" style={{width: '50%'}}>50%</div>
          </div>
          <h5 className='pt-4'>CSS Development</h5>
          <div className="progress" role="progressbar" aria-label="Warning example" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100">
            <div className="progress-bar bg-warning text-dark" style={{width: '75%'}}>75%</div>
          </div>
          <h5 className='pt-4'>JavaScript Development</h5>
          <div className="progress" role="progressbar" aria-label="Danger example" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100">
            <div className="progress-bar bg-danger" style={{width: '100%'}}>100%</div>
          </div>
          <h5 className='pt-4'>React Development</h5>
          <div className="progress" role="progressbar" aria-label="Info example" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100">
            <div className="progress-bar bg-info text-dark" style={{width: '50%'}}>50%</div>
          </div>
        </div>
      </div>
      {/* Our Organization Growth end here */}

      {/* Footer Text Component */}
        <FooterTextComponent />
      {/* Footer Text Component */}
    </div>
  )
}

export default HomePage