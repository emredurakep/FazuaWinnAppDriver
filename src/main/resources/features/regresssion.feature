Feature: Regression Suite for Service ToolBox

  @Regresssion
  Scenario: Verifying the functions of Prodcut Informations
    Given I am connected to bike through the PC with Service Toolbox 2.19 RC..
    When I click Product Information on Basic Menu
    Then Create System Report, motor, torque sensor, battery and display areas must be available,functions must work

  @Regresssion
  Scenario: Verifying the functions of Live Data
    Given I am connected to bike through the PC with Service Toolbox 2.19 RC..
    When I click Live Data on Basic Menu
    Then play and pause button must work without problem

    @Regression
    Scenario: Verifying the functions of Calibration
      Given I am connected to bike through the PC with Service Toolbox 2.19 RC..
      When I click calibration on the Basic Menu
      Then funcitons of calibration like start must work


