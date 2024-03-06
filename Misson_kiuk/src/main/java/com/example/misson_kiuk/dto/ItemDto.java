package com.example.misson_kiuk.dto;

import com.example.misson_kiuk.entity.Item;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private String title;
    @Setter
    private String content;
    @Setter
    private Long price;

    @Setter
    private String username;

    public static ItemDto fromEntity(Item entity){
        return ItemDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .content(entity.getContent())
                .price(entity.getPrice())
                .username(entity.getUsername())
                .build();
    }
}
