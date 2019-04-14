package main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends MainAPI{

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]\n")
    WebElement burger;

    public void clickBurger(){
        burger.click();
    }
}
