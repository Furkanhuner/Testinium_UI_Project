package Pages;

import Contants.SearchPageContants;
import base.BasePage;
import base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class SearchPage extends BasePage implements SearchPageContants {
  String arama ="bilgisayar";
  static String firstPriceText;
    protected WebDriver driver = BaseTest.driver;
    private WebDriverWait wait = new WebDriverWait(driver, 15, 1000);
    public void Search()
    {
        waitForElementAndSendKeys(searchText,arama);
        waitSeconds(4);

        driver.findElement(By.xpath("//input[@placeholder='Evde Kal Sağlıklı Kal']")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//ul[@class='clearfix']/li/a[.='2']")).sendKeys(Keys.DOWN);
         waitForElementAndClick(twoPage);
        Assert.assertTrue("2.sayfada olduğunuz doğrulanamadı.",isElementVisible(seconPageActiveControl,10));

        chooseRandomProduct();
        javaScriptClicker(sepetEkleButton);
        goToBasketAndControlPrice();
        waitForElementAndClick(urunArtır);
        waitForElementAndClick(urunSil);
      waitSeconds(3);

        Assert.assertTrue("Ürün sepeti boş değil.",isElementVisible(sepetControl,5));


    }
public void goToBasketAndControlPrice()
{



    javaScriptClicker(sepetttimButton);
    WebElement secondByPrice = driver.findElement(By.xpath("//div[@class='total-price']/strong"));
    String secondPriceText = secondByPrice.getText();
    System.out.println("Second price :"+secondPriceText);
    Assert.assertEquals("",firstPriceText,secondPriceText);
}

    public void chooseRandomProduct(){


        Random random = new Random();

        List<WebElement> imgSrcList = driver.findElements(By.xpath("//ul[@class='catalog-view clearfix products-container']//p/img"));
        int randomImg = random.nextInt(imgSrcList.size());

        By by =  By.xpath("(//a[@class='product-link']//p/img)["+randomImg+"]");
        System.out.println("Random boutique by : "+by);
        System.out.println("Random boutique by : "+by);
        System.out.println("Random image number : "+randomImg);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).click();
        WebElement byPrice = driver.findElement(By.xpath("//span[@class='highPrice " +
                "                                                              " +
                " lastPrice' or class='lowPrice    " +
                "                                                        lastPrice']"));
        firstPriceText = byPrice.getText();
        System.out.println("First price :"+firstPriceText);

    }

}
