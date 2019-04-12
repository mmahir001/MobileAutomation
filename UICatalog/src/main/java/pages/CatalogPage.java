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
}
