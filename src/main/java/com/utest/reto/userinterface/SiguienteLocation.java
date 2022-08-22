package com.utest.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SiguienteLocation extends PageObject {

    public static final Target SIGUIENTE_UBICACION_BUTTON= Target.the("botón que envia LOCATION")
            .located(By.xpath("(//a[@aria-label=\"Next step - define your location\"]"));
}
