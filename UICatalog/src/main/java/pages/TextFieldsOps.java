package pages;

import main.MainAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextFieldsOps extends MainAPI {

    @FindBy(xpath = "//XCUIElementTypeStaticText[@value='TextFields']")
    WebElement textFields;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Normal\"]\n")
    WebElement uitexfield;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Rounded\"]\n")
    WebElement uitexfieldRounded;

    @FindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"Secure\"]\n")
    WebElement uitexfieldSecured;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Check\"]\n")
    WebElement uitexfieldWithLV;



    public void enterTextFields() throws Exception{
        textFields.click();
        uitexfield.sendKeys("Example");
    }

    public void enterTextFieldsR() throws Exception{
        textFields.click();
        uitexfieldRounded.sendKeys("Mahir");
    }

    public void enterTextFieldsS() throws Exception{
        textFields.click();
        uitexfieldSecured.sendKeys("Muhtasim");
    }

    public void enterTextFieldsW() throws Exception{
        textFields.click();
        uitexfieldWithLV.sendKeys("Ahmed");
    }



}
