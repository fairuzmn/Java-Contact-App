/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contactapp.Controllers;

import com.mycompany.contactapp.Models.Contact;
import com.mycompany.contactapp.Models.Database;
import java.util.ArrayList;

/**
 *
 * @author Parasit
 */
public class ContactController {

    private Database database;

    public ContactController() {
        database = new Database();
    }

    public void save(Contact contact) {
        database.getContact().add(contact);
    }

    public void update(Contact contact) {
        for (int i = 0; i < database.getContact().size(); i++) {
            Contact oldContact = database.getContact().get(i);
            if (oldContact.getId().equals(contact.getId())) {
                database.getContact().set(i, contact);
            }
        }
    }

    public void delete(Contact contact) {
        for (int i = 0; i < database.getContact().size(); i++) {
            Contact oldContact = database.getContact().get(i);
            if (oldContact.getId().equals(contact.getId())) {
                database.getContact().remove(i);
            }
        }
    }

    public Contact readById(String id) {
        for (int i = 0; i < database.getContact().size(); i++) {
            Contact oldContact = database.getContact().get(i);
            if (oldContact.getId().equals(id)) {
                return oldContact;
            }
        }

        return null;
    }

    public ArrayList<Contact> readAll() {
        return database.getContact();
    }
}
