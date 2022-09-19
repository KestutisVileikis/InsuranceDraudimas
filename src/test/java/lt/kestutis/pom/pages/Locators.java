package lt.kestutis.pom.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class InsuranceHome {

        public static By menuVehicle = By.xpath("(//*[@href='/automobilio-draudimas'])[1]");

        public static By menuProperty = By.xpath("(//*[@href='/turto-draudimas'])[1]");

        public static By menuTravel = By.xpath("(//*[@href='/kelioniu-draudimas'])[1]");
        public static By menuPet = By.xpath("//*[@href='/gyvunu-draudimas']");
        public static By menuCivil = By.xpath("//*[@href='/asmens-civilines-atsakomybes-draudimas']");
    }

    public static class VehicleInsurance {

        public static By inputVehiclePlateNumber = By.xpath("//*[@id='StepBeginForm_number']");
        public static By inputOwnerRegistrationNumber = By.xpath("//*[@id='StepBeginForm_code']");
        public static By vehicleRegistrationValid = By.xpath("(//*[@class='check-symbol'])[1]");

        public static By inputInsuranceStartDate = By.xpath("//*[@class='datepicker-input-span']");
        public static By clickCheckInsuranceDuration = By.xpath("//*[@for='StepBeginForm_duration_2']");
        public static By clickCheckTermsAndConditions = By.xpath("(//*[@class='check-symbol'])[3]");

        public static By clickOfferAfterAllDetailsProvided = By.xpath("//*[@class='button-step-go']");

        public static By paragraphReadOffer = By.xpath("//*[@action='/vehicles/insurance/step2a']");
    }

    public static class PropertyInsurance {

        public static By clickPropertySelection = By.xpath("//*[@for='Step1Form_purposeId_2']");
        public static By clickPropertyConstruction = By.xpath("//*[@for='Step1Form_constructionId_0']");

        public static By clickPropertyLocation = By.xpath("//*[@class='selectric-items']");
        public static By inputLocationFromDropdownMenu = By.xpath("//*[@data-index='9']");
        public static By inputPropertyDevelopmentYear = By.xpath("//input[@id='Step1Form_constructionYear']");
        public static By inputPropertyArea = By.xpath("//input[@id='Step1Form_area']");
        public static By inputPropertyOwnerNumber = By.xpath("//input[@id='Step1Form_code']");
        public static By clickCheckPropertyTermsAndConditions = By.xpath("//*[@class='check-symbol']");
        public static By clickPropertyOffer = By.xpath("//input[@name='yt0']");

        public static By paragraphStepTwoNote = By.xpath("//*[@action='/properties/insurance/step2']");
    }

    public static class TravelInsurance {

        public static By inputDestinationCountry = By.xpath("//*[@id='country-input-autocomplete']");
        public static By clickTravelOption = By.xpath("//*[@for='Step1Form_transports_0']");
        public static By inputTravelStartDate = By.xpath("//*[@id='Step1Form_startDate']");
        public static By inputTravelEndDate = By.xpath("//*[@id='Step1Form_endDate']");
        public static By clickCheckTravelTermsAndConditions = By.xpath("//*[@class='check-symbol']");

        public static By clickTravelOffer = By.xpath("//input[@name='yt0']");
        public static By paragraphTravelStepTwoNote = By.xpath("//*[@action='/travels/insurance/step2']");
    }

    public static class PetInsurance{

        public static By clickPetType = By.xpath("//*[@for='Step1Form_petSpecies_0']");
        public static By inputPetOwnerNumber = By.xpath("//input[@id='Step1Form_code']");
        public static By inputPetBreed = By.xpath("//input[@id='Step1Form_breedId']");

        public static By inputPetDateOfBirth = By.xpath("//input[@id='Step1Form_petBirthday']");

        public static By clickCheckChipRegistry = By.xpath("(//*[@class='check-symbol'])[1]");
        public static By clickCheckPetTermsAndConditions = By.xpath("(//*[@class='check-symbol'])[3]");
        public static By clickPetOffer = By.xpath("(//input[@name='yt0']");
        public static By paragraphPetStepTwoNote = By.xpath("//*[@action='/pets/insurance/step2']");

    }

    public static class CivilInsurance{

        public static By clickCivilSumResponsibility = By.xpath("//*[@for='Step1Form_aca_insurance_ergo_5000']");

        public static By clickCivilSumResponsibilityDocument = By.xpath("//*[@href='/pdf/aca/asmens-civilines-atsakomybes-draudimo-pasiulymas.pdf']");

        public static By clickCheckCivilTermsAndConditions = By.xpath("//*[@class='check-symbol']");
        public static By clickCivilOffer = By.xpath("//*[@name='next']");

        public static By paragraphCivilStepTwoNote = By.xpath("//*[@action='/aca/insurance/step2']");

    }

}

