package lt.kestutis.pom.utils.test.draudimas;

import lt.kestutis.pom.utils.pages.draudimas.CivilInsurancePages;
import lt.kestutis.pom.utils.pages.draudimas.DraudimasHomePages;
import lt.kestutis.pom.utils.pages.draudimas.PropertyInsurancePages;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CivilInsuranceTest extends TestBases{

    @BeforeTest

    public void setUp() {

        DraudimasHomePages.open();
        DraudimasHomePages.clickElementPageCivil();
    }

    @Test
    public void testCivilResponsibilityInsuranceRegistration() {
        String expectedMessage = "/properties/insurance/step2";
        String actualMessage;

        CivilInsurancePages.clickCivilResponsibilitySumSelection();
        CivilInsurancePages.clickCivilResponsibilityDocument();
        CivilInsurancePages.clickCivilTermsAndConditions();

        CivilInsurancePages.clickCivilTheOfferButton();

        CivilInsurancePages.clickCivilPageStepTwo();
        actualMessage = CivilInsurancePages.readCivilStepTwoMessage();

        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
