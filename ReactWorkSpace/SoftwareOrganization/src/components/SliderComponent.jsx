import React from 'react'
import Carousel from 'react-bootstrap/Carousel';
import SliderImg from './../assets/images/bnr15.jpg';
const SliderComponent = () => {
    return (
        <div>
            <Carousel>
                <Carousel.Item>
                    <img src={SliderImg} className="d-block w-100" alt="sliderImage"></img>
                </Carousel.Item>
                <Carousel.Item>
                    <img src={SliderImg} className="d-block w-100" alt="sliderImage"></img>

                </Carousel.Item>
                <Carousel.Item>
                    <img src={SliderImg} className="d-block w-100" alt="sliderImage"></img>

                </Carousel.Item>
            </Carousel>
        </div>
    )
}

export default SliderComponent