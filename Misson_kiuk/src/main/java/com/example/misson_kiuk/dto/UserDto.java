package com.example.misson_kiuk.dto;

import com.example.misson_kiuk.entity.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
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

    public static UserDto fromEntity(User entity){
        return UserDto.builder()
                .id(entity.getId())
                .username(entity.getUsername())
                .password(entity.getPassword())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .nickname(entity.getNickname())
                .age(entity.getAge())
                .profile(entity.getProfile())
                .rank(entity.getRank())
                .build();
    }
}
