package me.sahan.userservice.dto.response.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    private Long id;

    private String firstName;

    private String lastName;

    private String displayName;

    private String photoUrl;

    private String uid;
}
