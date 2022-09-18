package lt.kestutis.pom.utils.pages.draudimas;

import lt.kestutis.pom.utils.pages.Common;

public class PetInsurancePages {
    public static void clickPetTypeSelection() {
        Common.clickElement(Locators.PetInsurance.clickPetType);
    }

    public static void enterPetOwnerRegistrationNumber(String petOwnerNumber) {
        Common.sendKeysToElement(Locators.PetInsurance.inputPetOwnerNumber, petOwnerNumber);
    }

    public static void enterPetBreed(String petBreed) {
        Common.sendKeysToElement(Locators.PetInsurance.inputPetBreed, petBreed);
    }

    public static void enterPetDateOfBirth(String petDateOfBirth) {
        Common.sendKeysToElement(Locators.PetInsurance.inputPetDateOfBirth, petDateOfBirth);
    }

    public static void clickButtonCheckChipRegistry() {

        Common.clickElement(Locators.PetInsurance.clickCheckChipRegistry);
    }

    public static void clickPetTermsAndConditions() {

        Common.clickElement(Locators.PetInsurance.clickCheckPetTermsAndConditions);
    }

    public static void clickPetTheOfferButton() {
        Common.clickElement(Locators.PetInsurance.clickPetOffer);
    }

    public static void clickPetPageStepTwo() {
        Common.openUrl("https://www.draudimas.lt/pets/insurance/step2");

    }

    public static String readPetStepTwoMessage() {
        return Common.getElementAttributeValue(Locators.PetInsurance.paragraphPetStepTwoNote,
                "action");
    }

        public static void close() {
            {
                Common.closeDriver();
            }
        }
}
