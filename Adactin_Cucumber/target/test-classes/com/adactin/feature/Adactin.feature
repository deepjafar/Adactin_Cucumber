Feature: Testing Adactin Application end to end process

Scenario: Verify that user able to login the application

Given User Launch the application
When User enters the valid username in the username field
And User enters the valid password in the password field
And User clicks on the login button
Then User verify the homepage navigates to Search hotel

Scenario: Verify that user able to search hotel in the application

Given User logged into the application using credentials
When User selects location from the location dropdown
And User selects hotel from the hotel dropdown
And User selects room type from from the room type dropdown
And User selects number of rooms from Number of rooms dropdown
And User selects date from the check in date dropdown
And User selects date from the check out date dropdown
And User selects Adults per room using Adults per room dropdown
And user selects Children per room using Children per room dropdown
And User clickd on Search button
Then User verify that Search hotel page navigates to Select hotel with all selected details displayed

Scenario: Verify user able to continue with selected hotel

Given User navigated to select hotel page
When User selects the hotel using radio button under Select field
And User clicks on Continue button
Then User verify that it navigates to book a hotel page

Scenario: Verify user able to Book a hotel

Given User navigated to Book a hotel page
When User enters firstname in the First name field
And User enters last name in the Last name field
And User enters address in the Billing address field
And User enters credit card no in the credit card no field
And User selects Credit card type from the credit card drop down
And User selects expiry date from expiry month and year dropdown
And User enters cvv number in the cvv field
And user clicks on the Book now button
Then User verify that hotel room has been booked and navigated to booking confirmation page






