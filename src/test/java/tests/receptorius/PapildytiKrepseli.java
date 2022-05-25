package tests.receptorius;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTests;

public class PapildytiKrepseli extends BaseTests {

    @BeforeMethod
    public void openLoginPage() {
        pages.receptorius.PapildytiKrepseli.openLoginUrl();
    }

    @Test
    public void idekPrekeIKrepseli(){
        String expectedMessageSuccesfullyAddedToCartMessage = "Prekė sėkmingai pridėta";

        pages.receptorius.PapildytiKrepseli.click1kgButton();
        pages.receptorius.PapildytiKrepseli.clickAddAmountButton();
        pages.receptorius.PapildytiKrepseli.clickAddToCartButton();
        pages.receptorius.PapildytiKrepseli.waitForCartToBeVisible();
        String actualMessageSuccesfullyAddedToCartMessage = pages.receptorius.PapildytiKrepseli.getCartConfirmationText();
        System.out.println(actualMessageSuccesfullyAddedToCartMessage);

        Assert.assertTrue(actualMessageSuccesfullyAddedToCartMessage.contains(expectedMessageSuccesfullyAddedToCartMessage));
    }

}
