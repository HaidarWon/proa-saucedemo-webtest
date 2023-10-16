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
@tag
Feature: Remove Order
  TASK PROA KOMINFO.fitur tiga

  Scenario Outline: Testing Fitur Remove Order
    Given I go to url saucedemo
    When I input3 <username> and <password>
    And I can login
    Then I remove order

    Examples: 
      |username|password|
      |standard_user|secret_sauce|