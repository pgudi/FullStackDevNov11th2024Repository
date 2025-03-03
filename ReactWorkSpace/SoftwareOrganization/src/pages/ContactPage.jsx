import React from 'react'
import FooterTextComponent from '../components/FooterTextComponent'
const ContactPage = () => {
  return (
    <div>
      <div className="container-fluid">
        <div className="row justify-content-evenly my-5 pb-5" style={{ backgroundColor: '#f1f1f1' }}>
          <h4 className='text-center pb-4'>Contact Us</h4>
          <div className="col-md-5">
            <div class="mb-3">
              <label for="fullname" class="form-label">Full Name</label>
              <input type="text" class="form-control" id="fullname" placeholder='Full Name' />
            </div>
            <div class="mb-3">
              <label for="exampleFormControlInput1" class="form-label">Email address</label>
              <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com" />
            </div>
            <div class="mb-3">
              <label for="exampleFormControlTextarea1" class="form-label">Message</label>
              <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" placeholder='Describe Yourself'></textarea>
            </div>
            <div>
            <button type="button" class="btn btn-success me-2">Submit</button>
            <button type="button" class="btn btn-primary">Reset</button>
            </div>
          </div>
          <div className="col-md-5">
          <h5>Address</h5>
            <p>
                Aishu InfoTech <br/>
                Attigupe Metro Station <br/>
                Vijayanagar 2nd Pahse <br/>
                Bangalore -560023 <br/>
                <i className="bi bi-telephone"></i>: 080-234-567-123
            </p>
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3888.01938993465!2d77.52485999999999!3d12.970611000000005!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bae3dd0de42b41d%3A0x31122c3797435f6c!2sMoodalapalya!5e0!3m2!1sen!2sin!4v1740976369662!5m2!1sen!2sin" width="400" height="250" style={{border:'0'}} allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
          </div>
        </div>
        {/* Footer Text Component */}
        <FooterTextComponent />
      </div>
    </div>
  )
}

export default ContactPage