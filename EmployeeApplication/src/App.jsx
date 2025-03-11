import DisplayEmployee from "./components/DisplayEmployee"
import FooterComponent from "./components/FooterComponent"
import HeaderComponent from "./components/HeaderComponent"
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import HomeComponent from "./components/HomeComponent"
import CreateEmployee from "./components/CreateEmployee"
import LoginComponent from "./components/LoginComponent"
function App() {

  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<LoginComponent />} ></Route>
          <Route path="/home" element={<HomeComponent />}></Route>
          <Route path="/employees" element={<DisplayEmployee />}></Route>
          <Route path="/add-employee" element={<CreateEmployee />}></Route>
          <Route path="/edit-employee/:id" element={<CreateEmployee />}></Route>
        </Routes>
        <FooterComponent />
      </BrowserRouter>
    </>
  )
}

export default App
