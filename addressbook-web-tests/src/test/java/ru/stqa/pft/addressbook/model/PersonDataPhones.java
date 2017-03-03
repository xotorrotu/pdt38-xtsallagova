package ru.stqa.pft.addressbook.model;

public class PersonDataPhones {
    private final String homePhone;
    private final String mobPhone;
    private final String workPhone;
    private final String fax;

    public PersonDataPhones(String homePhone, String mobPhone, String workPhone, String fax) {
        this.homePhone = homePhone;
        this.mobPhone = mobPhone;
        this.workPhone = workPhone;
        this.fax = fax;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobPhone() {
        return mobPhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getFax() {
        return fax;
    }
}
