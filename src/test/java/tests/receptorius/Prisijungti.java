package tests.receptorius;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTests;

public class Prisijungti extends BaseTests {

    @BeforeMethod
    public void openLoginPage() {
        pages.receptorius.Prisijungti.openLoginUrl();
    }

    @Test
    public void tryToLogInWithNonExistingAccountInfo() {

        String nonExistingEmail = "vardenis@email.com";
        String nonExistingPassword = "password";
        String expectedAlertMessage = "Identifikavimas nepavyko";

        pages.receptorius.Prisijungti.enterEmailAdress(nonExistingEmail);
        pages.receptorius.Prisijungti.enterPassword(nonExistingPassword);
        pages.receptorius.Prisijungti.clickLoginButton();
        String actualAlertMessage = pages.receptorius.Prisijungti.readAlertMessage();

        Assert.assertEquals(expectedAlertMessage, actualAlertMessage);
    }
    @Test
    public void tryToLogInAndLogOutWithExistingAccountInfo(){

        String existingEmail = "vismante.lisauskaite@gmail.com";
        String existingPassword = "vcsprojektas";
        String expectedAccountNameAfterLoggingIn = "Vismante Lisauskaite";

        pages.receptorius.Prisijungti.enterEmailAdress(existingEmail);
        pages.receptorius.Prisijungti.enterPassword(existingPassword);
        pages.receptorius.Prisijungti.clickLoginButton();
        String actualAccountNameAfterLoggingIn = pages.receptorius.Prisijungti.getAccountNameAfterLoggingIn();

        Assert.assertEquals(expectedAccountNameAfterLoggingIn, actualAccountNameAfterLoggingIn);

    }
}