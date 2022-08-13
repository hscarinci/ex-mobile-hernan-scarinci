package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwagSearchSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;
import org.junit.Assert;

public class SwagSearchStepsDefs {

    @Steps
    SwagSearchSteps swagSearchSteps;

    ////////////Steps
    @When("Ingreso mis credenciales {string} y {string}")
    public void ingresoMisCredencialesY(String usuario, String password) {
        swagSearchSteps.ingresarUsuario(usuario);
        swagSearchSteps.ingresarPassword(password);
        swagSearchSteps.ingresarLogin();

    }


    @Given("que me enuentro en el login de Swag")
    public void queMeEnuentroEnElLoginDeSwag() {
        Assert.assertEquals(swagSearchSteps.getResultTextPage(), "Usuario");
    }

    @Then("valido que aparezca un titulo {string}")
    public void validoQueAparezcaUnTitulo(String textoValidar) {
        Assert.assertEquals(swagSearchSteps.getResultText(), textoValidar);
    }

    @And("valido que exista un items")
    public void validoQueExistaUnItems() {
         int itemsListSize = swagSearchSteps.cantidadItems();
        //prueba: validar que al menos exista un item

        System.out.println("El tamaño de la lista es: " + itemsListSize);

        Assertions.assertThat(itemsListSize>0);

    }
}
