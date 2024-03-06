package com.example.misson_kiuk.controller;

import com.example.misson_kiuk.dto.ItemDto;
import com.example.misson_kiuk.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {
    private ItemService itemService;


    @PostMapping("/create")
    public ItemDto create(
            @RequestBody
            ItemDto dto
    ){
        return itemService.create(dto);
    }

}
