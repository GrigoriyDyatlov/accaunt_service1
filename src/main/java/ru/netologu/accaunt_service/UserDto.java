package ru.netologu.accaunt_service;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.util.UUID;

/**
 * DTO for {@link ru.netologu.accaunt_service.user.User}
 */
@Value
public class UserDto {
    UUID id;
    @NotBlank
    String fullName;
    String addressDelivery;
    String phoneNumber;
    Email email;
}