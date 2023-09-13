Feature: Test With No Bug (Special Test ToolBox 2.19 - RC4)

  Scenario: bundle 007 no bug G4-  basic version of ST

    Given Superuser RC1 is connected to the system
    When I load the bundle 007
    And  I assign max speed Oem 32  and User 31 and wheel lengths OEM 2200 and wheel length user 2100
    And  Toolbox Var 2 as 0
    And I create a system report before test after conditioining
    And  I switch to STB Basic
    Then  Check that pop ups 1,2,3,5 is available
    Then  Check that Max Speed OEM 32, User 31 wheel length OEM 2200, User 2100
    Then  Create a system report again