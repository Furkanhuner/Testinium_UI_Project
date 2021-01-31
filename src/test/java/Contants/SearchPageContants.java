package Contants;

import org.openqa.selenium.By;
import util.ElementInfo;

public interface SearchPageContants {
    public ElementInfo searchText = new ElementInfo("E-posta adresi girilemedi", By.xpath("//div[@class=\"sc-4995aq-4 dNPmGY\"]/input"));
    public ElementInfo twoPage = new ElementInfo("Giriş butonu bulunamadı", By.xpath("//ul[@class='clearfix']/li/a[.='2']"));
    public ElementInfo seconPageActiveControl = new ElementInfo("Giriş butonu bulunamadı", By.xpath("//li[@class='selected']/a[.='2']"));


    public ElementInfo urunListesi = new ElementInfo("Giriş butonu bulunamadı", By.xpath("//ul[@class='catalog-view clearfix products-container']//p/img"));


    public ElementInfo sepetEkleButton = new ElementInfo("Giriş butonu bulunamadı", By.xpath("//button[@id='add-to-basket']"));

    public ElementInfo sepetttimButton = new ElementInfo("Giriş butonu bulunamadı", By.cssSelector(".gg-ui-btn-default.padding-none"));



    public ElementInfo urunSılme = new ElementInfo("Giriş butonu bulunamadı", By.xpath("//div[@class='gg-w-22 gg-d-22 gg-t-21 gg-m-18']/h2[.='Sepetinizde ürün bulunmamaktadır.']"));

    public ElementInfo urunArtır = new ElementInfo("Giriş butonu bulunamadı", By.xpath("//div[@class=\"number-selection clearfix\"]/span[2]"));


    public ElementInfo urunSil = new ElementInfo("Giriş butonu bulunamadı", By.xpath("//div[@class='gg-d-24 hidden-m update-buttons-container']//a[1]"));


    public ElementInfo sepetControl = new ElementInfo("Giriş butonu bulunamadı", By.xpath("//h2[.='Sepetinizde ürün bulunmamaktadır.']"));






    // public ElementInfo searchButton = new ElementInfo("Bul button bulunamadı", By.xpath("//*[@id=\"header-search-find-link\"]"));

    //public ElementInfo twoButton = new ElementInfo("Bul button bulunamadı", By.xpath("//ul[@class='clearfix']//li/a[.='2']"));



}
