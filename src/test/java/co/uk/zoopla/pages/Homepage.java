package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage
{
public Homepage(WebDriver driver)
{
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
@FindBy(id = "search-input-location")
   private WebElement searchBox;
@FindBy(name = "price_min")
    private WebElement minPrice;
@FindBy(name = "price_max")
    private WebElement maxPrice;
@FindBy(id = "property_type")
    private WebElement propertyType;
@FindBy(id = "beds_min")
    private WebElement noOfBeds;
@FindBy(id = "search-submit")
    private WebElement submitButton;

public void enterLocation(String location)
{
    waitForElementToBeDisplayed(searchBox);
searchBox.clear();
searchBox.sendKeys(location);
}
public void selectMinimumPrice(String miniPrice)
{
    selectElementByVisibleText(minPrice, miniPrice);
}
public void selectMaximumPrice(String maxiPrice)
{
    selectElementByVisibleText(maxPrice, maxiPrice);
}
public void selectNoOfBeds(String beds)
{
    selectElementByVisibleText(noOfBeds, beds);
}
public void selectPropertyType(String property)
{
    selectElementByVisibleText(propertyType, property);
}
public SearchResultPage clickOnSearchButton()
{
    submitButton.click();
    return new SearchResultPage(driver);
}
}
