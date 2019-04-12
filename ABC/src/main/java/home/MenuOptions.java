package home;

import main.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuOptions extends MainAPI {
    @FindBy (xpath = "//android.widget.ImageButton[@content-desc=\"Drawer Opened\"]\n")
    WebElement burger;

    @FindBy (xpath = "//android.widget.TextView[@text='TOP STORIES']")
    WebElement topStories;

    public void clickTopStories() throws Exception{
        burger.click();
        topStories.click();
    }

}
