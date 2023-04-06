package com.shivu.springcrud.service;

import java.util.List;

import com.shivu.springcrud.domain.Item;

public interface ItemService {
    Integer create(Item item);

    List<Item> readAll();

    Integer update(Item item);

    Integer delete(Long id);
}
