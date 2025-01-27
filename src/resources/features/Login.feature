Feature: Login Functionality

  @tag1
  Scenario: Login valid credentials
    Given User has navigated to the landing page
    When User clicks landing login button
    And User enters a valid email "jjnospam68@gmail.com"
    And User enters a valid password "Stayout@123"
    And User clicks login button
    Then User is successfully logged in  
    
   Scenario: Login invalid credentials
    Given User has navigated to landing page
    When User clicks landing login button
    And User enters an invalid email "jj"
    And User enters an invalid password "j"
    And User clicks login button
    Then User receives an Error message
    
     Scenario: Login valid email and invalid password
    Given User has navigated to landing page
    When User clicks landing login button
    And User enters a valid email "jjnospam68@gmail.com"
    And User enters an invalid password "j"
    And User clicks login button
    Then User is not logged in 
    
    Scenario: Login invalid email and valid password
    Given User has navigated to landing page
    When User clicks landing login button
    And User enters an invalid email "jj"
    And User enters a valid password "Stayout@123"
    And User clicks login button
    Then User is not logged in 
 
    Scenario: Login empty credentials
    Given User has navigated to landing page
    When User clicks landing login button
    And User does not enter email address
    And User does not enter password
    And User clicks login button
    Then User is given blank message 