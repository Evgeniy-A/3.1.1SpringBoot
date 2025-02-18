package _SpringBoot.SpringBoot.service;


import _SpringBoot.SpringBoot.dao.UserDao;
import _SpringBoot.SpringBoot.models.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void saveUser(String firstName, String lastName, String email) {
        userDao.saveUser(firstName, lastName, email);
    }

    @Override
    @Transactional(readOnly = true)
    public User showUserById(int id) {
        return userDao.showUserById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void updateUserById(int id, User updatedUser) {
        userDao.updateUserById(id, updatedUser);
    }

    @Override
    @Transactional
    public void removeUserById(int id) {
        userDao.removeUserById(id);
    }
}
