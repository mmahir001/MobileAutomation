package home;

import main.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MainAPI {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Drawer Opened\"]\n")
    WebElement menuButton;

    public void clickMenu() throws Exception{
        menuButton.click();
    }
}
