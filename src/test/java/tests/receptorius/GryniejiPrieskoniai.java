package tests.receptorius;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTests;

public class GryniejiPrieskoniai extends BaseTests {
    @BeforeMethod
    public void openSpicePage() {

        pages.receptorius.GryniejiPrieskoniai.openLoginUrl();
    }

    @Test
    public void searchForSpicesWithSearchBar() {

        String spiceName = "Deggi Mirch";

        pages.receptorius.GryniejiPrieskoniai.addSpiceNameToSearchBar(spiceName);
        pages.receptorius.GryniejiPrieskoniai.clickSearchButton();
        pages.receptorius.GryniejiPrieskoniai.checkIfElementIsVisible();

        Assert.assertTrue(pages.receptorius.GryniejiPrieskoniai.checkIfElementIsVisible());
    }
}
