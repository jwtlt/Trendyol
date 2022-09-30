@E2E
Feature: User Story : User should be able to buy a shirt

  Background:
    Given User is on the main page

    Scenario:
      When User searches for a shirt
      Then User lands on the page full of shirts
      And User picks second shirt on the page
      And User picks small size
      And User clicks "sepete ekle" button
      And User clicks "sepetim" button
      And User clicks "sepeti onayla" button
      Then User transferred the login page
