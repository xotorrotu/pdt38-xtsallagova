package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.PersonDataEmails;
import ru.stqa.pft.addressbook.model.PersonDataName;
import ru.stqa.pft.addressbook.model.PersonDataPhones;

/**
 * Created by ktsallagova on 03.03.2017.
 */

public class ContactsHelper extends HelperBase{

    public ContactsHelper(WebDriver wd) {
        super(wd);
    }

    //функция для добавления e-mail для нового пользователя
    public void newPersonEmails(PersonDataEmails personDataEmails) {
        type(By.name("email"), personDataEmails.getEmail1());
        type(By.name("email2"), personDataEmails.getEmail2());
    }

    //функция для добавления телефонов нового пользователя
    public void newPersonPhones(PersonDataPhones personDataPhones) {
        type(By.name("home"), personDataPhones.getHomePhone());
        type(By.name("mobile"), personDataPhones.getMobPhone());
        type(By.name("work"), personDataPhones.getWorkPhone());
        type(By.name("fax"), personDataPhones.getFax());
    }

    //функция подтверждения создания нового пользователя (кнопка Enter)
    public void submitNewPersonCreation() {
      click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    //функция для добавления ФИО нового пользователя
    public void newPersonName(PersonDataName personDataName) {
        type(By.name("firstname"), personDataName.getName());
        type(By.name("middlename"), personDataName.getMiddlename());
        type(By.name("lastname"), personDataName.getLastname());

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
        wd.switchTo().alert().accept();
    }






}
