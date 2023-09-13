
Feature: As a user When I click live data play twice, and after that click pause. Live data flow must pause.

  @LiveDataCheck
  Scenario: Verifying While Live data is on, it is not clickable any more
    Given Service ToolBox is connected to the bike
    When I open STB and click Live Data
    And I click play button on top rigth corner
    Then Verify that second click is impossible and button is not clickable

