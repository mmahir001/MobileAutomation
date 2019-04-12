package pages;

import main.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonOps extends MainAPI {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Buttons']")
    WebElement CatalogButton;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Gray\"]\n")
    WebElement grayBG;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]")
    WebElement arrow;

    public void interact() throws Exception{
        CatalogButton.click();
        grayBG.click();
    }

    public void clickArrow() throws Exception{
        CatalogButton.click();
        arrow.click();
    }

}
