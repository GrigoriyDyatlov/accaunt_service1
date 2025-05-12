package ru.netologu.accaunt_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import ru.netologu.accaunt_service.repository.UserRepository;
import ru.netologu.accaunt_service.user.User;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/api/users/{userId}")
    public User getOne(@PathVariable UUID id) {
//        return new User("Ivanov Ivan Ivannikov", "MSK", "+792193", "sdfsdfsdf");
        Optional<User> userOptional = userRepository.findById(id);
        return  userOptional.orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Entity with id `%s` not found".formatted(id)));
    }
}
