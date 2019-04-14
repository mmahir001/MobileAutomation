package tests;

import main.MainAPI;
import main.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest extends MainAPI{
    MainPage mainPage;

    @BeforeMethod
    public void initialize(){
        mainPage = PageFactory.initElements(this.ad, MainPage.class);
    }

    @Test
    public void click(){
        mainPage.clickBurger();
    }

}
