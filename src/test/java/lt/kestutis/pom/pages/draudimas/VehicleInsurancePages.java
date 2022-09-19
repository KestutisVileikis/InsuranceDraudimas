package lt.kestutis.pom.pages.draudimas;

import lt.kestutis.pom.pages.Common;
import lt.kestutis.pom.pages.Locators;

public class VehicleInsurancePages {

    public static void open() {
        Common.openUrl("https://www.draudimas.lt");

    }

    public static void enterVehiclePlateNumber(String plateNumber) {
        Common.sendKeysToElement(
                Locators.VehicleInsurance.inputVehiclePlateNumber,
                plateNumber
        );
    }

    public static void enterOwnerRegistrationNumber(String ownerNumber) {
        Common.sendKeysToElement(
                Locators.VehicleInsurance.inputOwnerRegistrationNumber,
                ownerNumber
        );
    }

    public static void clickButtonCheck() {
        Common.clickElement(Locators.VehicleInsurance.vehicleRegistrationValid);
    }

    public static void selectDateFromCalendar(String date) {
        Common.clickElement(Locators.VehicleInsurance.inputInsuranceStartDate);
    }

    public static void clickDurationCheckbox() {
        Common.clickElement(Locators.VehicleInsurance.clickCheckInsuranceDuration);

    }

    public static void clickTermsAndConditions() {
        Common.clickElement(Locators.VehicleInsurance.clickCheckTermsAndConditions);
    }

    public static void clickTheOfferButton() {
        Common.clickElement(Locators.VehicleInsurance.clickOfferAfterAllDetailsProvided);
    }

    public static void clickVehicleInsurancePageStepTwo() {
        Common.openUrl("https://www.draudimas.lt/vehicles/insurance/step2a");
    }
    public static String readVehicleInsuranceStepTwoMessage() {
        return Common.getElementAttributeValue(Locators.VehicleInsurance.paragraphReadOffer,
                "action");

    }

    public static void close() {
        {
            Common.closeDriver();
        }
    }



}


