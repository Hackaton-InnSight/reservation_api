interface RoomInterface {
    roomNumber: string;
    roomName: string;
    roomSuperficy: string;
    description: string;
    bedType: Array<string>;
    description2: string;
    image: string;
    image2: string;
    roomCapacity: string;
    roomPrice: string;
}

interface RoomByIdInterface {
    roomNumber: string;
    roomName: string;
}

export type { RoomInterface, RoomByIdInterface }