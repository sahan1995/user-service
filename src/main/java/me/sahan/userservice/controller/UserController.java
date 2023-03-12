package me.sahan.userservice.controller;

import lombok.RequiredArgsConstructor;
import me.sahan.userservice.dto.request.user.RegisterUserRequest;
import me.sahan.userservice.dto.response.user.UserResponse;
import me.sahan.userservice.model.User;
import me.sahan.userservice.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse registerUser(@RequestBody RegisterUserRequest userRequest) {
        User user = User.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .displayName(userRequest.getDisplayName())
                .photoUrl(userRequest.getPhotoUrl())
                .uid(userRequest.getUid())
                .build();
        return userService.registerUser(user);
    }
}
