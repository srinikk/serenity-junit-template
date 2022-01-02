package serenityswag.authentication.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import serenityswag.authentication.LoginForm;
import serenityswag.authentication.User;

public class LoginActions extends UIInteractionSteps {
    @Step ("Login as {0}")
    public void as(User user) {

        // driver.get("https://www.saucedemo.com/");
        openUrl("https://www.saucedemo.com/");
        //login as standard user
//        driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
//        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
//        driver.findElement(By.cssSelector("[data-test='login-button']")).click();
      //  $("[data-test='username']").sendKeys(user.getUsername());
        $(LoginForm.USER_NAME).sendKeys(user.getUsername());
        $(LoginForm.PASSWORD).sendKeys(user.getPassword());
       // $("[data-test='password']").sendKeys(user.getPassword());
       // $("[data-test='login-button']").click();
        $(LoginForm.LOGIN_BUTTON).click();
    }
}
