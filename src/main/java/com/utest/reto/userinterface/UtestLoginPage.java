package com.utest.reto.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
//import org.openqa.selenium.By;

public class UtestLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON= Target.the("botón que nos muestra el formulario para registro")
            .located(By.xpath("//a[@class=\"unauthenticated-nav-bar__sign-up\"]"));


    }





