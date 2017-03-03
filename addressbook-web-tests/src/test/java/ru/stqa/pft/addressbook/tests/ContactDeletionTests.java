package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by ktsallagova on 03.03.2017.
 */
public class ContactDeletionTests extends TestBase {

    @Test

    public void testContactDeletion(){

        app.getNavigationHelper().gotoHomePage();
        app.getContactsHelper().selectPerson();
        app.getContactsHelper().submitPersonDeletion();
        app.getContactsHelper().closeSubmitDelWindow();
        app.getNavigationHelper().gotoHomePage();

    }

}
