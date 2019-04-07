package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FlightsPage extends Page{

    @FindBy(xpath = ".//a[text()='ITINERARY']")
    WebElement itinerary;

    @FindBy(xpath = ".//a[text()='PROFILE']")
    WebElement profile;

    @FindAll({
            @FindBy(xpath = ".//input[@value='roundtrip']"),
            @FindBy(xpath = ".//input[@value='oneway']")
    })
    List<WebElement> types;

    @FindBy(xpath = ".//select[@name='passCount']")
    WebElement passCount;

    @FindBy(xpath = ".//select[@name='fromPort']")
    WebElement fromPort;

    @FindBy(xpath = ".//select[@name='fromMonth']")
    WebElement fromMonth;

    @FindBy(xpath = ".//select[@name='fromDay']")
    WebElement fromDay;

    @FindBy(xpath = ".//select[@name='toPort']")
    WebElement toPort;

    @FindBy(xpath = ".//select[@name='toMonth']")
    WebElement toMonth;

    @FindBy(xpath = ".//select[@name='toDay']")
    WebElement toDay;

    @FindAll({
            @FindBy(xpath = ".//input[@value='Coach']"),
            @FindBy(xpath = ".//input[@value='Business']"),
            @FindBy(xpath = ".//input[@value='First']")
    })
    List<WebElement>servClass;

    @FindBy(xpath = ".//select[@name='airline']")
    WebElement airline;

    @FindBy(xpath = ".//input[@name='findFlights']")
    WebElement continueButton;

    public FlightsPage(WebDriver driver) {
        super(driver);
        url = "http://newtours.demoaut.com/mercuryreservation.php";
    }

    public void findFlights(int type, String passangers, String departingFrom, String fromMonth, String fromDay,
                            String arrivingIn, String toMonth, String toDay, int servClass, String airline){
        types.get(type).click();
        passCount.sendKeys(passangers);
        fromPort.sendKeys(departingFrom);
        this.fromMonth.sendKeys(fromMonth);
        this.fromDay.sendKeys(fromDay);
        toPort.sendKeys(arrivingIn);
        this.toMonth.sendKeys(toMonth);
        this.toDay.sendKeys(toDay);
        this.servClass.get(servClass).click();
        this.airline.sendKeys(airline);
        continueButton.click();
    }
}
