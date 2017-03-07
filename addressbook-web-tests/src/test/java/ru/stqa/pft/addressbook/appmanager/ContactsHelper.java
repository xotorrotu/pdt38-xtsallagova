package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by ktsallagova on 03.03.2017.
 */

public class ContactsHelper extends HelperBase{

    public ContactsHelper(WebDriver wd) {
        super(wd);
    }

    //функция для добавления данных для нового пользователя
    public void fillNewContact(ContactData contactData) {

        type(By.name("firstname"), contactData.getName());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("email"), contactData.getEmail());
        type(By.name("home"), contactData.getHomePhone());

    }


    //функция подтверждения создания нового пользователя (кнопка Enter)
    public void submitNewPersonCreation() {
      click(By.xpath("//div[@id='content']/form/input[21]"));
    }


    public void selectPerson(){
        if (!wd.findElement(By.name("selected[]")).isSelected()) {
            click(By.name("selected[]"));
        }
    }

    public void initPersonModification(){

       click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
     };


    public void submitPersonModification() {
        click(By.name("update"));
    }


    public void submitPersonDeletion() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    //Для закрытия диалогового окна (alert), которое появляется при удалении контакта
    public void closeSubmitDelWindow(){
        if (isAlertPresent()==true){wd.switchTo().alert().accept();}
    }






}
