package tests;

import main.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ButtonOps;
import pages.CatalogPage;

public class ButtonOpsTest extends MainAPI {
    ButtonOps buttonOps;

    @BeforeMethod
    public void initialize(){
        buttonOps = PageFactory.initElements(this.ad, ButtonOps.class);
    }

    @Test
    public void changeBG()throws Exception{
        buttonOps.interact();
    }

    @Test
    public void arrowButton()throws Exception{
        buttonOps.clickArrow();
    }
}
