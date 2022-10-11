@E2E
Feature: User Story : User should be able to watch last match of city

  Background:
    Given User is on the main page

    Scenario:
      When user search for last city game
      Then user see last city game
      When user click the last city game
      Then user watch the last city game
