package com.shivu.webflux.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public class UserDb {
    private final List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }
}
