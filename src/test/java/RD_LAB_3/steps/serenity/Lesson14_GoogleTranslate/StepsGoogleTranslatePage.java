package RD_LAB_3.steps.serenity.Lesson14_GoogleTranslate;

import RD_LAB_3.pages.Lesson14_GoogleTranslate.GoogleTranslatePage;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

public class StepsGoogleTranslatePage {

    GoogleTranslatePage googleTranslatePage;

    @Step
    public void open_GoogleTranslatePage() {
        googleTranslatePage.open();
    }

    @Step
    public void select_Language_English() {
        googleTranslatePage.selectLanguageEnglish();
    }

    @Step
    public void select_Language_Ukrainian() {
        googleTranslatePage.selectLanguageUkrainian();
    }

    @Step
    public void input_TranslateTxt(String translateTxt){
        googleTranslatePage.inputTranslateTxt(translateTxt);
    }

    @Step
    public void  compare_TranslatedText(String expectedTxt){
        Assertions.assertThat(googleTranslatePage.getTranslatedText()).isEqualTo(expectedTxt);
    }

    @Step
    public void verify_Size_TranslateText(int expectedSize){
        Assertions.assertThat(expectedSize).isEqualTo(googleTranslatePage.getSizeTranslateText());
    }

    @Step
    public void compare_DefinitionText(String expectedDefinition){
        Assertions.assertThat(googleTranslatePage.getDefinitionText()).isEqualTo(expectedDefinition);
    }
}
