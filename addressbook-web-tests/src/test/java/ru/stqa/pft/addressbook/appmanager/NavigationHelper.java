package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ksu on 02.03.2017.
 */
public class NavigationHelper extends HelperBase{


    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
       click(By.linkText("groups"));
    }

    //переход на страницу создания нового пользователя add new
    public void gotoNewPersonPage() {
        click(By.linkText("add new"));
    }

    //переход на домашнюю страницу home
    public void gotoHomePage() {
        click(By.linkText("home"));
    }


}
