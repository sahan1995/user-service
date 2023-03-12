package me.sahan.userservice.service;

import me.sahan.userservice.dto.response.user.UserResponse;
import me.sahan.userservice.model.User;

public interface UserService {

    UserResponse registerUser(User user);
}
