import React from 'react'
import StaffImage from './../assets/images/staff.jpg'
import FooterTextComponent from '../components/FooterTextComponent'
const AboutPage = () => {
  return (
    <div>
      <div className="container-fluid">
        <div className="row justify-content-evenly mt-5 pb-5">
        <h4 className='text-center py-5'>About Us</h4>
        <div className="col-md-5">
          <img src={StaffImage} className="img-thumbnail" alt="GrowthImage" />
        </div>
        <div className="col-md-5">
            <p style={{textAlign:'justify'}}>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Dolores labore pariatur qui possimus sit, sunt, soluta impedit illo modi dignissimos quas voluptas excepturi reiciendis fuga exercitationem, non vel. Consequatur, esse. Quasi, ipsa atque deleniti ab a quidem dolorem. Esse eaque illum mollitia iste, tenetur sit suscipit perspiciatis minus. Quidem iure et dolores, aut saepe ullam incidunt dignissimos ea dolorem sunt! Eum alias tenetur cumque, deserunt ipsam fugiat ut, voluptatibus aliquid a commodi enim expedita, ipsum placeat ex architecto dolores. Doloremque placeat vel adipisci eius.</p>
            <button type="button" className="btn btn-outline-danger">Explore More</button>
        </div>
        </div>
        {/* Footer Text Component */}
        <FooterTextComponent />
      </div>  
    </div>
  )
}

export default AboutPage