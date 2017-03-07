package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


/**
 * Created by ktsallagova on 03.03.2017.
 */

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification(){

        app.getNavigationHelper().gotoHomePage();
        app.getContactsHelper().initPersonModification();
        app.getContactsHelper().fillNewContact(new ContactData("Николай", "Максимидиан", "Семенов", "test1-2@email.com", "+74999998877"));
        app.getContactsHelper().submitPersonModification();
        app.getNavigationHelper().gotoHomePage();

    }



}
