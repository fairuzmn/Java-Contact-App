/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contactapp.Models;

/**
 *
 * @author Parasit
 */
public class Contact {

    private String id;
    private String nama;
    private String hp;

    public Contact() {

    }

    public Contact(String _id, String _nama, String _hp) {
        id = _id;
        nama = _nama;
        hp = _hp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

}
