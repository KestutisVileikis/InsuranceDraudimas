package lt.kestutis.pom.pages.draudimas;

import lt.kestutis.pom.pages.Common;
import lt.kestutis.pom.pages.Locators;

public class CivilInsurancePages {

    public static void clickCivilResponsibilitySumSelection() {
        Common.clickElement(Locators.CivilInsurance.clickCivilSumResponsibility);
    }

    public static void clickCivilResponsibilityDocument() {
        Common.clickElement(Locators.CivilInsurance.clickCivilSumResponsibilityDocument);
    }

    public static void clickCivilTermsAndConditions() {
        Common.clickElement(Locators.CivilInsurance.clickCheckCivilTermsAndConditions);
    }

    public static void clickCivilTheOfferButton() {
        Common.clickElement(Locators.CivilInsurance.clickCivilOffer);
    }

    public static void clickCivilPageStepTwo() {
        Common.openUrl("https://www.draudimas.lt/aca/insurance/step2");

    }

    public static String readCivilStepTwoMessage() {
        return Common.getElementAttributeValue(Locators.CivilInsurance.paragraphCivilStepTwoNote,
                "action");
    }
        public static void close() {
            {
                Common.closeDriver();
            }
    }
}
