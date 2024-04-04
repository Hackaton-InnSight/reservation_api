import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import './App.css'
import Rooms from "./pages/Rooms/Rooms.tsx";
import Reservation from "./pages/Reservation/Reservation.tsx";

function App() {
  return (
    <Router>
        <Routes>
            <Route path="/" element={<h1>Home</h1>} />
            <Route path="rooms" element={<Rooms />} />
            <Route path="reservation/:id" element={<Reservation />} />
            <Route path="*" element={<h1>Not Found</h1>} />
        </Routes>
    </Router>
  )
}

export default App
