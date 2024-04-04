import "./Button.css";
interface ButtonProps {
    name: string;
    className?: string;
    onClick?: () => void;
}
export default function Button({name,className="button-style", onClick} : ButtonProps) {
    return (
        <button className={className} onClick={onClick}>{name}</button>
    );
}