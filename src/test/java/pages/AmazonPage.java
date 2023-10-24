package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement results;

    @FindBy(xpath = "(//div[@class='sg-col-inner'])[8]")
    public WebElement firstItem;

    @FindBy(xpath = "(//span[@class='a-price'])[1]")
    public WebElement aramaSayfasindakiFiyat;

    @FindBy(xpath = "//span[@class='a-price a-text-price a-size-medium apexPriceToPay']")
    public WebElement price;
}
