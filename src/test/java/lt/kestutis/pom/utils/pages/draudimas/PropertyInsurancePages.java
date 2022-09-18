package lt.kestutis.pom.utils.pages.draudimas;

import lt.kestutis.pom.utils.pages.Common;

public class PropertyInsurancePages {
    public static void clickPropertyTypeSelection() {
        Common.clickElement(Locators.PropertyInsurance.clickPropertySelection);
    }

    public static void clickPropertyConstructionSelection() {
        Common.clickElement(Locators.PropertyInsurance.clickPropertyConstruction);
    }

    public static void openPropertyLocationList() {
        Common.clickElement(Locators.PropertyInsurance.clickPropertyLocation);
    }

    public static void selectLocationFromDropdownMenu(String Location) {
        Common.getElementText(Locators.PropertyInsurance.inputLocationFromDropdownMenu);
    }

    public static void enterPropertyDevelopmentYear(String PropertyYear) {
        Common.sendKeysToElement(Locators.PropertyInsurance.inputPropertyDevelopmentYear,
                PropertyYear);
    }

    public static void enterPropertyArea(String PropertyArea) {
        Common.sendKeysToElement(Locators.PropertyInsurance.inputPropertyArea,
                PropertyArea);
    }

    public static void enterPropertyOwnerRegistrationNumber(String OwnerNumber) {
        Common.sendKeysToElement(Locators.PropertyInsurance.inputPropertyOwnerNumber,
                OwnerNumber);
    }

    public static void clickPropertyTermsAndConditions() {
        Common.clickElement(Locators.PropertyInsurance.clickCheckPropertyTermsAndConditions);
    }

    public static void clickPropertyTheOfferButton() {
        Common.clickElement(Locators.PropertyInsurance.clickPropertyOffer);
    }

    public static void clickPropertiesPageStepTwo() {
        Common.openUrl("https://www.draudimas.lt/properties/insurance/step2");
    }

    public static String readPropertyStepTwoMessage() {
        return Common.getElementAttributeValue(Locators.PropertyInsurance.paragraphStepTwoNote,
                "action");
    }

    public static void close() {
        {
            Common.closeDriver();
        }
    }
}
