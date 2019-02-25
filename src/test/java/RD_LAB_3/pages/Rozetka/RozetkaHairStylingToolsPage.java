package RD_LAB_3.pages.Rozetka;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.locators.WebElementFacadeListItemHandler;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class RozetkaHairStylingToolsPage extends PageObject {

    @FindBy(id = "price[min]")
    private WebElementFacade priseMinField;

    @FindBy(id = "price[max]")
    private WebElementFacade priseMaxField;

    @FindBy(id = "submitprice")
    private WebElementFacade submitPriceButton;

    @FindBy(xpath = "//div[@name='price' and (@class='g-price' or @class='g-price g-price-cheaper')]")
    private List<WebElementFacade> priceList;

    public void inputMinPrice(int priceMin) {
        priseMinField.sendKeys(String.valueOf(priceMin));
    }

    public void inputMaxPrice(int priceMax) {
        priseMaxField.clear();
        priseMaxField.sendKeys(String.valueOf(priceMax));
    }

    public void clickPriceButton() {
        submitPriceButton.click();
    }

    public int priceListSize() {
        return priceList.size();
    }

    public void verifyPriceInRange(int priceMin, int priceMax) {
        for (int i = 0; i < priceList.size(); i++) {
            String price = priceList.get(i).getText();
            price= price.substring(0, price.indexOf("г")-1);
            int priceInt = Integer.valueOf(price);
            assertTrue(priceMin <= priceInt && priceInt <= priceMax);
        }
    }
}
