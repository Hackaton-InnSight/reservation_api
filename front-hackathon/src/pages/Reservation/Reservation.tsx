export default function Reservation() {
    return (
        <div className="reservation">
            <h1>Réservation</h1>
            <div className="reservation-form">
                <form>
                    <label htmlFor="check-in">Check-in</label>
                    <input type="date" id="check-in" name="check-in"/>
                    <label htmlFor="check-out">Check-out</label>
                    <input type="date" id="check-out" name="check-out"/>
                    <label htmlFor="guests">Nombre de personnes</label>
                    <input type="number" id="guests" name="guests"/>
                    <button type="submit">Rechercher</button>
                </form>
            </div>
        </div>
    );
}