package com.utest.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Personal extends PageObject {


    public static final Target FIRSTNAME= Target.the("First Name")
            .located(By.xpath("//input@id=\"firstName\"]"));

    public static final Target LASTNAME= Target.the("Last Name")
            .located(By.xpath("//input@id=\"lastName\"]"));

    public static final Target EMAIL= Target.the("Email")
        .located(By.xpath("//input@id=\"email\"]"));

    public static final Target MONTH= Target.the("Month")
            .located(By.xpath("//select@id=\"birthMonth"));

    public static final Target DAY= Target.the("Day")
            .located(By.xpath("//select@id=\"birthDay"));

    public static final Target YEAR= Target.the("Year")
            .located(By.xpath("//select@id=\"birtYear"));

}

