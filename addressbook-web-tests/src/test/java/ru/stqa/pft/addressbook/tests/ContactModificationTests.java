package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.PersonDataEmails;
import ru.stqa.pft.addressbook.model.PersonDataName;
import ru.stqa.pft.addressbook.model.PersonDataPhones;

/**
 * Created by ktsallagova on 03.03.2017.
 */

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification(){

        app.getNavigationHelper().gotoHomePage();
        app.getContactsHelper().initPersonModification();
        app.getContactsHelper().newPersonName(new PersonDataName("Николай", "Николаевич", "Семенов"));
        app.getContactsHelper().newPersonPhones(new PersonDataPhones("+3134959998877", "+79091234567", "+513123", "+74996785034"));
        app.getContactsHelper().newPersonEmails(new PersonDataEmails("test-new1@email.com", "test-new1@email.com"));
        app.getContactsHelper().submitPersonModification();
        app.getNavigationHelper().gotoHomePage();

    }



}
