package com.utest.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Complete extends PageObject {

    public static final Target PASSWORD= Target.the("PASSWORD")
            .located(By.xpath("//input[@id=\"password\"]"));

    public static final Target CONFIRM_PASSWORD= Target.the("CONFIRM PASSWORD")
            .located(By.xpath("//input[@id=\"confirmPassword\"]"));

    public static final Target CHECK_ONE= Target.the("CHECK ONE")
            .located(By.xpath("//span[@ng-class=\"{error: userForm.termOfUse.$error.required}\"]"));

    public static final Target CHECK_TWO= Target.the("CHECK TWO")
            .located(By.xpath("//span[@ng-class=\"{error: userForm.privacySetting.$error.required}\"]"));

    public static final Target COMPLETE_BUTTON= Target.the("botón que envia a LAST STEP ")
            .locatedBy("(//a[@aria-label=\"Complete Setup\"]");

}
