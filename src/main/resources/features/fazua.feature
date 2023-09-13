


Feature: eating bananas
  User Story: As a user When I click to the Product Information page motor must connect to the system successfully.
  @FazuaBasic
  Scenario: Verifying Motor Connection through the system
    Given STB is connected to the bike with the USB C Cable
    When I double click/open the Service Toolbox 2.19 Basic
    And I double click the Product Information menu from the toolbox
    Then I must see that motor is connected

