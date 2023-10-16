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
Feature: Checkout without input form 
  TASK PROA KOMINFO.fitur lima

	Scenario Outline: Testing Negative Checkout Without Input Form
    Given I search url saucedemo
    When I input5 <username> and <password>
    And I login with valid account
    Then I checkout without input form

    Examples: 
      |username|password|
      |standard_user|secret_sauce|