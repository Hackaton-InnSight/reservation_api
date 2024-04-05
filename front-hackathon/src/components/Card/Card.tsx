import Calendar from 'react-calendar';
import {RoomInterface} from "../../interfaces/RoomInterface.tsx";
import 'react-calendar/dist/Calendar.css';
import "./Card.css";
import { useState} from "react";
import {useNavigate} from "react-router-dom";


type CardProps = {
    card: RoomInterface;
}

function Card({ card }: CardProps) {
    const [dateRange, setDateRange] = useState<[string, string]>([new Date().toISOString(), new Date().toISOString()]);
    const navigate = useNavigate();

    const onChange = (dates: any) => {
        const isoDates: [string, string] = [dates[0].toISOString().split('T')[0], dates[1].toISOString().split('T')[0]];
        setDateRange(isoDates);
        console.log(isoDates);
        navigate(`/reservation/${card.roomNumber}?checkIn=${isoDates[0]}&checkOut=${isoDates[1]}`);
    }

    return (
        <div className="card-content">
            <div className="card-images">
                <img className="card-image"
                     src="https://www.gannett-cdn.com/-mm-/05b227ad5b8ad4e9dcb53af4f31d7fbdb7fa901b/c=0-64-2119-1259/local/-/media/USATODAY/USATODAY/2014/08/13/1407953244000-177513283.jpg?width=2560"
                     alt={card.roomName}/>
                <img className="card-image"
                     src="https://cf.bstatic.com/xdata/images/hotel/max1280x900/497846967.jpg?k=a4c4edf6e662dc0bcfd851708108dae7925e44cfe0387292259a37d1c0b86ed1&o=&hp=1"
                     alt={card.roomName}/>
            </div>
            <h2 className="card-title">{card.roomName}</h2>
            <div className="card-description">
                <div className="card-description-capacity">
                    <p>Description :</p>
                    <p>{card.description}</p>
                </div>
                <div className="card-description-capacity">
                <p>Capacité :</p>
                    <p>Max {card.roomCapacity} personnes</p>
                </div>
                <div className="card-description-surperficy">
                    <p>Superficie :</p>
                    <p>{card.roomSuperficy} m²</p>
                </div>
                <div className="card-description-bedType">
                    <p>{card.bedType.length} lits :</p>
                    {card.bedType.map((bed, index) => (
                        <p key={index.toString()}>Lit {bed}</p>
                    ))}
                </div>
            </div>
            <Calendar
                className="card-calendar"
                selectRange
                onChange={onChange}
                value={dateRange}
            />
            <h2 className="rooms-price">{card.roomPrice}€/nuit</h2>
        </div>
    );
}

export default Card;