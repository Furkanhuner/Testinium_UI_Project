package Pages;

import Contants.LoginPageContants;
import base.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;


public class LoginPage extends BasePage implements LoginPageContants {

    private Logger LOGGER = LogManager.getLogger(LoginPage.class);
    String email="hunerfurkan";
    String password="Furkan11";

    public void goToLoginPage (){
        waitSeconds(1);


        String actualTitle;
        actualTitle = driver.getTitle();
        Assert.assertTrue("anasayfada değilsiniz", actualTitle.equals("Üye Giriş Sayfası – Hepsiburada.com"));

    }

    public void Login(){
        waitForElementAndClick(girisYap);
        waitForElementAndClick(girisYapButton);
        waitForElementAndSendKeys(emailText,email);
        waitForElementAndSendKeys(passwordText,password);
        waitForElementAndClick(LoginButton);
        Assert.assertTrue("Hesabım elementi gözükmedi. Login işlemi başarısız.",isElementVisible(submitKontrol,10));
        LOGGER.info("Başarılı şekılde gırış yapıldı.");
    }

}
