import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import './App.css'
import Rooms from "./pages/Rooms/Rooms.tsx";

function App() {
  return (
    <Router>
        <Routes>
            <Route path="/" element={<h1>Home</h1>} />
            <Route path="rooms" element={<Rooms />} />
            <Route path="reservation/:id" element={<h1>Reservation</h1>} />
            <Route path="*" element={<h1>Not Found</h1>} />
        </Routes>
    </Router>
  )
}

export default App
