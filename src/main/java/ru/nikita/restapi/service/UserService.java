package ru.nikita.restapi.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.nikita.restapi.model.Role;
import ru.nikita.restapi.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    User getUserById(Long id);

    List<User> getAllUsers();

    List<Role> getAllRole();

    boolean addUser(User user);

    boolean deleteUserById(Long id);

    boolean updateUserForm(User user);

    User getUserByName(String username);
}
