Feature: Edit Profile Functionality

@RegressionTest
Scenario: User edits his basic info
Given User has navigated to hugo landing page
When User clicks the landing login button
And User enters a valid email entry "jjnospam68@gmail.com"
And User enters a valid password entry "Stayout@123"
And User clicks the login button
Then User is successfully logged into hugo
And User clicks my profile
And User opens basic info modal
And User enters the following into the correct fields
|Phone Number    | 919-215-7139	  |
|Current Location| Midland		  |
|Job Title       | Scrum Master |
And User clicks Save
Then Profile has been edited