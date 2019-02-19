package RD_LAB_3.steps.serenity.Lesson14;

import RD_LAB_3.pages.Lesson14.FacebookEnterPage;
import RD_LAB_3.pages.Lesson14.FacebookLogInPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class StepsFacebookEnterPage {
    FacebookEnterPage facebookEnterPage;

    @Step
    public void open_facebookEnterPage(){
        facebookEnterPage.open();
    }

    @Step
    public void  input_Mail(String mail){
       facebookEnterPage.inputMail(mail);
    }

    @Step
    public void  input_Password(String password){
        facebookEnterPage.inputPassword(password);
    }

    @Step
    public void click_Button_Log(){
        facebookEnterPage.clickButtonLog();
    }

    @Step
    public void enter_Field_Password(){
        facebookEnterPage.enterFieldPassword();
    }
}
