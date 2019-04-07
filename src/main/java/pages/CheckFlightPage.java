package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckFlightPage extends Page {

    @FindBy(xpath = ".//a[text()='ITINERARY']")
    WebElement itinerary;

    @FindBy(xpath = ".//a[text()='PROFILE']")
    WebElement profile;

    @FindAll({
            @FindBy(xpath = ".//input[@name='outFlight']")
    })
    List<WebElement> outFlight;

    @FindAll({
            @FindBy(xpath = ".//input[@name='inFlight']")
    })
    List<WebElement> inFlight;

    @FindBy(xpath = ".//input[@name='reserveFlights']")
    WebElement continueButton;

    public CheckFlightPage(WebDriver driver) {
        super(driver);
        url = "http://newtours.demoaut.com/mercuryreservation2.php";
    }

    public void checkFlight(final int outFlight, final int inFlight){
        this.outFlight.get(outFlight).click();
        this.inFlight.get(inFlight).click();
        continueButton.click();
    }
}
