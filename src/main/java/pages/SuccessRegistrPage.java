package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessRegistrPage extends Page{
    @FindBy(xpath = ".//a[text()=' sign-in ']")
    WebElement signIn;

    public SuccessRegistrPage(WebDriver driver) {
        super(driver);
        url = "http://newtours.demoaut.com/create_account_success.php";
    }

    public void toSignOn(){
        signIn.click();
    }
}
