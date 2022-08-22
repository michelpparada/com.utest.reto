package com.utest.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Next_Step extends PageObject {

    public static final Target LAST_STEP_BUTTON= Target.the("botón que envia a LAST STEP ")
            .locatedBy("(//a[@aria-label=\"Next - final step\"]");


}
