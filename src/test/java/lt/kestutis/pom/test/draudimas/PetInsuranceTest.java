package lt.kestutis.pom.test.draudimas;

import lt.kestutis.pom.pages.draudimas.DraudimasHomePages;
import lt.kestutis.pom.pages.draudimas.PetInsurancePages;
import lt.kestutis.pom.test.TestBases;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PetInsuranceTest extends TestBases {
    @BeforeTest

    public void setUp() {

        DraudimasHomePages.open();
        DraudimasHomePages.clickElementPagePet();
    }

    @Test
    public void testCheckPetInsuranceRegistration(){
        String PetOwnerNumber = "37707190174";
        String PetBreed = "Aliaskos malamutas";
        String PetDateOfBirth = "2022-01-09";


        String expectedMessage = "pets/insurance/step2";
        String actualMessage;

        PetInsurancePages.clickPetTypeSelection();

        PetInsurancePages.enterPetOwnerRegistrationNumber(PetOwnerNumber);

        PetInsurancePages.enterPetBreed(PetBreed);

        PetInsurancePages.enterPetDateOfBirth(PetDateOfBirth);

        PetInsurancePages.clickButtonCheckChipRegistry();

        PetInsurancePages.clickPetTermsAndConditions();

        PetInsurancePages.clickPetTheOfferButton();

        PetInsurancePages.clickPetPageStepTwo();

        actualMessage = PetInsurancePages.readPetStepTwoMessage();

        Assert.assertEquals(actualMessage,expectedMessage);
    }
}
