package com.utest.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Devices extends PageObject {

    public static final Target SIGUIENTE_DEVICES_BUTTON= Target.the("botón que envia a DEVICES ")
            .located(By.xpath("(//div[@class='pull-right next-step']//strong[contains(text(),'Next: Devices')]"));

}
