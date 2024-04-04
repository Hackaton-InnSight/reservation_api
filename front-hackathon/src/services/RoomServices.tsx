import http from './HttpCommon';
import axios, { AxiosResponse } from 'axios';
import {RoomByIdInterface, RoomInterface} from '../interfaces/RoomInterface';

function getAll(): Promise<AxiosResponse<Array<RoomInterface>>> {
    return axios.get(`${http}/rooms/all`);
}

function getRoomById(id: string | undefined): Promise<AxiosResponse<RoomByIdInterface>> {
    return axios.get(`${http}/rooms/${id}`);
}

const RoomServices = {
    getAll,
    getRoomById,
}
export default RoomServices;