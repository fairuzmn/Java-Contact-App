/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contactapp;

import com.mycompany.contactapp.Models.User;
import com.mycompany.contactapp.Views.Contact.ContactView;
import com.mycompany.contactapp.Views.User.UserLogin;
import com.mycompany.contactapp.Controllers.ContactController;
import com.mycompany.contactapp.Controllers.UserController;

/**
 *
 * @author Parasit
 */
public class Main {

    private boolean isLogin;
    private User userLogin;
    private UserController userController;
    private UserLogin userLoginView;
    private ContactController contactController;

    public Main() {
        userController = new UserController();
        contactController = new ContactController();
    }

    public boolean isIsLogin() {
        return isLogin;
    }

    public void setIsLogin(boolean isLogin) {
        this.isLogin = isLogin;
    }

    public User getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(User userLogin) {
        this.userLogin = userLogin;
    }

    public ContactController getContactController() {
        return contactController;
    }

    public void setContactController(ContactController contactController) {
        this.contactController = contactController;
    }

    public UserController getUserController() {
        return userController;
    }

    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    public UserLogin getUserLoginView() {
        return userLoginView;
    }

    public void setUserLoginView(UserLogin userLoginView) {
        this.userLoginView = userLoginView;
    }

    public void navigateContactView() {
        ContactView contactView = new ContactView(contactController, this);
        contactView.setVisible(true);
    }

    public void logoutUser() {
        isLogin = false;
        userLogin = null;
        userLoginView.setVisible(true);
        userLoginView.resetData();
    }

    public static void main(String args[]) {
        Main TodoApp = new Main();
        UserLogin userLoginView = new UserLogin(TodoApp);
        TodoApp.setUserLoginView(userLoginView);
        TodoApp.getUserLoginView().setVisible(true);
    }
}
