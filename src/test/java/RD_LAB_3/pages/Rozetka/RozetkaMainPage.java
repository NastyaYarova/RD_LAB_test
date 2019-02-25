package RD_LAB_3.pages.Rozetka;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://rozetka.com.ua/")

public class RozetkaMainPage extends PageObject {

    @FindBy(name = "search")
    private WebElementFacade searchField;

    @FindBy(xpath = "//button[@class='button button_color_green search__button']")
    private WebElementFacade searchButton;

    public void inputGoods(String goodsName) {
        searchField.sendKeys(goodsName);
    }

    public void clickButton() {
        searchButton.click();
    }
}
