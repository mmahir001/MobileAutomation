package tests;

import main.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CatalogPage;

public class CatalogPageTest extends MainAPI {
CatalogPage catalogPage;

    @BeforeMethod
    public void initialize(){
        catalogPage = PageFactory.initElements(this.ad, CatalogPage.class);
}

    @Test
    public void clickButtonTest()throws Exception{
        catalogPage.clickButton();
    }


}
