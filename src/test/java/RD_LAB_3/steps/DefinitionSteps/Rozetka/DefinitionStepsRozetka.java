package RD_LAB_3.steps.DefinitionSteps.Rozetka;

import RD_LAB_3.pages.Rozetka.RozetkaHairStylingToolsPage;
import RD_LAB_3.pages.Rozetka.RozetkaMainPage;
import RD_LAB_3.steps.serenity.Rozetka.StepsRozetkaHairStylingToolsPage;
import RD_LAB_3.steps.serenity.Rozetka.StepsRozetkaMainPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class DefinitionStepsRozetka {
    @Steps
    StepsRozetkaMainPage stepsRozetkaMainPage;
    @Steps
    StepsRozetkaHairStylingToolsPage stepsRozetkaHairStylingToolsPage;

    @Managed
    WebDriver driver;

    @Given("the user is on the rozetkaMain page")
    public void the_user_is_on_the_rozetkaMain_page() {
        stepsRozetkaMainPage.open_RozetkaMainPage();
    }

    @When("the user input the goods '$goodsName'")
    public void the_user_input_the_goods(String goodsName) {
        stepsRozetkaMainPage.input_Goods(goodsName);
    }

    @When("the user click on button search")
    public void When_the_user_click_on_button_search() {
        stepsRozetkaMainPage.click_Button();
    }

    @When("the user input minPrice '$priceMin'")
    public void the_user_input_minPrice(int priceMin) {
        stepsRozetkaHairStylingToolsPage.input_MinPrice(priceMin);
    }

    @When("the user input maxPrice '$priceMax'")
    public void the_user_input_maxPrice(int priceMax) {
        stepsRozetkaHairStylingToolsPage.input_MaxPricee(priceMax);
    }

    @When("the user click on priceButton")
    public void the_user_click_on_priceButton() {
        stepsRozetkaHairStylingToolsPage.click_PriceButton();
    }

    @Then("they should see '$expectedSize' goods")
    public void they_should_see_expectedNumber_goods(int expectedSize) {
        stepsRozetkaHairStylingToolsPage.priceList_get_Size(expectedSize);
    }

    @Then("they should see the goods in the range '$priceMin' to '$priceMax'")
    public void they_should_see_the_goods_in_the_range(int priceMin, int priceMax){
        stepsRozetkaHairStylingToolsPage.verify_Price_In_Range(priceMin,priceMax);
    }
}
