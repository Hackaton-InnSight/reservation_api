import http from './HttpCommon';
import axios, { AxiosResponse } from 'axios';
import {MailResponse} from "../interfaces/IsclientInterface.tsx";

function getAvailability(mail: string): Promise<AxiosResponse<Array<MailResponse>>> {
    return axios.get(`${http}/reservations?mail=${mail}`);
}


const RoomServices = {
    getAvailability,
}
export default RoomServices;