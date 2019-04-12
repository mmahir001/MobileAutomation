package home;

import main.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends MainAPI {

    WebDriverWait wait = new WebDriverWait(this.ad, 3);

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Drawer Opened\"]\n")
    WebElement menuButton;

    public void clickMenu() throws Exception{
        menuButton.click();
    }
}
