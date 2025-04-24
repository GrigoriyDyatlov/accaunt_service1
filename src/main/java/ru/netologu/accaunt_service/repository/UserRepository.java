package ru.netologu.accaunt_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.netologu.accaunt_service.user.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}