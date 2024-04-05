import http from './HttpCommon';
import axios, { AxiosResponse } from 'axios';
import {CreateReservationInterface, ReservationInterface} from "../interfaces/ReservationInterface.tsx";

function addReservation(data: CreateReservationInterface): Promise<AxiosResponse<ReservationInterface>> {
    return axios.post(`${http}/reservations/add`, data);
}



const ReservationServices = {
    addReservation,
}
export default ReservationServices;