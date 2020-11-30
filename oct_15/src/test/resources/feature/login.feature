#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@login
Feature: Title of your feature

  @AdminLogin
  Scenario: Sucessful login with valid credentails
    Given User launch chrome browser
    When User open url "https://admin-demo.nopcommerce.com/login"
    And User enter emailid "admin@yourstore.com" and password "Admin"
    And Click on login
    Then Page title should be "Dashboard / nopCommerce administration"
    And Click on logout
    And Close browser

 
