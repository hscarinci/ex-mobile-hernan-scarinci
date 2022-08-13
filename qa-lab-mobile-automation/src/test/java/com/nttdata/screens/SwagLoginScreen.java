package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SwagLoginScreen extends PageObject {

    @AndroidFindBy(className = "android.widget.ImageView")
    public static List<WebElement> productsItem;

    //private static WebElement productsItem;
    //@AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Usuario\"]")
    @AndroidFindBy(className="android.widget.EditText")
    private WebElement usuarioInput;

    //@AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Usuario\"]")
    //private WebElement usuarioInput;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Contraseña\"]")
    private WebElement passwordInput;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement botonLogin;

    @AndroidFindBy(className = "android.widget.TextView")
    private WebElement resultText;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Usuario\"]")
    private WebElement validarTituloPage;



    public void enterUsuarioInput(String usuario) {
        usuarioInput.click();
        usuarioInput.sendKeys(usuario);
    }

    public void enterPasswordInput(String password) {
        passwordInput.click();
        passwordInput.sendKeys(password);
    }

    public void botonLogin() {
        botonLogin.click();
    }

    public String getResultText() {
        return resultText.getText();
    }

    public int totalDeitems() {
        return productsItem.size();
    }

    public String getResultTextPage() {

        return validarTituloPage.getText();
    }
}
