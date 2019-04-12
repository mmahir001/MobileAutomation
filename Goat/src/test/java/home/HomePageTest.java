package home;

import main.HomePage;
import main.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends MainAPI {
    HomePage homePage;

    @BeforeMethod
    public void initialization() {
        homePage = PageFactory.initElements(this.ad, HomePage.class);
    }

    @Test
    public void closePopUp() throws Exception {
        homePage.clickSearch();
    }
}
