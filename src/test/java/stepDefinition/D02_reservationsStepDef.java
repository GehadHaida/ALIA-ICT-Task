package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.P02_reservations;

public class D02_reservationsStepDef {

    P02_reservations reservations = new P02_reservations();

    @When("User click Later on the User Verification popup")
    public void userClickLaterBtn()
    {
        reservations.laterPopup();
    }

    @And("User open the Reservation page from the left-hand menu")
    public void userClickReservationBtn()
    {
        reservations.reservationsBtn().click();
    }

    @And("User click on Add Reservation")
    public void userClickOnAddNewReservation()
    {
        reservations.addNewReservation().click();
    }

    @And("User select Business or Work from Visit Purpose and Booking.com from Reservation Source")
    public void userSelectVisitPurposeAndReservationSource() throws InterruptedException {
        reservations.visitPurpose();
        reservations.reservationSource();
    }

    @And("User choose a unit by clicking \"Select Unit Now\" and confirming")
    public void userClickOnSelectUnitNow()
    {
        reservations.selectUnitNow().click();
    }

    @And("User select the room available and confirm")
    public void userConfirmRoom() throws InterruptedException {
        reservations.selectRoom().click();
        reservations.confirmRoom().click();
    }

    @And("User choose a guest by entering Guest ID 123456789 and confirming")
    public void userSelectGuestAndConfirm() throws InterruptedException {
        reservations.selectGuest().click();
        reservations.enterGuestID().sendKeys("123456789");
        reservations.enterGuestID().sendKeys(Keys.ENTER);
        reservations.selectMyGuestResult().click();
        reservations.selectGuestConfirmBtn().click();
    }

    @Then("Validate that the reservation was created successfully")
    public void validateReservation() throws InterruptedException {
        reservations.reservationCreated();
    }
}
