package RD_LAB_3.pages.Lesson14;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.facebook.com/")

public class FacebookEnterPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade fieldMail;

    @FindBy(id = "pass")
    private WebElementFacade fieldPassword;

    @FindBy(id = "loginbutton")
    private WebElementFacade buttonLog;

    public FacebookEnterPage inputMail(String mail) {
        fieldMail.sendKeys(mail);
        return new FacebookEnterPage();
    }

    public FacebookEnterPage inputPassword(String password) {
        fieldPassword.sendKeys(password);
        return new FacebookEnterPage();
    }

    public FacebookLogInPage enterFieldPassword() {
        fieldPassword.sendKeys(Keys.RETURN);
        return new FacebookLogInPage();
    }

    public FacebookLogInPage clickButtonLog() {
        buttonLog.click();
        return new FacebookLogInPage();
    }

    public FacebookLogInPage signUp(String mail, String password) {
        this.inputMail(mail);
        this.inputPassword(password);
        this.clickButtonLog();
        this.enterFieldPassword();
        return new FacebookLogInPage();
    }
}
