package serenityswag.authentication;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.actions.LoginActions;
import serenityswag.inventory.InventoryPage;

import static org.assertj.core.api.Assertions.assertThat;
import static serenityswag.authentication.User.STANDARD_USER;

@RunWith(SerenityRunner.class)
public class WhenLoggingOn  {


    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;

    InventoryPage inventory;

    @Test
    public void usersCanLoginViaTheHomePage(){
       login.as(STANDARD_USER);
        Serenity.reportThat("The inventory page should be displayed with the correct title",()->assertThat(inventory.getHeading()).isEqualToIgnoringCase("Products"));
        ;
    }

}
