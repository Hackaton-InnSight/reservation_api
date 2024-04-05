package org.innsight.reservation_api.controller;

import org.innsight.reservation_api.models.UserModel;
import org.innsight.reservation_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public Object addUser(@RequestBody UserModel userModel) {
        return userService.addUser(userModel);
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserModel> getUser(@PathVariable Long id) {
        if(userService.getUser(id) == null) {
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(userService.getUser(id));
        }
    }
}
