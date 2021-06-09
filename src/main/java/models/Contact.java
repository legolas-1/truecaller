package models;

import java.util.UUID;

public class Contact {
    private UUID id;
    public String name;
    public ContactType contactType;
    public String number;
    public String email;

    public Contact(String name, ContactType contactType, String number, String email) {
        this.name = name;
        this.contactType = contactType;
        this.number = number;
        this.email = email;
    }
}
