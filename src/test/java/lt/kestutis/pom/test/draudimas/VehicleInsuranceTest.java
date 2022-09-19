package lt.kestutis.pom.test.draudimas;

import lt.kestutis.pom.pages.draudimas.DraudimasHomePages;
import lt.kestutis.pom.pages.draudimas.VehicleInsurancePages;
import lt.kestutis.pom.test.TestBases;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VehicleInsuranceTest extends TestBases {

    @BeforeTest

    public void setUp() {

        DraudimasHomePages.open();
        DraudimasHomePages.clickElementPage();
    }

    @Test
    public void testVehicleInsuranceRegistration() {

        String plateNumber = "KTR274";
        String ownerNumber = "37707190174";
        String startDate = "2022-09-15";

        String expectedMessage = "";
        String actualMessage;

        VehicleInsurancePages.enterVehiclePlateNumber(plateNumber);

        VehicleInsurancePages.enterOwnerRegistrationNumber(ownerNumber);

        VehicleInsurancePages.clickButtonCheck();

        VehicleInsurancePages.selectDateFromCalendar(startDate);

        VehicleInsurancePages.clickDurationCheckbox();

        VehicleInsurancePages.clickTermsAndConditions();

        VehicleInsurancePages.clickTheOfferButton();

        VehicleInsurancePages.clickVehicleInsurancePageStepTwo();
        actualMessage = VehicleInsurancePages.readVehicleInsuranceStepTwoMessage();

        Assert.assertEquals(actualMessage,expectedMessage);
    }
}


