Feature: Edit Profile Functionality

Scenario: User edits his basic info
Given User successfully logs into his profile
When User enters the following into the correct fields
|Phone Number    | 9192157139	  |
|Current Location| Midland		  |	
|Job Title       | Scrum Master |		 
And User clicks Save
Then Profile has been edited