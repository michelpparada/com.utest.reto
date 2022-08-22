package com.utest.reto.tasks;

import com.utest.reto.userinterface.*;
//import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onthePage() {

        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestLoginPage.LOGIN_BUTTON),
        Enter.theValue("Ingresa tu nombre").into(Personal.LASTNAME),
        Enter.theValue("ingresa tus apellidos").into(Personal.LASTNAME),
        Enter.theValue("Ingresa tu correo electrónico").into(Personal.EMAIL),
        Enter.theValue("Ingresa tu mes de nacimiento").into(Personal.MONTH),
        Enter.theValue("Ingresa tu dia de nacimiento").into(Personal.DAY),
        Enter.theValue("Ingresa tu año de nacimiento").into(Personal.YEAR),
        Click.on(SiguienteLocation.SIGUIENTE_UBICACION_BUTTON),
        Click.on(Devices.SIGUIENTE_DEVICES_BUTTON),
        Click.on((Next_Step.LAST_STEP_BUTTON)),
        Enter.theValue("Ingresa tu password").into(Complete.PASSWORD),
        Enter.theValue("Confirma tu password").into(Complete.CONFIRM_PASSWORD),
        Click.on(Complete.CHECK_ONE),
        Click.on(Complete.CHECK_TWO),
        Click.on(Complete.COMPLETE_BUTTON)
        );


    }
    public static Performable makeInformation(){
        return Tasks.instrumented(Login.class);
    }
}

