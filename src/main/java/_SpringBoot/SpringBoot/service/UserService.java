package _SpringBoot.SpringBoot.service;


import _SpringBoot.SpringBoot.models.User;

import java.util.List;

public interface UserService {
    void saveUser(String firstName, String lastName, String email);

    User showUserById(int id);

    List<User> getAllUsers();

    void updateUserById(int id, User updatedUser);

    void removeUserById(int id);
}
