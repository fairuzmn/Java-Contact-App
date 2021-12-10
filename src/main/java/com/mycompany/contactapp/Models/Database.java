/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contactapp.Models;

import java.util.ArrayList;

/**
 *
 * @author Parasit
 */
public class Database {

    ArrayList<User> dataUser;
    ArrayList<Contact> dataContact;

    public Database() {
        dataUser = new ArrayList<User>();
        dataContact = new ArrayList<Contact>();
    }

    public ArrayList<User> getUser() {
        return dataUser;
    }

    public ArrayList<Contact> getContact() {
        return dataContact;
    }
}
