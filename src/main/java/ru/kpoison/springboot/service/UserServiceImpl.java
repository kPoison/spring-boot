package ru.kpoison.springboot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpoison.springboot.dao.UserDao;
import ru.kpoison.springboot.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private final UserDao dao;

    public UserServiceImpl(@Qualifier("userDaoImpl") UserDao dao) {
        this.dao = dao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAll() {
        return dao.getAll();
    }

    @Override
    @Transactional(readOnly = true)
    public User getById(Long id) {
        return dao.getById(id);
    }

    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public void update(User user) {
        dao.update(user);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
}
