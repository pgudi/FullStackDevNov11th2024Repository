import React from 'react'
import './../App.css'
import SubBanner from './../assets/images/sub-banner.jpg'
import HeaderComponent from './HeaderComponent'
const HomeComponent = () => {
  return (
    <div>
      <HeaderComponent/>
        <div className="container-fluid bg">
        <div className="row ">
            <h1>Employee Application </h1>
          </div>
        </div>
    </div>
  )
}

export default HomeComponent