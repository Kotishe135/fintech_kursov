import pages.*;
import logger.EventHandler;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BaseTest {
    protected EventFiringWebDriver driver;
    protected HomePage homePage;
    protected Sign_inPage sign_inPage;
    protected RegistrPage registrPage;
    protected SuccessRegistrPage successRegistrPage;
    protected FlightsPage flightsPage;
    protected CheckFlightPage checkFlightPage;
    protected BookAFlight bookAFlight;

    @Before
    public  void setUp(){
        System.setProperty("webdriver.gecko.driver", "C:\\igry\\java\\geckodriver.exe");
        driver = new EventFiringWebDriver(new FirefoxDriver());
        driver.register(new EventHandler());
        homePage = new HomePage(driver);
        sign_inPage = new Sign_inPage(driver);
        flightsPage = new FlightsPage(driver);
        registrPage = new RegistrPage(driver);
        successRegistrPage = new SuccessRegistrPage(driver);
        checkFlightPage = new CheckFlightPage(driver);
        bookAFlight = new BookAFlight(driver);
        driver.get(homePage.url);
    }

    @After
    public void close(){
        driver.quit();
    }
}
