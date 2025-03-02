import './App.css'
import FooterComponent from './components/FooterComponent'
import HeaderComponent from './components/HeaderComponent'
import SliderComponent from './components/SliderComponent'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import HomePage from './pages/HomePage'
import ServicesPage from './pages/ServicesPage'
import ContactPage from './pages/ContactPage'
import AboutPage from './pages/AboutPage'
function App() {

  return (
    <>
      <BrowserRouter>
        <HeaderComponent />
        <Routes>
            <Route path='/' element={<HomePage/>} ></Route>
            <Route path='/home' element={<HomePage/>} ></Route>
            <Route path='/services' element={<ServicesPage/>} ></Route>
            <Route path='/contact' element={<ContactPage/>} ></Route>
            <Route path='/about' element={<AboutPage/>} ></Route>
        </Routes>
        <FooterComponent />
      </BrowserRouter>



    </>
  )
}

export default App
