package com.shivu.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "/item")
@Controller
public class ItemController {
    // POST - http:/localhost:8080/item/
    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<AppRes> create(@RequestBody Item item) {
        AppRes res = AppRes.builder()
                .sts("Created")
                .msg("New Item Created")
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    // GET - http://localhost:8080/item/
    @GetMapping(value = "/")
    public @ResponseBody ResponseEntity<List<Item>> read() {
        List<Item> items = new ArrayList<>();
        return ResponseEntity.status(HttpStatus.OK).body(items);
    }

    // PUT - http://localhost:8080/item/
    @PutMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<AppRes> update(@RequestBody Item item) {
        AppRes res = AppRes.builder()
                .msg("Success")
                .sts(" Item Updated successfull")
                .build();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
    }

    // DELETE - http://localhost:8080/item/
    @DeleteMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<AppRes> delete(@PathVariable Long id) {
        AppRes res = AppRes.builder()
                .msg("Delete Successfully")
                .sts("success")
                .build();
        return ResponseEntity.status(HttpStatus.OK).body(res);

    }

}
