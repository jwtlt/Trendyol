@videoGame
Feature: User Story: User should be able to see comments under a video game

  Background:
    Given User is on the main page

  Scenario:
    When User enter "a game youtuber" on the search box and hit the "Enter" button
    Then User land on a page full of video about the youtuber
    When User clicks the first video
    Then User can watch the video
    And User see the comments under the video