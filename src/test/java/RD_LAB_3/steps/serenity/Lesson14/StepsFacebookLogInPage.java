package RD_LAB_3.steps.serenity.Lesson14;

import RD_LAB_3.pages.Lesson14.FacebookLogInPage;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import org.junit.Assert;

public class StepsFacebookLogInPage {

    FacebookLogInPage facebookLogInPage;

    @Step
    public void get_element_Error_Txt() {
        facebookLogInPage.elementErrorTxt();
    }

    @Step
    public void compare_ErrorTxt_Where_WrongPass(String expectedMessage) {
        Assertions.assertThat(facebookLogInPage.elementErrorTxt()).isEqualTo(expectedMessage);
    }
}
