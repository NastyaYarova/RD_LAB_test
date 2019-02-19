package RD_LAB_3.pages.Lesson14;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class FacebookLogInPage extends PageObject {

    @FindBy(xpath = "//div[@class='_4rbf _53ij']")
    private WebElementFacade elementError;

    public String elementErrorTxt() {
        return elementError.getText();
    }

    public boolean compareErrorTxtWrongPass() {
        elementError.waitUntilVisible();
        String elementErrorTxt = elementError.getText();
        if (elementErrorTxt.contains("The password you’ve entered is incorrect. ")) {
            return true;
        } else {
            return false;
        }
    }
}
