package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page {

  @FindBy(xpath = ".//a[text()='Home']")
  protected WebElement home;

  @FindBy(xpath = ".//a[text()='Flights']")
  protected WebElement flights;

  @FindBy(xpath = ".//a[text()='Hotels']")
  protected WebElement hotels;

  @FindBy(xpath = ".//a[text()='carRentals']")
  protected WebElement carRentals;

  @FindBy(xpath = ".//a[text()='Cruises']")
  protected WebElement cruises;

  @FindBy(xpath = ".//a[text()='Destinations']")
  protected WebElement destinations;

  @FindBy(xpath = ".//a[text()='Vacations']")
  protected WebElement vacations;

  @FindBy(xpath = ".//a[text()='SIGN-ON']")
  protected WebElement sign_on;

  @FindBy(xpath = ".//a[text()='REGISTER']")
  protected WebElement register;

  @FindBy(xpath = ".//a[text()='SUPPORT']")
  protected WebElement support;

  @FindBy(xpath = ".//a[text()='CONTACT']")
  protected WebElement contact;

  public String url;

  protected WebDriver driver;

  /*
   * Constructor injecting the WebDriver interface
   * 
   * @param webDriver
   */
  public Page(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public String getTitle() {
    return driver.getTitle();
  }

}
