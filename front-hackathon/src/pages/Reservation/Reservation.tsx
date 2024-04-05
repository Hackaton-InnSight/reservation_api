import "./Reservation.css";
import {useLocation, useParams} from "react-router-dom";
import {useEffect, useState} from "react";
import {RoomByIdInterface} from "../../interfaces/RoomInterface.tsx";
import RoomServices from "../../services/RoomServices.tsx";
import UserServices from "../../services/UserServices.tsx";
import ReservationServices from "../../services/ReservationServices.tsx";
import {Room, User} from "../../interfaces/ReservationInterface.tsx";



export default function Reservation() {
    const {id}  = useParams();
    const location = useLocation();
    const queryParams = new URLSearchParams(location.search);
    const checkIn = queryParams.get('checkIn');
    const checkOut = queryParams.get('checkOut');
    const [room, setRoom] = useState<RoomByIdInterface>();

    const [email, setEmail] = useState('');
    const [firstName, setFirstName] = useState('');
    const [lastName, setLastName] = useState('');
    const [phone, setPhone] = useState('');

    const handleSubmit = (event: any) => {
        event.preventDefault();
        if (checkIn && checkOut && id) {
            UserServices.addUser({email, firstName, lastName, phoneNumber: phone})
                .then(response => {
                    const userId: User = {id: response.data.id};
                    const room: Room = {roomNumber: parseInt(id)};
                    ReservationServices.addReservation({
                        room: room,
                        checkIn: checkIn,
                        checkOut: checkOut,
                        user: userId
                    })
                        .then(r => console.log(r.data));
                });
        }

        // Handle form submission here
    };

    useEffect((): void => {
        RoomServices.getRoomById(id).then(r => setRoom(r.data));

    }, [id]);

    return (
        <div className="room-reservation-content">
            <h1 className="room-reservation-title">Book your room</h1>
            <div className="room-reservation-description">
                <h2 className="room-reservation-name">{room?.roomName}</h2>
                <p className="room-reservation-dates">Du {checkIn} au {checkOut}</p>
            </div>
            <div className="room-reservation-images">
                <img className="room-reservation-image"
                     src="https://www.gannett-cdn.com/-mm-/05b227ad5b8ad4e9dcb53af4f31d7fbdb7fa901b/c=0-64-2119-1259/local/-/media/USATODAY/USATODAY/2014/08/13/1407953244000-177513283.jpg?width=2560"
                     alt="image1"/>
                <img className="room-reservation-image"
                     src="https://cf.bstatic.com/xdata/images/hotel/max1280x900/497846967.jpg?k=a4c4edf6e662dc0bcfd851708108dae7925e44cfe0387292259a37d1c0b86ed1&o=&hp=1"
                     alt="image2"/>
            </div>
            <form onSubmit={handleSubmit}>
                <label>
                    Email :
                    <input type="email" value={email} onChange={e => setEmail(e.target.value)} required/>
                </label>
                <label>
                    Prénom:
                    <input type="text" value={firstName} onChange={e => setFirstName(e.target.value)} required/>
                </label>
                <label>
                    Nom:
                    <input type="text" value={lastName} onChange={e => setLastName(e.target.value)} required/>
                </label>
                <label>
                    Téléphone:
                    <input type="tel" value={phone} onChange={e => setPhone(e.target.value)} required/>
                </label>
                <button type="submit">Confirmer</button>
            </form>
        </div>
    );
}