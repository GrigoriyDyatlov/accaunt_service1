package ru.netologu.accaunt_service;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Value;
import ru.netologu.accaunt_service.user.User;

import java.util.UUID;

/**
 * DTO for {@link ru.netologu.accaunt_service.user.User}
 */
@Value
@AllArgsConstructor
public class UserDto {
    UUID userId;
    @NotBlank
    String fullName;
    String addressDelivery;
    String phoneNumber;
    String email;

    public static UserDto fromEntity(User user) {
        return new UserDto(user.getUserId(),
                user.getFullName(),
                user.getAddressDelivery(),
                user.getPhoneNumber(),
                user.getEmail());

    }
}