package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sign_inPage extends Page {
    @FindBy(xpath = ".//input[@name='userName']")
    WebElement userName;

    @FindBy(xpath = ".//input[@name='password']")
    WebElement password;

    @FindBy(xpath = ".//input[@name='login']")
    WebElement signIn;

    public Sign_inPage(WebDriver webDriver) {
        super(webDriver);
        url = "http://newtours.demoaut.com/";
    }

    public void signUp(String login, String password){
        userName.sendKeys(login);
        this.password.sendKeys(password);
        signIn.click();
    }

    public void toRegister(){
        register.click();
    }

    public void toFlights(){
        flights.click();
    }
}
