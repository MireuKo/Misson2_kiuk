package com.example.misson_kiuk.repo;

import com.example.misson_kiuk.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
