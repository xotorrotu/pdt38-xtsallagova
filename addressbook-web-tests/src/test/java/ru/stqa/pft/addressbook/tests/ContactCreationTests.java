package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.PersonDataEmails;
import ru.stqa.pft.addressbook.model.PersonDataName;
import ru.stqa.pft.addressbook.model.PersonDataPhones;

public class ContactCreationTests extends TestBase{


    @Test
    public void testContactCreation() {

        app.getNavigationHelper().gotoNewPersonPage();

        app.getContactsHelper().newPersonName(new PersonDataName("Семен", "Семенович", "Семенов"));

        app.getContactsHelper().newPersonPhones(new PersonDataPhones("+74959998877", "+99091234567", "+79803214576", "+74996785034"));

        app.getContactsHelper().newPersonEmails(new PersonDataEmails("test1@email.com", "test2@email.com"));

        app.getContactsHelper().submitNewPersonCreation();

        app.getNavigationHelper().gotoHomePage();
    }






}
