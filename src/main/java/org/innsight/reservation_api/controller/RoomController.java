package org.innsight.reservation_api.controller;

import org.innsight.reservation_api.models.RoomModel;
import org.innsight.reservation_api.models.dtos.RoomDTO;
import org.innsight.reservation_api.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping("/add")
    public Long addRoom(@RequestBody RoomModel roomModel) {
        return roomService.addRoom(roomModel);
    }
    @GetMapping("/{id}")
    public ResponseEntity<RoomDTO> getRoom(@PathVariable Long id) {
        if(roomService.getRoom(id) == null) {
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(roomService.getRoom(id));
        }
    }
    @GetMapping("/all")
    public ResponseEntity<Object> getAllRooms() {
        return ResponseEntity.ok(roomService.getAllRooms());
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteRoom(@PathVariable Long id) {
        if(roomService.deleteRoom(id)) {
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
