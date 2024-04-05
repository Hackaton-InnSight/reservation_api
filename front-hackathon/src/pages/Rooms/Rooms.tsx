import {useEffect, useState} from 'react';
import Card from '../../components/Card/Card.tsx';
import './Rooms.css';
import Button from "../../components/Button/Button.tsx";
import React from 'react';
import RoomServices from "../../services/RoomServices.tsx";
import {RoomInterface} from "../../interfaces/RoomInterface.tsx";
import {useNavigate} from "react-router-dom";


async function fetchRooms(setCards: React.Dispatch<React.SetStateAction<RoomInterface[]>>) {
    try {
        const response = await RoomServices.getAll();
        setCards(response.data);
        console.error(response.data);
    } catch (error) {
        console.error(error);
    }
}

export default function Rooms() {
    const [currentCard, setCurrentCard] = useState(0);
    const [cards, setCards] = useState<RoomInterface[]>([]);
    const navigate = useNavigate();


    useEffect((): void => {
        fetchRooms(setCards).then(r => r);
    }, []);

    const totalCards = cards.length;

    const nextCard = () => {
        setCurrentCard((currentCard + 1) % totalCards);
    };

    const prevCard = () => {
        setCurrentCard((currentCard - 1 + totalCards) % totalCards);
    };


    return (
        <div className="rooms-content">
            <h1 className="rooms-title">Innsight</h1>
            {cards.map((card, index) => (
                index === currentCard &&
                <React.Fragment key={index}>
                    <Card card={card}/>
                    <Button className={"btn-book"} name={"Book"} onClick={() => navigate(`/reservation/${card.roomNumber}`)} />
                </React.Fragment>
            ))}
            <div className="rooms-btn-switch">
                <Button onClick={prevCard} name={"<"}/>
                <Button onClick={nextCard} name={">"}/>
            </div>
        </div>
    );
}