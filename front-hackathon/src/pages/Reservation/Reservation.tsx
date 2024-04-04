import "./Reservation.css";
import {useParams} from "react-router-dom";
import {useEffect, useState} from "react";
import {RoomByIdInterface} from "../../interfaces/RoomInterface.tsx";
import RoomServices from "../../services/RoomServices.tsx";



export default function Reservation() {
    const {id}  = useParams();
    const [room, setRoom] = useState<RoomByIdInterface>();

    useEffect((): void => {
        RoomServices.getRoomById(id).then(r => setRoom(r.data));

    }, [id]);

    return (
        <div className="room-reservation-content">
            <h1 className="room-reservation-title">Book your room</h1>
            <div className="room-reservation-description">
                <h2 className="room-reservation-name">{room?.roomName}</h2>

            </div>
        </div>
    );
}