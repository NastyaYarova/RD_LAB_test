package RD_LAB_3.pages.Lesson14_GoogleTranslate;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://translate.google.com/")

public class GoogleTranslatePage extends PageObject {

    @FindBy(xpath = "//div[@class='sl-more tlid-open-source-language-list']")
    private WebElementFacade openLanguageButtonLeftSide;

    @FindBy(xpath = "//div[@class='language-list'][1]")
    private WebElementFacade languageRightPanel;

    @FindBy(xpath = "//div[@class='language_list_item_wrapper language_list_item_wrapper-en']")
    private WebElementFacade elementListEn;

    @FindBy(xpath = "//div[@class='tl-more tlid-open-target-language-list']")
    private WebElementFacade openLanguageButtonRightSide;

    @FindBy(xpath = "//div[@class = 'language_list_section']//div[@class = 'language_list_item_icon tl_list_uk_checkmark']")
    private WebElementFacade elementListUk;

    @FindBy(xpath = "//div[@class='language-list'][2]")
    private WebElementFacade languageLeftPanel;

    @FindBy(id = "source")
    private WebElementFacade inputTextField;

    @FindBy(xpath = "//div[@class='text-wrap tlid-copy-target']")
    private WebElementFacade translatedTextField;

    @FindBy(xpath = "//span[@class='tlid-translation translation']")
    private WebElementFacade textTranslated;

    @FindBy(xpath = "//div[@class='gt-def-info'][2]//div[@class='gt-def-row']")
    private WebElementFacade wordDefinitionField;

    public void selectLanguageEnglish() {
        openLanguageButtonLeftSide.click();
        languageRightPanel.waitUntilVisible();
        elementListEn.click();
    }

    public void selectLanguageUkrainian() {
        openLanguageButtonRightSide.click();
        languageLeftPanel.waitUntilVisible();
        elementListUk.click();
    }

    public void inputTranslateTxt(String translateTxt) {
        inputTextField.sendKeys(translateTxt);
    }

    public String getTranslatedText() {
        return textTranslated.getText();
    }

    public Integer getSizeTranslateText() {
        return textTranslated.getText().length();
    }

    public String getDefinitionText() {
        return wordDefinitionField.getText();
    }
}
