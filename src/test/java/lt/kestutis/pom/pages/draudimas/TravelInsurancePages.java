package lt.kestutis.pom.pages.draudimas;

import lt.kestutis.pom.pages.Common;
import lt.kestutis.pom.pages.Locators;

public class TravelInsurancePages {

    public static void enterDestinationCountry(String destination) {
        Common.getElementText(Locators.TravelInsurance.inputDestinationCountry);
    }

    public static void clickTravelType() {
        Common.clickElement(Locators.TravelInsurance.clickTravelOption);
    }

    public static void selectTravelStartDate(String startDate) {
        Common.sendKeysToElement(Locators.TravelInsurance.inputTravelStartDate, startDate);
    }

    public static void selectTravelEndDate(String endDate) {
        Common.sendKeysToElement(Locators.TravelInsurance.inputTravelEndDate, endDate);
    }

    public static void clickTravelTermsAndConditions() {
        Common.clickElement(Locators.TravelInsurance.clickCheckTravelTermsAndConditions);
    }

    public static void clickTravelTheOfferButton() {
        Common.clickElement(Locators.TravelInsurance.clickTravelOffer);

    }

    public static void clickTravelPageStepTwo() {
        Common.openUrl("https://www.draudimas.lt/travels/insurance/step2");
    }

    public static String readTravelStepTwoMessage() {
        return Common.getElementAttributeValue(Locators.TravelInsurance.paragraphTravelStepTwoNote,
                "action");
    }

        public static void close() {
            {
                Common.closeDriver();
            }
    }
}
