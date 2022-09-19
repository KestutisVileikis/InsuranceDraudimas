package lt.kestutis.pom.test.draudimas;

import lt.kestutis.pom.pages.draudimas.DraudimasHomePages;
import lt.kestutis.pom.pages.draudimas.PropertyInsurancePages;
import lt.kestutis.pom.test.TestBases;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertyInsuranceTest extends TestBases {
    @BeforeTest

    public void setUp() {

        DraudimasHomePages.open();
        DraudimasHomePages.clickElementPageProperty();
    }

    @Test
    public void testCheckPropertyInsuranceRegistrationOffer() {

        String Location = "Siauliu m. sav.";
        String PropertyYear = "2009";
        String PropertyArea = "194";
        String OwnerNumber = "37707190174";

        String expectedMessage = "/properties/insurance/step2";
        String actualMessage;

        PropertyInsurancePages.clickPropertyTypeSelection();

        PropertyInsurancePages.clickPropertyConstructionSelection();

        PropertyInsurancePages.openPropertyLocationList();

        PropertyInsurancePages.selectLocationFromDropdownMenu(Location);

        PropertyInsurancePages.enterPropertyDevelopmentYear(PropertyYear);

        PropertyInsurancePages.enterPropertyArea(PropertyArea);

        PropertyInsurancePages.enterPropertyOwnerRegistrationNumber(OwnerNumber);

        PropertyInsurancePages.clickPropertyTermsAndConditions();

        PropertyInsurancePages.clickPropertyTheOfferButton();

        PropertyInsurancePages.clickPropertiesPageStepTwo();
        actualMessage = PropertyInsurancePages.readPropertyStepTwoMessage();

        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
