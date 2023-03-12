package me.sahan.userservice.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.sahan.userservice.dto.response.user.UserResponse;
import me.sahan.userservice.model.User;
import me.sahan.userservice.repository.UserRepository;
import me.sahan.userservice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse registerUser(User user) {
        User registedUser = userRepository.save(user);
        log.info("User is registered");

        return UserResponse.builder()
                .id(registedUser.getId())
                .firstName(registedUser.getFirstName())
                .lastName(registedUser.getLastName())
                .displayName(registedUser.getDisplayName())
                .photoUrl(registedUser.getPhotoUrl())
                .uid(user.getUid())
                .build();
    }
}
