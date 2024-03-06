package com.example.misson_kiuk.service;

import com.example.misson_kiuk.dto.ItemDto;
import com.example.misson_kiuk.entity.Item;
import com.example.misson_kiuk.repo.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public ItemDto create(ItemDto dto){
        Item item = Item.builder()
                .id(dto.getId())
                .price(dto.getPrice())
                .title(dto.getTitle())
                .content(dto.getContent())
                .username(dto.getUsername())
                .build();

        return ItemDto.fromEntity(itemRepository.save(item));
    }
}
