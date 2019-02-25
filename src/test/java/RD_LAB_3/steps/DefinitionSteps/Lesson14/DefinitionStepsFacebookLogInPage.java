package RD_LAB_3.steps.DefinitionSteps.Lesson14;

import RD_LAB_3.pages.Lesson14.FacebookLogInPage;
import RD_LAB_3.steps.serenity.Lesson14.StepsFacebookEnterPage;
import RD_LAB_3.steps.serenity.Lesson14.StepsFacebookLogInPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class DefinitionStepsFacebookLogInPage {

    @Steps
    StepsFacebookEnterPage stepsFacebookEnterPage;

    @Steps
    StepsFacebookLogInPage stepsFacebookLogInPage;

    @Managed
    WebDriver driver;

    @Given("user is on the FscebookEnterPage")
    public void user_is_on_the_FscebookEnterPage() {
        stepsFacebookEnterPage.open_facebookEnterPage();
    }

    @When("user input '$mail'")
    public void user_input_mail(String mail) {
        stepsFacebookEnterPage.input_Mail(mail);
    }

    @When("user input wrong '$password'")
    public void user_input_wrong_password(String password) {
        stepsFacebookEnterPage.input_Password(password);
    }

    @When("user click on the button logIn")
    public void user_click_on_the_button_logIn() {
        stepsFacebookEnterPage.click_Button_Log();
    }

    @Then("they should see the ErrorMessage '$expectedMessage'")
    public void they_should_see_the_ErrorMessage(String expectedMessage) {
       stepsFacebookLogInPage.compare_ErrorTxt_Where_WrongPass(expectedMessage);
    }
}
