import './PopUp.css';

type PopUpProps = {
    isSuccess: boolean;
}

function PopUp({isSuccess}: PopUpProps) {
    return (
        <>
            {isSuccess && (
                <div className="popup-content">
                    <p className="popup-message">Validation réussie ✔</p>
                </div>
            )}
        </>
    );
}

export default PopUp;