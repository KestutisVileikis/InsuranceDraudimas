package lt.kestutis.pom.test.draudimas;

import lt.kestutis.pom.pages.draudimas.DraudimasHomePages;
import lt.kestutis.pom.pages.draudimas.TravelInsurancePages;
import lt.kestutis.pom.test.TestBases;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TravelInsuranceTest extends TestBases {

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
