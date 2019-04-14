package main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends MainAPI{

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open menu\"]\n")
    WebElement Burger;

    @FindBy(xpath = "//android.widget.TextView[@text='Search Articles']")
    WebElement Search;

    public void Search1() throws Exception{
        Burger.click();
        Search.sendKeys("Brooklyn news");
    }

    public void Search2() throws Exception{
        Burger.click();
        Search.sendKeys("New york news");
    }

    public void Search3() throws Exception{
        Burger.click();
        Search.sendKeys("Bronx news");
    }

    public void Search4() throws Exception{
        Burger.click();
        Search.sendKeys("Long island news");
    }

    public void Search5() throws Exception{
        Burger.click();
        Search.sendKeys("Queens news");
    }

    public void Search6() throws Exception{
        Burger.click();
        Search.sendKeys("Local news");
    }

    public void Search7() throws Exception{
        Burger.click();
        Search.sendKeys("Job news");
    }

    public void Search8() throws Exception{
        Burger.click();
        Search.sendKeys("Advertisement news");
    }

    public void Search9() throws Exception{
        Burger.click();
        Search.sendKeys("Braking news");
    }

    public void Search10() throws Exception{
        Burger.click();
        Search.sendKeys("World news");
    }
}
