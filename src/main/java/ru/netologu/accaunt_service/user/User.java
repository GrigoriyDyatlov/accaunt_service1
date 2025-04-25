package ru.netologu.accaunt_service.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "user_")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId", nullable = false)
    private UUID userId;

    @Column(name = "full_Name")
    private String fullName;

    @Column(name = "address_delivery")
    private String addressDelivery;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;


    public User(String email, String phoneNumber, String addressDelivery, String fullName) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.addressDelivery = addressDelivery;
        this.fullName = fullName;
    }
}