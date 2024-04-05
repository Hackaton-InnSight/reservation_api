interface ReservationInterface{
    id: string;
    roomId: string;
    userFirstName: string;
    userLastName: string;
    checkIn: string;
    checkOut: string;
}

interface User {
    id: number;
}

interface Room {
    roomNumber: number;
}
interface CreateReservationInterface{
    checkIn: string;
    checkOut: string;
    user: User;
    room: Room;
}
export type { ReservationInterface, CreateReservationInterface, Room, User}