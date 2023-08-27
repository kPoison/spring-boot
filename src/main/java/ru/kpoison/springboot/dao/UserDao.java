package ru.kpoison.springboot.dao;

import ru.kpoison.springboot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    User getById(Long id);
    void save(User user);
    void update(User user);
    void delete(Long id);
}
