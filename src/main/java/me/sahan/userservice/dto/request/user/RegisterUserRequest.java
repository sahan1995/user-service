package me.sahan.userservice.dto.request.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserRequest {

    private String firstName;

    private String lastName;

    private String displayName;

    private String photoUrl;

    private String uid;

}
