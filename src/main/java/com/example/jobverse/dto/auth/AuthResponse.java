package com.example.jobverse.dto.auth;

import com.example.jobverse.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String token;
    private String type = "Bearer";
    private Long userId;
    private String email;
    private String fullName;
    private String role;
    private String profilePicture;
    private Long profileId; // JobSeekerProfile ID or Company ID

    public AuthResponse(String token, Long userId, String email,
                        String fullName, String role, String profilePicture, Long profileId) {
        this.token = token;
        this.userId = userId;
        this.email = email;
        this.fullName = fullName;
        this.role = role;
        this.profilePicture = profilePicture;
        this.profileId = profileId;
    }
}
