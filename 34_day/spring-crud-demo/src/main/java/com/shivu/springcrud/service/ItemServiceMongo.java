package com.shivu.springcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivu.springcrud.domain.Item;
import com.shivu.springcrud.repository.ItemRepository;

@Service
public class ItemServiceMongo implements ItemService {
    @Autowired
    private ItemRepository repository;

    @Override
    public Integer create(Item item) {
        repository.save(item);
        return 0;

    }

    @Override
    public List<Item> readAll() {
        return repository.findAll();

    }

    @Override
    public Integer update(Item item) {
        repository.save(item);
        return 0;

    }

    @Override
    public Integer delete(Long id) {
        repository.deleteById(id);
        return 0;

    }

}
