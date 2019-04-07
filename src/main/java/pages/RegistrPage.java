package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrPage extends Page {

    @FindBy(xpath = ".//input[@name='firstName']")
    WebElement firstName;

    @FindBy(xpath = ".//input[@name='lastName']")
    WebElement lastName;

    @FindBy(xpath = ".//input[@name='phone']")
    WebElement phone;

    @FindBy(xpath = ".//input[@name='userName']")
    WebElement email;

    @FindBy(xpath = ".//input[@name='address1']")
    WebElement address1;

    @FindBy(xpath = ".//input[@name='address2']")
    WebElement address2;

    @FindBy(xpath = ".//input[@name='city']")
    WebElement city;

    @FindBy(xpath = ".//input[@name='state']")
    WebElement state;

    @FindBy(xpath = ".//input[@name='postalCode']")
    WebElement postalCode;

    @FindBy(xpath = ".//select[@name='country']")
    WebElement country;

    @FindBy(xpath = ".//input[@name='email']")
    WebElement userName;

    @FindBy(xpath = ".//input[@name='password']")
    WebElement password;

    @FindBy(xpath = ".//input[@name='confirmPassword']")
    WebElement confirmPassword;

    @FindBy(xpath = ".//input[@name='register']")
    WebElement submit;

    public RegistrPage(WebDriver driver) {
        super(driver);
        url = "http://newtours.demoaut.com/";
    }

    public void fillRegisterPage(String firstName, String lastName, String phone,
                                 String email, String address1, String address2,
                                 String city, String state, String postalCode,
                                 String country, String userName, String password,
                                 String confirmPassword){
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.phone.sendKeys(phone);
        this.email.sendKeys(email);
        this.address1.sendKeys(address1);
        this.address2.sendKeys(address2);
        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.postalCode.sendKeys(postalCode);
        this.country.sendKeys(country);
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(confirmPassword);
        submit.click();
    }
}
