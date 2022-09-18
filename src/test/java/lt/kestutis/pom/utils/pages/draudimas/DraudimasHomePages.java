package lt.kestutis.pom.utils.pages.draudimas;

import lt.kestutis.pom.utils.pages.Common;

public class DraudimasHomePages {
    public static void open(
    ) {
        Common.openUrl("https://www.draudimas.lt/");
    }

    public static void clickElementPage() {
        Common.clickElementByAction(
                Locators.InsuranceHome.menuVehicle
        );
    }
        public static void clickElementPageProperty() {
            Common.clickElementByAction(
                    Locators.InsuranceHome.menuProperty
            );
        }
    public static void clickElementPageTravel() {
        Common.clickElementByAction(
                Locators.InsuranceHome.menuTravel
        );

    }
    public static void clickElementPagePet() {
        Common.clickElementByAction(
                Locators.InsuranceHome.menuPet
        );
    }
        public static void clickElementPageCivil() {
            Common.clickElementByAction(
                    Locators.InsuranceHome.menuCivil
            );
        }
}