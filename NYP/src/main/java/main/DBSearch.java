package main;

import data.ConnectToSqlDB;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBSearch extends MainAPI{

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static void insertDataIntoDB() {
        List<String> list = getHeaderValue();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(list, "News", "searchVal");
    }
    public static List<String> getHeaderValue() {
        List<String> search = new ArrayList<String>();
        search.add("Daily news");
        search.add("Tech news");
        search.add("Job news");
        search.add("Queens news");
        search.add("New york crimes");
        return search;
    }
    public List<String> getUserDatafromDB() throws Exception {
        //  TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<String>();
        list = connectToSqlDB.readDataBase("News", "searchVal");
        System.out.println(list);
        return list;
    }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")
    WebElement searchBox;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")
    WebElement searchBox1;

    public WebElement getSearchInputWebElement(String value) {
        //   TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //ad.findElement(By.xpath("com.ebay.mobile:id/search_box")).sendKeys(value,Keys.ENTER);
        typeByXpath("//android.widget.TextView[@text='Search eBay']",value, Keys.ENTER);
        return searchBox;
        //searchBox.click();
//        searchBox.sendKeys("iphone", Keys.ENTER);
    }
    public WebElement getSubmitButtonWebElement() {
        // TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBox1.submit();
        return searchBox1;
    }
    public void searchFor(String value){
        //TestLogger.log(getClass().getSimpleName() + ": " + MobileAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+ " "+ value);
        getSearchInputWebElement(value).sendKeys(value);
    }
    public void submitSearchButton(){
        //  TestLogger.log(getClass().getSimpleName() + ": " + MainAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSubmitButtonWebElement().click();
    }
    public void clearInput(){
        // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBox.clear();
    }

    public void searchItemsAndSubmitButton()throws Exception, IOException, SQLException, ClassNotFoundException{
        //  TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = getUserDatafromDB();
        for(int i=0; i<list.size(); i++) {
            getSearchInputWebElement(list.get(i));
            itemFoundOnSearch(list.get(i));
            clearInput();
        }
    }
    public void itemFoundOnSearch(String value){
        // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName())+" "+ value);
        Assert.assertEquals(value,value);
    }

    public WebElement getSearchInputField() {
        return searchBox;
    }

    public void setSearchInputField(WebElement searchInputField) {
        this.searchBox = searchInputField;
    }

    public void searchItems()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> itemList = getUserDatafromDB();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
            //validate items
        }
    }
    public static void main(String[] args) throws Exception {
        insertDataIntoDB();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("search1", "items");
        for (String st : list) {
            System.out.println(st);
        }
    }
}
