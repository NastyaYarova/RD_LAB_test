package RD_LAB_3.steps.DefinitionSteps.Lesson14_GoogleTranslate;

import RD_LAB_3.steps.serenity.Lesson14_GoogleTranslate.StepsGoogleTranslatePage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class DefinitionStepsGoogleTranslatePage {
    @Steps
    StepsGoogleTranslatePage stepsGoogleTranslatePage;

    @Managed
    WebDriver driver;

    @Given("the user is on the google translate page")
    public void the_user_is_on_the_google_translate_page(){
        stepsGoogleTranslatePage.open_GoogleTranslatePage();
    }

    @Given("selected languages from 'английский' to 'украинский'")
    public void selected_languages_from_en_to_uk(){
        stepsGoogleTranslatePage.select_Language_English();
        stepsGoogleTranslatePage.select_Language_Ukrainian();
    }

    @When("the user looks up the translation of the word '$word'")
    public void the_user_looks_up_the_translation_of_the_word_word(String word){
        stepsGoogleTranslatePage.input_TranslateTxt(word);
    }

    @Then("they should see the translation '$transtatedWord'")
    public void they_should_see_the_translation_transtatedWord(String transtatedWord){
        stepsGoogleTranslatePage.compare_TranslatedText(transtatedWord);
    }

    @Then("number of characters must be '$expectedSize'")
    public void number_of_characters_must_be_expectedSize(int expectedSize){
        stepsGoogleTranslatePage.verify_Size_TranslateText(expectedSize);
    }

    @Then("they should see the definition '$expectedDefinition'")
    public void they_should_see_the_definition_expectedDefinition(String expectedDefinition){
        stepsGoogleTranslatePage.compare_DefinitionText(expectedDefinition);
    }
}
