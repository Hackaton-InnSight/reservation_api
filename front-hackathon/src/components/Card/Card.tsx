import Calendar from 'react-calendar';
import "./Card.css";

interface CardProps {
    title: string;
    description: string;
    description2: string;
    image: string;
    image2: string;
}

function Card({ title, description, description2, image, image2}: CardProps) {


    return (
        <div className="card-content">
            <div className="card-images">
                <img className="card-image" src={image} alt={title}/>
                <img className="card-image" src={image2} alt={title}/>
            </div>
            <h2 className="card-title">{title}</h2>
            <div className="card-description">
                <p>{description}</p>
                <p>{description2}</p>
            </div>
            <Calendar className="card-calendar"/>
        </div>
    );
}

export default Card;