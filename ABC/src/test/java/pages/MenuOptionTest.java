package pages;

import home.MenuOptions;
import main.MainAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MenuOptionTest extends MainAPI {

    MenuOptions menuOptions;
    @BeforeMethod
    public void initialize(){
        menuOptions = PageFactory.initElements(this.ad, MenuOptions.class);
    }

    @Test
    public void clickTop() throws Exception{
        menuOptions.clickTopStories();
    }
}
