package pages;

import home.MenuOptions;
import home.PopUp;
import main.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopUpTest extends MainAPI {
    PopUp popUp;

    @BeforeMethod
    public void initialization() {
        popUp = PageFactory.initElements(this.ad, PopUp.class);
    }

    @Test
    public void closePopUp() throws Exception{
    popUp.closeAD();
    }
}
