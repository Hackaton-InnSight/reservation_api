interface UserInterface{
    id: number;
}

interface   CreateUserInterface{
    firstName: string;
    lastName: string;
    email: string;
    phoneNumber: string;
}

export type { UserInterface, CreateUserInterface }