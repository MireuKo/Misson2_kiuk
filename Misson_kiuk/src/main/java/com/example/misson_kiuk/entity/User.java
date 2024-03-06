package com.example.misson_kiuk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private String username;
    @Setter
    private String password;
    @Setter
    private String email;
    @Setter
    private String phone;
    @Setter
    private String nickname;
    @Setter
    private String age;
    @Setter
    private String profile;

    //등급
    @Setter
    private Integer rank;

    //권한
    private String authorities;
}
