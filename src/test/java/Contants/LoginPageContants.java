package Contants;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface LoginPageContants {
    public ElementInfo girisYap = new ElementInfo("E-posta adresi girilemedi", By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[3]/div/div[1]/div"));

    public ElementInfo girisYapButton = new ElementInfo("E-posta adresi girilemedi", By.xpath("//div[@class='sc-12t95ss-3 fDarBX']/a[@href=\"https://www.gittigidiyor.com/uye-girisi\"]"));

    public ElementInfo emailText = new ElementInfo("E-posta adresi girilemedi", By.id("L-UserNameField"));

    public ElementInfo passwordText = new ElementInfo("E-posta adresi girilemedi", By.id("L-PasswordField"));

    public ElementInfo LoginButton = new ElementInfo("E-posta adresi girilemedi", By.id("gg-login-enter"));

    public ElementInfo submitKontrol = new ElementInfo("E-posta adresi girilemedi", By.xpath("//span[@class='profile-page-name visible-d visible-w'][.='Hesabım']"));





}
