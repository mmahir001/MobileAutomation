package pages;

import home.MainPage;
import main.MainAPI;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class MainPageTest extends MainAPI {

    MainPage mainPage;

    @BeforeMethod
    public void initialize() {
        mainPage = PageFactory.initElements(this.ad, MainPage.class);
    }

    @Test
    public void clickMenuButton() throws Exception {
        mainPage.clickMenu();
    }

}


