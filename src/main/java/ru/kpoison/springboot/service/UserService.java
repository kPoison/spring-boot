package ru.kpoison.springboot.service;

import ru.kpoison.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(Long id);
    void save(User user);
    void update(User user);
    void delete(Long id);
}
