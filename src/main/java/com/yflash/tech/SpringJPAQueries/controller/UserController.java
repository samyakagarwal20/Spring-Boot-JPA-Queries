package com.yflash.tech.SpringJPAQueries.controller;

import com.yflash.tech.SpringJPAQueries.entity.UserEntity;
import com.yflash.tech.SpringJPAQueries.model.in.GetUserRequest;
import com.yflash.tech.SpringJPAQueries.model.out.User;
import com.yflash.tech.SpringJPAQueries.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LogManager.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @GetMapping(value = "/get-user-by-id", produces = "application/json", consumes = "application/json")
    ResponseEntity<User> getUserById(@RequestBody GetUserRequest userRequest) {
        return new ResponseEntity<>(userService.getUserById(userRequest.getId()), HttpStatus.OK);
    }

}
