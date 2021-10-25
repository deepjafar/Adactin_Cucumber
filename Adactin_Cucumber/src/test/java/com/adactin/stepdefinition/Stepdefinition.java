package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Adactin_Baseclass;
import com.adactin.runner.TestRunner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Adactin_Baseclass {

	public static WebDriver driver =TestRunner.driver;
	
	@Given("^User Launch the application$")
	public void user_Launch_the_application() {

	}

	@When("^User enters the valid username in the username field$")
	public void user_enters_the_valid_username_in_the_username_field() {
	 
	}

	@When("^User enters the valid password in the password field$")
	public void user_enters_the_valid_password_in_the_password_field() {
	
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() {

	}

	@Then("^User verify the homepage navigates to Search hotel$")
	public void user_verify_the_homepage_navigates_to_Search_hotel()  {

	}

	@Given("^User logged into the application using credentials$")
	public void user_logged_into_the_application_using_credentials() {
	 
	}

	@When("^User selects location from the location dropdown$")
	public void user_selects_location_from_the_location_dropdown()  {
	
	}

	@When("^User selects hotel from the hotel dropdown$")
	public void user_selects_hotel_from_the_hotel_dropdown() {

	}

	@When("^User selects room type from from the room type dropdown$")
	public void user_selects_room_type_from_from_the_room_type_dropdown()  {

	}

	@When("^User selects number of rooms from Number of rooms dropdown$")
	public void user_selects_number_of_rooms_from_Number_of_rooms_dropdown() {

	}

	@When("^User selects date from the check in date dropdown$")
	public void user_selects_date_from_the_check_in_date_dropdown() {

	}

	@When("^User selects date from the check out date dropdown$")
	public void user_selects_date_from_the_check_out_date_dropdown() {

	}

	@When("^User selects Adults per room using Adults per room dropdown$")
	public void user_selects_Adults_per_room_using_Adults_per_room_dropdown() {

	}

	@When("^user selects Children per room using Children per room dropdown$")
	public void user_selects_Children_per_room_using_Children_per_room_dropdown() {
	   
	}

	@When("^User clickd on Search button$")
	public void user_clickd_on_Search_button()  {
	 
	}

	@Then("^User verify that Search hotel page navigates to Select hotel with all selected details displayed$")
	public void user_verify_that_Search_hotel_page_navigates_to_Select_hotel_with_all_selected_details_displayed() {
	
	}

	@Given("^User navigated to select hotel page$")
	public void user_navigated_to_select_hotel_page()  {
	
	}

	@When("^User selects the hotel using radio button under Select field$")
	public void user_selects_the_hotel_using_radio_button_under_Select_field() {
	
	}

	@When("^User clicks on Continue button$")
	public void user_clicks_on_Continue_button() {
	    
	}

	@Then("^User verify that it navigates to book a hotel page$")
	public void user_verify_that_it_navigates_to_book_a_hotel_page()  {
	  
	}

	@Given("^User navigated to Book a hotel page$")
	public void user_navigated_to_Book_a_hotel_page() {
	  
	}

	@When("^User enters firstname in the First name field$")
	public void user_enters_firstname_in_the_First_name_field() {
	   
	}

	@When("^User enters last name in the Last name field$")
	public void user_enters_last_name_in_the_Last_name_field()  {
	
	}

	@When("^User enters address in the Billing address field$")
	public void user_enters_address_in_the_Billing_address_field()  {
	  
	}

	@When("^User enters credit card no in the credit card no field$")
	public void user_enters_credit_card_no_in_the_credit_card_no_field()  {
	  
	}

	@When("^User selects Credit card type from the credit card drop down$")
	public void user_selects_Credit_card_type_from_the_credit_card_drop_down() {
	    
	}

	@When("^User selects expiry date from expiry month and year dropdown$")
	public void user_selects_expiry_date_from_expiry_month_and_year_dropdown()  {
	   
	}

	@When("^User enters cvv number in the cvv field$")
	public void user_enters_cvv_number_in_the_cvv_field()  {
	   
	}

	@When("^user clicks on the Book now button$")
	public void user_clicks_on_the_Book_now_button()  {
	 
	}

	@Then("^User verify that hotel room has been booked and navigated to booking confirmation page$")
	public void user_verify_that_hotel_room_has_been_booked_and_navigated_to_booking_confirmation_page()  {
	   
	}
}
