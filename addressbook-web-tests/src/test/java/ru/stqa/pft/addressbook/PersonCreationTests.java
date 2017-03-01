import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.PersonDataEmails;
import ru.stqa.pft.addressbook.PersonDataName;
import ru.stqa.pft.addressbook.PersonDataPhones;

public class PersonCreationTests {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost:8080/addressbook/");

        login("admin", "secret");


    }

    //функция для авторизации в приложении с заданными логином и паролем
    private void login(String username, String password) {
        wd.findElement(By.id("LoginForm")).click();
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.id("LoginForm")).click();
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    
    @Test
    public void testPersonCreation() {

        gotoNewPersonPage();

        newPersonName(new PersonDataName("Семен", "Семенович", "Семенов"));

        newPersonPhones(new PersonDataPhones("+74959998877", "+99091234567", "+79803214576", "+74996785034"));

        newPersonEmails(new PersonDataEmails("test1@email.com", "test2@email.com"));

        submitNewPersonCreation();
        gotoHomePage();
    }

   //функция для добавления e-mail для нового пользователя
    private void newPersonEmails(PersonDataEmails personDataEmails) {
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(personDataEmails.getEmail1());
        wd.findElement(By.name("email2")).click();
        wd.findElement(By.name("email2")).clear();
        wd.findElement(By.name("email2")).sendKeys(personDataEmails.getEmail2());
    }
    //функция для добавления телефонов нового пользователя
    private void newPersonPhones(PersonDataPhones personDataPhones) {
        wd.findElement(By.name("home")).click();
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys(personDataPhones.getHomePhone());
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(personDataPhones.getMobPhone());
        wd.findElement(By.name("work")).click();
        wd.findElement(By.name("work")).clear();
        wd.findElement(By.name("work")).sendKeys(personDataPhones.getWorkPhone());
        wd.findElement(By.name("fax")).click();
        wd.findElement(By.name("fax")).clear();
        wd.findElement(By.name("fax")).sendKeys(personDataPhones.getFax());
    }

    //функция подтверждения создания нового пользователя (кнопка Enter)
    private void submitNewPersonCreation() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    //функция для добавления ФИО нового пользователя
    private void newPersonName(PersonDataName personDataName) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(personDataName.getName());
        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(personDataName.getMiddlename());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(personDataName.getLastname());

    }

    //переход на страницу создания нового пользователя add new
    private void gotoNewPersonPage() {
        wd.findElement(By.linkText("add new")).click();
    }

    //переход на домашнюю страницу home
    private void gotoHomePage() {
        wd.findElement(By.linkText("home")).click();
    }


    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
