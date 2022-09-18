package lt.kestutis.pom.utils.test.draudimas;

import lt.kestutis.pom.utils.pages.draudimas.DraudimasHomePages;
import lt.kestutis.pom.utils.pages.draudimas.PropertyInsurancePages;
import lt.kestutis.pom.utils.pages.draudimas.TravelInsurancePages;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TravelInsuranceTest extends TestBases{

    @BeforeTest

    public void setUp() {

        DraudimasHomePages.open();
        DraudimasHomePages.clickElementPageTravel();
    }

    @Test
    public void testTravelInsuranceRegistration(){

        String Destination = "Norvegija";
        String StartDate = "2022-10-16";
        String EndDate = "2022-12-24";

        String expectedMessage = "/travels/insurance/step2";
        String actualMessage;

        TravelInsurancePages.enterDestinationCountry(Destination);

        TravelInsurancePages.clickTravelType();

        TravelInsurancePages.selectTravelStartDate(StartDate);

        TravelInsurancePages.selectTravelEndDate(EndDate);

        TravelInsurancePages.clickTravelTermsAndConditions();

        TravelInsurancePages.clickTravelTheOfferButton();

        TravelInsurancePages.clickTravelPageStepTwo();
        actualMessage = TravelInsurancePages.readTravelStepTwoMessage();

        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
