package pages;

import main.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends MainAPI {

    @FindBy (xpath = "//XCUIElementTypeStaticText[@name='Buttons']")
    WebElement CatalogButton;

    public void clickButton() throws Exception{
        CatalogButton.click();
    }

    @FindBy (xpath = "//XCUIElementTypeStaticText[@value='Controls']")
    WebElement controls;

    public void clickControls() throws Exception{
        controls.click();
    }

    @FindBy (xpath = "//XCUIElementTypeStaticText[@value='TextFields']")
    WebElement textFields;

    public void clickTextFields() throws Exception{
        textFields.click();
    }

    @FindBy (xpath = "//XCUIElementTypeStaticText[@value='SearchBar']")
    WebElement searchBar;

    public void clickSearchBar() throws Exception{
        searchBar.click();
    }

    @FindBy (xpath = "//XCUIElementTypeStaticText[@value='TextView']")
    WebElement textView;

    public void clickTextView() throws Exception{
        textView.click();
    }

    @FindBy (xpath = "//XCUIElementTypeStaticText[@value='Pickers']")
    WebElement pickers;

    public void clickPickers() throws Exception{
        pickers.click();
    }

    @FindBy (xpath = "//XCUIElementTypeStaticText[@value='Images']")
    WebElement images;

    public void clickImages() throws Exception{
        images.click();
    }

    @FindBy (xpath = "//XCUIElementTypeStaticText[@value='Web']")
    WebElement web;

    public void clickWeb() throws Exception{
        web.click();
    }

    @FindBy (xpath = "//XCUIElementTypeStaticText[@value='Segments']")
    WebElement segments;

    public void clickSegments() throws Exception{
        segments.click();
    }

    @FindBy (xpath = "//XCUIElementTypeStaticText[@value='Toolbar']")
    WebElement toolbar;

    public void clickToolbar() throws Exception{
        toolbar.click();
    }

    @FindBy (xpath = "//XCUIElementTypeStaticText[@value='Alerts']")
    WebElement alerts;

    public void clickAlerts() throws Exception{
        alerts.click();
    }

    @FindBy (xpath = "//XCUIElementTypeStaticText[@value='Transitions']")
    WebElement transitions;

    public void clickTransitions() throws Exception{
        transitions.click();
    }
}
