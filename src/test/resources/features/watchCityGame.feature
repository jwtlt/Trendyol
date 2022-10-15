@E2E
Feature: User Story : User should be able to watch last match of city

  Background:
    Given User is on the main page

    Scenario:
      When user search for last city games
      Then user see last city games
      When user click one of the last city game
      Then user watch the city game
