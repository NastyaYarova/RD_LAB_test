package RD_LAB_3.steps.serenity.Rozetka;

import RD_LAB_3.pages.Rozetka.RozetkaHairStylingToolsPage;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

public class StepsRozetkaHairStylingToolsPage {
    RozetkaHairStylingToolsPage rozetkaHairStylingToolsPage;

    @Step
    public void input_MinPrice(int priceMin){
        rozetkaHairStylingToolsPage.inputMinPrice(priceMin);
    }

    @Step
    public void input_MaxPricee(int priceMax){
        rozetkaHairStylingToolsPage.inputMaxPrice(priceMax);
    }

    @Step
    public void click_PriceButton(){
        rozetkaHairStylingToolsPage.clickPriceButton();
    }

    @Step
    public void priceList_get_Size(int expectedSize){
        Assertions.assertThat(rozetkaHairStylingToolsPage.priceListSize()).isEqualTo(expectedSize);
    }

    @Step
    public void verify_Price_In_Range(int priceMin, int priceMax){
        rozetkaHairStylingToolsPage.verifyPriceInRange(priceMin,priceMax);
    }
}
