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

    @Test
    public void clickControlsOp()throws Exception{
        catalogPage.clickControls();
    }

    @Test
    public void clickTextFieldOp()throws Exception{
        catalogPage.clickTextFields();
    }

    @Test
    public void clickSearchBarOp()throws Exception{
        catalogPage.clickSearchBar();
    }

    @Test
    public void clickTextViewOp()throws Exception{
        catalogPage.clickTextView();
    }

    @Test
    public void clickPickersOp()throws Exception{
        catalogPage.clickPickers();
    }

    @Test
    public void clickImagesOp()throws Exception{
        catalogPage.clickImages();
    }

    @Test
    public void clickWebOp()throws Exception{
        catalogPage.clickWeb();
    }

    @Test
    public void clickSegmentsOp()throws Exception{
        catalogPage.clickSegments();
    }

    @Test
    public void clickToolbarOp()throws Exception{
        catalogPage.clickToolbar();
    }

    @Test
    public void clickAlertsOp()throws Exception{
        catalogPage.clickAlerts();
    }

    @Test
    public void clickTransitionsOp()throws Exception{
        catalogPage.clickTransitions();
    }

}
