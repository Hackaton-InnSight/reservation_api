import http from './HttpCommon';
import axios, { AxiosResponse } from 'axios';
import {CreateUserInterface, UserInterface} from '../interfaces/UserInterface';

function addUser(data: CreateUserInterface): Promise<AxiosResponse<UserInterface>> {
    return axios.post(`${http}/users/add`, data);
}



const UserServices = {
    addUser,
}
export default UserServices;