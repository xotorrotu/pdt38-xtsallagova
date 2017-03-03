package ru.stqa.pft.addressbook.model;

public class PersonDataEmails {
    private final String email1;
    private final String email2;

    public PersonDataEmails(String email1, String email2) {
        this.email1 = email1;
        this.email2 = email2;
    }

    public String getEmail1() {
        return email1;
    }

    public String getEmail2() {
        return email2;
    }
}
