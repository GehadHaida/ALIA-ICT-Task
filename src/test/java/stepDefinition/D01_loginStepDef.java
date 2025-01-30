package stepDefinition;

import io.cucumber.java.en.Given;
import pages.P01_login;

public class D01_loginStepDef {

    P01_login login = new P01_login();

    @Given("User open Nazeel Staging and log in with a valid username, password and access code")
    public void userLogIn()
    {
        login.enterUsername().sendKeys("Gehad Haida");
        login.enterPassword().sendKeys("Gh@123456");
        login.accessCode().sendKeys("01373");
        login.loginClickBtn().click();
    }
}
