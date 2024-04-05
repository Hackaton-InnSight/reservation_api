package org.innsight.reservation_api.services;

import org.innsight.reservation_api.models.RoomModel;
import org.innsight.reservation_api.models.dtos.RoomDTO;
import org.innsight.reservation_api.repositories.RoomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Service
public class RoomService {
    private final RoomsRepository roomsRepository;

    @Autowired
    public RoomService(RoomsRepository roomsRepository) {
        this.roomsRepository = roomsRepository;
    }

    public Long addRoom(RoomModel roomModel) {
        return roomsRepository.save(roomModel).getRoomNumber();
    }

    public RoomDTO getRoom(Long id) {
        return new RoomDTO(Objects.requireNonNull(roomsRepository.findById(id).orElse(null)));
    }

    public List<RoomDTO> getAllRooms() {
        return RoomDTO.fromList(roomsRepository.findAll());
    }

    public boolean deleteRoom(Long id) {
        if(roomsRepository.existsById(id)) {
            roomsRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }

    public List<RoomDTO> getRoomsAvailable(LocalDate checkIn, LocalDate checkOut) {
        List<RoomModel> rooms = roomsRepository.findAll();
        return RoomDTO.fromList(rooms.stream()
                .filter(room -> room.getReservations()
                        .stream()
                        .noneMatch(reservation -> reservation.getCheckIn().isBefore(checkOut) && reservation.getCheckOut().isAfter(checkIn)))
                .toList());
    }

    public Boolean getRoomAvailable(Long id, LocalDate checkIn, LocalDate checkOut) {
        RoomModel room = roomsRepository.findById(id).orElse(null);
        if(room == null) {
            return false;
        }
        return room.getReservations()
                .stream()
                .noneMatch(reservation -> reservation.getCheckIn().isBefore(checkOut) && reservation.getCheckOut().isAfter(checkIn));
    }
}
