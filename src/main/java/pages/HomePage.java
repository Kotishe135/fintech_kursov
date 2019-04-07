package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Sample page
 */
public class HomePage extends Sign_inPage {

    @FindBy(xpath = ".//a(text()='your destination')")
    WebElement yourDestination;

    @FindBy(xpath = ".//a(text()='featured vacation destinations')")
    WebElement featuredDestinations;

    @FindBy(xpath = ".//a(text()='Registr here')")
    WebElement registrHere;

    @FindBy(xpath = ".//a(text()='Business Travel @ About.com')")
    WebElement buisnessTravel;

    @FindBy(xpath = ".//a(text()='Salon Travel')")
    WebElement salonTravel;

    public HomePage(WebDriver webDriver) {
      super(webDriver);
      url = "http://newtours.demoaut.com/mercurywelcome.php";
  }

}
