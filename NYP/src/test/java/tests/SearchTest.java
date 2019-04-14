package tests;

import main.MainAPI;
import main.MainPage;
import main.Search;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends MainAPI{
    Search search;

    @BeforeMethod
    public void initialize(){
        search = PageFactory.initElements(this.ad, Search.class);
    }

    @Test
    public void Search1() throws Exception {
        search.Search1();
    }

    @Test
    public void Search2() throws Exception {
        search.Search2();
    }

    @Test
    public void Search3() throws Exception {
        search.Search3();
    }

    @Test
    public void Search4() throws Exception {
        search.Search4();
    }

    @Test
    public void Search5() throws Exception {
        search.Search5();
    }

    @Test
    public void Search6() throws Exception {
        search.Search6();
    }

    @Test
    public void Search7() throws Exception {
        search.Search7();
    }

    @Test
    public void Search8() throws Exception {
        search.Search8();
    }

    @Test
    public void Search9() throws Exception {
        search.Search9();
    }

    @Test
    public void Search10() throws Exception {
        search.Search10();
    }

}
