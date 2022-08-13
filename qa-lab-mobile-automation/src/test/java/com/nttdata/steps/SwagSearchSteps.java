package com.nttdata.steps;

import com.nttdata.screens.SwagLoginScreen;
import org.openqa.selenium.WebDriver;


public class SwagSearchSteps {
    SwagLoginScreen swagLoginScreen;

    private WebDriver driver;



    public void ingresarUsuario(String usuario) {

        swagLoginScreen.enterUsuarioInput(usuario);
    }


    public void ingresarPassword(String password) {

        swagLoginScreen.enterPasswordInput(password);
    }

    public void ingresarLogin() {

        swagLoginScreen.botonLogin();
    }


    public String getResultText() {

        return swagLoginScreen.getResultText();
    }

    public int cantidadItems() {

        return swagLoginScreen.totalDeitems();

    }

    public String getResultTextPage() {
        return swagLoginScreen.getResultTextPage();
    }
}
