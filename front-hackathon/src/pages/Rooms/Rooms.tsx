import { useState } from 'react';
import Card from '../../components/Card/Card.tsx';
import './Rooms.css';
import Button from "../../components/Button/Button.tsx";
import React from 'react';
import {useNavigate} from "react-router-dom";

export default function Rooms() {
    const [currentCard, setCurrentCard] = useState(0);
    const navigate = useNavigate();

    const cards = [
        {
            id: 1,
            title: 'Chambre 2 personnes “Deluxe”',
            image: 'https://www.gannett-cdn.com/-mm-/05b227ad5b8ad4e9dcb53af4f31d7fbdb7fa901b/c=0-64-2119-1259/local/-/media/USATODAY/USATODAY/2014/08/13/1407953244000-177513283.jpg?width=2560',
            image2: "https://cf.bstatic.com/xdata/images/hotel/max1280x900/497846967.jpg?k=a4c4edf6e662dc0bcfd851708108dae7925e44cfe0387292259a37d1c0b86ed1&o=&hp=1",
            price: '80',
            description: 'Lit King Size\n'+' Salle de bain privée avec baignoire\n'+' Espace de rangement\n'+' Climatisation et chauffage\n',
            description2: 'Télévision\n' +
                'Connexion Wi-Fi\n '+'Machine à café\n' +
                'Décoration moderne et confort'
        },
        {
            id: 2,
            title: 'Card 2',
            image: 'https://www.gannett-cdn.com/-mm-/05b227ad5b8ad4e9dcb53af4f31d7fbdb7fa901b/c=0-64-2119-1259/local/-/media/USATODAY/USATODAY/2014/08/13/1407953244000-177513283.jpg?width=2560',
            image2: "https://cf.bstatic.com/xdata/images/hotel/max1280x900/497846967.jpg?k=a4c4edf6e662dc0bcfd851708108dae7925e44cfe0387292259a37d1c0b86ed1&o=&hp=1",
            price: '100',
            description: 'Description for Card 2',
            description2: 'Télévision\n' +
                'Connexion Wi-Fi\n '+'Machine à café\n' +
                'Décoration moderne et confort'
        },
        {
            id: 3,
            title: 'Card 3',
            image: 'https://www.gannett-cdn.com/-mm-/05b227ad5b8ad4e9dcb53af4f31d7fbdb7fa901b/c=0-64-2119-1259/local/-/media/USATODAY/USATODAY/2014/08/13/1407953244000-177513283.jpg?width=2560',
            image2: "https://cf.bstatic.com/xdata/images/hotel/max1280x900/497846967.jpg?k=a4c4edf6e662dc0bcfd851708108dae7925e44cfe0387292259a37d1c0b86ed1&o=&hp=1",
            price: '100',
            description: 'Description for Card 3',
            description2: 'Télévision\n' +
                'Connexion Wi-Fi\n '+'Machine à café\n' +
                'Décoration moderne et confort'
        },
    ];

    const totalCards = cards.length;

    const nextCard = () => {
        setCurrentCard((currentCard + 1) % totalCards);
    };

    const prevCard = () => {
        setCurrentCard((currentCard - 1 + totalCards) % totalCards);
    };

    const e = (card: { id: number; title: string; price: string; image: string; image2: string; description: string; description2: string; }) => () => {
        console.log(JSON.stringify(card));
        navigate(`/reservation/${card.id}`);
    };

    return (
        <div className="rooms-content">
            <h1 className="rooms-title">Innsight</h1>
            {cards.map((card, index) => (
                index === currentCard &&
                <React.Fragment key={card.id}>
                    <Card title={card.title} image={card.image} image2={card.image2}
                        description={card.description} description2={card.description2}/>
                    <div className="rooms-book-price">
                        <h2 className="rooms-price">{card.price}€/nuit</h2>
                        <Button className={"btn-book"} name={"Book"} onClick={e(card)}/>
                    </div>
                </React.Fragment>
            ))}
            <div className="rooms-btn-switch">
                <Button onClick={prevCard} name={"<"}/>
                <Button onClick={nextCard} name={">"}/>
            </div>
        </div>
    );
}