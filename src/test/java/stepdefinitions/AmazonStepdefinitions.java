package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {
    AmazonPage amazonPage = new AmazonPage();


    @Given("{string} adresine gider")
    public void adresine_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Then("ana sayfaya gittigini test eder")
    public void ana_sayfaya_gittigini_test_eder() {
        String expectedUrl = ConfigReader.getProperty("amazonUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Then("searchBox’i kullanarak {string} icin arama yapar")
    public void search_box_i_kullanarak_nutella_icin_arama_yapar(String aranacakKelime) {
        amazonPage.searchBox.sendKeys(ConfigReader.getProperty(aranacakKelime)+Keys.ENTER);
    }
    @Then("aramanin gerceklestigini Test eder")
    public void aramanin_gerceklestigini_test_eder() {
        String expectedResult = ConfigReader.getProperty("amazonAranacakKelime");
        String actualResult = amazonPage.results.getText();

        System.out.println(actualResult);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Then("{string} icin arama yapildiysa ilk urunu tiklar ve fiyatinin {string} oldugunu test eder")
    public void nutella_icin_arama_yapildiysa_ilk_urunu_tiklar_ve_fiyatinin_oldugunu_test_eder(String aranacakKelime,String fiyat) {

        amazonPage.firstItem.click();


        String actualFiyat = amazonPage.price.getText();

        System.out.println(fiyat);
        System.out.println(actualFiyat);

        Assert.assertEquals(fiyat,actualFiyat);
    }


    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}
