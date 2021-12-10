/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contactapp.Controllers;

import com.mycompany.contactapp.Models.Database;
import com.mycompany.contactapp.Models.User;
import java.util.ArrayList;

/**
 *
 * @author Parasit
 */
public class UserController {

    private Database database;

    public UserController() {
        database = new Database();
    }

    public void save(User user) {
        database.getUser().add(user);
    }

    public void update(User user) {
        for (int i = 0; i < database.getUser().size(); i++) {
            User oldUser = database.getUser().get(i);
            if (oldUser.getId().equals(user.getId())) {
                database.getUser().set(i, user);
            }
        }
    }

    public void delete(User user) {
        for (int i = 0; i < database.getUser().size(); i++) {
            User oldUser = database.getUser().get(i);
            if (oldUser.getId().equals(user.getId())) {
                database.getUser().remove(i);
            }
        }
    }

    public User readById(String id) {
        for (int i = 0; i < database.getUser().size(); i++) {
            User oldUser = database.getUser().get(i);
            if (oldUser.getId().equals(id)) {
                return oldUser;
            }
        }

        return null;
    }

    public User login(String username, String password) {
        for (int i = 0; i < database.getUser().size(); i++) {
            User oldUser = database.getUser().get(i);
            if (oldUser.getUsername().equals(username) && oldUser.getPassword().equals(password)) {
                return oldUser;
            }
        }
        return null;
    }

    public ArrayList<User> readAll() {
        return database.getUser();
    }
}
