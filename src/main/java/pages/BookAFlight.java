package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BookAFlight extends Page {

    @FindAll({
            @FindBy(xpath = ".//input[@name='passFirst0']"),
            @FindBy(xpath = ".//input[@name='passFirst1']"),
            @FindBy(xpath = ".//input[@name='passFirst2']"),
            //@FindBy(xpath = ".//input[@name='passFirst3']")
    })
    List<WebElement> firstName;

    @FindAll({
            @FindBy(xpath = ".//input[@name='passLast0']"),
            @FindBy(xpath = ".//input[@name='passLast1']"),
            @FindBy(xpath = ".//input[@name='passLast2']"),
            //@FindBy(xpath = ".//input[@name='passLast3']")
    })
    List<WebElement> lastName;

    @FindAll({
            @FindBy(xpath = ".//select[@name='pass.0.meal']"),
            @FindBy(xpath = ".//select[@name='pass.1.meal']"),
            @FindBy(xpath = ".//select[@name='pass.2.meal']"),
            //@FindBy(xpath = ".//select[@name='pass.3.meal']")
    })
    List<WebElement> meal;

    @FindBy(xpath = ".//select[@name='creditCard']")
    WebElement creditCard;

    @FindBy(xpath = ".//input[@name='creditnumber']")
    WebElement creditNumber;

    @FindBy(xpath = ".//select[@name='cc_exp_dt_mn']")
    WebElement creditMonth;

    @FindBy(xpath = ".//select[@name='cc_exp_dt_yr']")
    WebElement creditYear;

    @FindBy(xpath = ".//input[@name='cc_frst_name']")
    WebElement ccFirstName;

    @FindBy(xpath = ".//input[@name='cc_mid_name']")
    WebElement ccMiddleName;

    @FindBy(xpath = ".//input[@name='cc_last_name']")
    WebElement ccLastName;

    @FindBy(xpath = ".//input[@name='ticketLess']")
    WebElement ticketLess;

    @FindAll({
            @FindBy(xpath = ".//input[@name='billAddress1']"),
            @FindBy(xpath = ".//input[@name='billAddress2']"),
            @FindBy(xpath = ".//input[@name='billCity']"),
            @FindBy(xpath = ".//input[@name='billState']"),
            @FindBy(xpath = ".//input[@name='billZip']"),
            @FindBy(xpath = ".//select[@name='billCountry']"),
    })
    List<WebElement> billingAddress;


    @FindBy(xpath = ".//input[@name='ticketLess' and last()]")
    WebElement sameAs;

    @FindAll({
            @FindBy(xpath = ".//input[@name='delAddress1']"),
            @FindBy(xpath = ".//input[@name='delAddress2']"),
            @FindBy(xpath = ".//input[@name='delCity']"),
            @FindBy(xpath = ".//input[@name='delState']"),
            @FindBy(xpath = ".//input[@name='delZip']"),
            @FindBy(xpath = ".//select[@name='delCountry']"),
    })
    List<WebElement> deliveryAddress;

    @FindBy(xpath = ".//input[@name='buyFlights']")
    WebElement buyFlights;

    public BookAFlight(WebDriver driver) {
        super(driver);
        url = "http://newtours.demoaut.com/mercurypurchase.php";
    }

    private void fillPass(String[] firstNames, String[] lastNames, String[] meals){
        for(int i = 0; i < this.firstName.size(); i++){
            firstName.get(i).sendKeys(firstNames[i]);
            lastName.get(i).sendKeys(lastNames[i]);
            meal.get(i).sendKeys(meals[i]);
        }
    }

    private void fillCard(String cardType, String cardNum, String cardMonth, String cardYear, String ccFirstName,
                          String ccMidName, String ccLastName){
        creditCard.sendKeys(cardType);
        creditNumber.sendKeys(cardNum);
        creditMonth.sendKeys(cardMonth);
        creditYear.sendKeys(cardYear);
        this.ccFirstName.sendKeys(ccFirstName);
        this.ccMiddleName.sendKeys(ccMidName);
        this.ccLastName.sendKeys(ccLastName);
    }

    private void fillBillingAddress(String address1, String address2, String city, String state, String  postCode,
                                    String country){
        for(int i = 0; i < billingAddress.size()-1; i++){
            billingAddress.get(i).clear();
        }
        billingAddress.get(0).sendKeys(address1);
        billingAddress.get(1).sendKeys(address2);
        billingAddress.get(2).sendKeys(city);
        billingAddress.get(3).sendKeys(state);
        billingAddress.get(4).sendKeys(postCode);
        billingAddress.get(5).sendKeys(country);
    }

    private void fillDeliveryAddress(String address1, String address2, String city, String state, String  postCode,
                                    String country){
        for(int i = 0; i < deliveryAddress.size()-1; i++){
            deliveryAddress.get(i).clear();
        }
        deliveryAddress.get(0).sendKeys(address1);
        deliveryAddress.get(1).sendKeys(address2);
        deliveryAddress.get(2).sendKeys(city);
        deliveryAddress.get(3).sendKeys(state);
        deliveryAddress.get(4).sendKeys(postCode);
        deliveryAddress.get(5).sendKeys(country);
    }

    public void buyFlights(String[] firstNames, String[] lastNames, String[] meals, String cardType, String cardNum,
                           String cardMonth, String cardYear, String ccFirstName, String ccMidName, String ccLastName) {
        fillPass(firstNames, lastNames, meals);
        fillCard(cardType, cardNum, cardMonth, cardYear, ccFirstName, ccMidName, ccLastName);
        ticketLess.click();
        buyFlights.click();
    }

    public void buyFlights(String[] firstNames, String[] lastNames, String[] meals, String cardType, String cardNum,
                           String cardMonth, String cardYear, String ccFirstName, String ccMidName, String ccLastName,
                           String address1, String address2, String city, String state, String  postCode,
                           String country){
        fillPass(firstNames, lastNames, meals);
        fillCard(cardType, cardNum, cardMonth, cardYear, ccFirstName, ccMidName, ccLastName);
        fillBillingAddress(address1, address2, city, state, postCode, country);
        sameAs.click();
        buyFlights.click();
    }
    
    public void buyFlights(String[] firstNames, String[] lastNames, String[] meals, String cardType, String cardNum,
                           String cardMonth, String cardYear, String ccFirstName, String ccMidName, String ccLastName,
                           String billAddress1, String billAddress2, String billCity, String billState, 
                           String  billPostCode, String billCountry, String delAddress1, String delAddress2,
                           String delCity, String delState, String  delPostCode, String delCountry){
        fillPass(firstNames, lastNames, meals);
        fillCard(cardType, cardNum, cardMonth, cardYear, ccFirstName, ccMidName, ccLastName);
        fillBillingAddress(billAddress1, billAddress2, billCity, billState, billPostCode, billCountry);
        fillDeliveryAddress(delAddress1, delAddress2, delCity, delState, delPostCode, delCountry);
        buyFlights.click();
    }
}
