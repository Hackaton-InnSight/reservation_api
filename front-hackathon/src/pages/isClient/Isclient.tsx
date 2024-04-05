import {useState} from "react";
import IsclientServices from "../../services/IsclientServices.tsx";


export default function Isclient() {
    const [email, setEmail] = useState('');

    const handleEmailChange = (event: any) => {
        setEmail(event.target.value);
    };

    const handleSubmit = () => {
        // Ici, vous pouvez ajouter la logique pour gérer la soumission de l'e-mail
        console.log(`Email submitted: ${email}`);
        IsclientServices.getAvailability(email).then(r => console.log(r.data));
    };


    return (
        <div className="rooms-content">
            <input
                type="email"
                value={email}
                onChange={handleEmailChange}
                placeholder="Enter your email"
            />
            <button onClick={handleSubmit}>
                Submit
            </button>


        </div>
    );
}