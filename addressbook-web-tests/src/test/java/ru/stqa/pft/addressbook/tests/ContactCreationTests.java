package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{


    @Test
    public void testContactCreation() {

        app.getNavigationHelper().gotoNewPersonPage();

        app.getContactsHelper().fillNewContact(new ContactData("Семен", "Семенович", "Семенов", "test1@email.com", "+74959998877"));

        app.getContactsHelper().submitNewPersonCreation();

        app.getNavigationHelper().gotoHomePage();
    }






}
