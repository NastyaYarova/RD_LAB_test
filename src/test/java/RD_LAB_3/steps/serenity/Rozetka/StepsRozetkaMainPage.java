package RD_LAB_3.steps.serenity.Rozetka;

import RD_LAB_3.pages.Rozetka.RozetkaMainPage;
import net.thucydides.core.annotations.Step;

public class StepsRozetkaMainPage {

    RozetkaMainPage rozetkaMainPage;

    @Step
    public void open_RozetkaMainPage(){
        rozetkaMainPage.open();
    }

    @Step
    public void input_Goods(String goodsName){
        rozetkaMainPage.inputGoods(goodsName);
    }

    @Step
    public void click_Button(){
        rozetkaMainPage.clickButton();
    }
}
