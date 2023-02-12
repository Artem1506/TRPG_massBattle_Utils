package com.vaulin1506;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static utils.utils.getRandomInt;

public class FerstMain {

    String mobName = "Гоблин",
    mobDanger = "1/4  - 50 опыта";

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
        $(By.cssSelector(".col-3_lg-4_sm-6_xs-12 .if")).click();
        $$(".if-list__item-title").findBy(text(mobDanger)).click();
        $(".btn-green").click();
        $(".item-link").shouldHave(text(mobName));
        $(".svg--d6 use").click();
        var mobHit = $(".rolled-hits > span"); // TODO: 12.02.2023 в переменную помещается весь эдемент, а не значение

        System.out.println(mobHit);

        // TODO: 12.02.2023 то же самое через http запросы 
    }

    public void rollD () {
        int d20 = getRandomInt(1, 20);

        System.out.println(d20);

    }

}