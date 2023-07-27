package ru.gb.oop.lection4.task2;

import java.util.ArrayList;
import java.util.List;

public class GroupContacts {
    List<Contact> contactList = new ArrayList<>();

    public GroupContacts(List<Contact> contactList){
        this.contactList = contactList;
    }

    public void addContact(Contact contact){
        contactList.add(contact);
    }
    public List<Contact> getContactList(){
        return contactList;
    }
}
