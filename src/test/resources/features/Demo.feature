Feature: Demo Functionality

  Scenario: Access demo
    Given User has navigated to landing page
    When User clicks on the book a demo button
    Then Demo modal is displayed 
    And User closes demo modal
    
   @SmokeTest
   Scenario: Start booking is disabled
    Given User has navigated to landing page
    When User clicks on the book a demo button
    Then Demo modal is displayed
    And Start booking button is disabled    
    And User closes demo modal
    
    @RegressionTest
    Scenario: Start booking is enabled
    Given User has navigated to landing page
    When User clicks on the book a demo button
    Then Demo modal is displayed
    And Start booking button is disabled
    And User enters valid email address "jjnospam68@gmail.com"
    Then Start booking button is enabled  
    And User closes demo modal