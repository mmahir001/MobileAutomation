package tests;

import main.MainAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CatalogPage;
import pages.TextFieldsOps;

public class TextFieldOpsTest extends MainAPI {
    TextFieldsOps textFieldsOps;

    @BeforeMethod
    public void initialize() {
        textFieldsOps = PageFactory.initElements(this.ad, TextFieldsOps.class);
    }

    @Test
    public void textField1() throws Exception{
        textFieldsOps.enterTextFields();
    }

    @Test
    public void textField2() throws Exception{
        textFieldsOps.enterTextFieldsR();
    }

    @Test
    public void textField3() throws Exception{
        textFieldsOps.enterTextFieldsS();
    }

    @Test
    public void textField4() throws Exception{
        textFieldsOps.enterTextFieldsW();
    }

}
