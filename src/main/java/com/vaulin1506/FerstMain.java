package com.vaulin1506;



import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.selected;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static utils.utils.getRandomInt;


public class FerstMain {

    String mobName = "Гоблин",
    mobDanger = "1/4  - 50 опыта";
    String mobHit;

    @BeforeAll
    static void setUp(){
        Configuration.holdBrowserOpen = true;
        //Configuration.bowserSize = "1920x1080";
        //Configuration.baseURL = "https://dnd.su/bestiary/"
    }

    @Test
    public void statBlock() {
        open("https://dnd.su/bestiary/");
        $(byName("search")).setValue(mobName);
        //$(byName("danger")).$(byText(mobDanger)).click();
        $(By.cssSelector(".col-3_lg-4_sm-6_xs-12 .if")).click();
        //$(By.cssSelector(."if-list__item-title"_)).
        //$(byText(mobDanger)).click();
        $$(".if-list__item-title").findBy(text(mobDanger)).click();
        $(".btn-green").click();
        //$(".if-wrapper__live_search").setValue(mobName);
        //if if-live_search if-empty has_icon
        $(".item-link").shouldHave(text(mobName));
        $(".svg.svg-16 svg--d6").click();

        //$("data-type", "middle").getSelectedValue(mobHit);
        //$(".params > li:nth-child(3)").shouldHave(text("7"));
                //(new int [mobHit]);
        //System.out.println(mobHit);


    }
    public void rollD () {
        int d20 = getRandomInt(1, 20);

        System.out.println(d20);

    }

}