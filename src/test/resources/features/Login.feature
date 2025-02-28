Feature: Login Functionality

  @SmokeTest
  Scenario: Login valid credentials
    Given User has navigated to the landing page
    When User clicks landing login button
    And User enters a valid email "jjnospam68@gmail.com"
    And User enters a valid password "Stayout@123"
    And User clicks login button
    Then User is successfully logged in
    
  @RegressionTest
  Scenario: Login invalid credentials
    Given User has navigated to the landing page
    When User clicks landing login button
    And User enters an invalid email "jj"
    And User enters an invalid password "j"
    And User clicks login button
    Then User receives an invalid email error message
    
  @SmokeTest
  Scenario: Login valid email and invalid password
    Given User has navigated to the landing page
    When User clicks landing login button
    And User enters a valid email "jjnospam68@gmail.com"
    And User enters an invalid password "j"
    And User clicks login button
   Then User receives a wrong email or password error message

  @SmokeTest
  Scenario: Login invalid email and valid password
    Given User has navigated to the landing page
    When User clicks landing login button
    And User enters an invalid email "jj"
    And User enters a valid password "Stayout@123"
    And User clicks login button
    Then User receives an invalid email error message

  @RegressionTest
  Scenario: Login empty credentials
    Given User has navigated to the landing page
    When User clicks landing login button
    And User does not enter email address
    And User does not enter password
    And User clicks login button
    Then User is given email blank message
