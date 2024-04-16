package ru.akulich.spring_boot.springboottemp.dao;


import ru.akulich.spring_boot.springboottemp.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    User findOne(long id);

    void save(User user);

    void delete(long id);

    void update(long id, User user);

}
