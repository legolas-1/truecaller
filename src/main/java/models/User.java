package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private UUID id;
    public Contact contact;
    public List<String> blockedList;
    public List<Contact> contacts;

    public List<String> getBlockedList() {
        return blockedList;
    }

    public void setBlockedList(List<String> blockedList) {
        this.blockedList = blockedList;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public User(String name, String number, String email, ContactType contactType) {
        Contact UserContact = new Contact(name, contactType, number, email);
        this.blockedList = new ArrayList<Contact>();
        this.contacts = new ArrayList<Contact>();
        this.contact = UserContact;
    }

    public addContactToList() {
        this.contacts.add(User);
    }

    public removeContactFromList() {

    }

    public addContactFromBlockedList() {

    }

    public removeContactFromBlockedList() {

    }

    public importContactList(List<Contact> list) {
        this.contacts = list;
    }

    public updateUserDetails() {

        Contact = new Contact();
    }
}
