package co.uk.zoopla.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SearchResultPage extends BasePage
{
    public SearchResultPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (css = "#content h1")
    private WebElement pageTitle;
    @FindBy (css = "listing-results-price.text-price")
    public List<WebElement>results;

    public void isSearchResultDisplayed()
    {
        Assert.assertTrue(pageTitle.isDisplayed());
    }
    public void isCorrectURLDisplayed(String location)
    {
        driver.getCurrentUrl().contains(location.toLowerCase());
    }
    public void isPropertyTypeDisplayed(String property)
    {
       String title= pageTitle.getText();
       Assert.assertTrue(title.contains(property));
    }
    public void isLocationDisplayed(String location)
    {
String title = pageTitle.getText();
Assert.assertTrue(title.contains(location));
    }
public ProductDetailsPage clickOnARandomResult()
{
    Random random = new Random();
    int randomNumber = random.nextInt(results.size()-1);
    results.get(randomNumber).click();
        return new ProductDetailsPage(driver);
}
}
