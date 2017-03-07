package ru.stqa.pft.addressbook.model;

public class ContactData {

    private final String name;
    private final String middlename;
    private final String lastname;
    private final String email;
    private final String homePhone;

    public ContactData(String name, String middlename, String lastname, String email,String homePhone) {
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
        this.email = email;
        this.homePhone = homePhone;
    }

    public String getName() {
        return name;
    }

    public String getMiddlename() { return middlename; }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getHomePhone() { return homePhone; }


}
