#Feature: Test the login functionality
#
#  Scenario Outline: Login with invalid credential
#    Given User open website and go to login page
#    When User filled email as "<username>" and "<password>" as password and click on login
#    Then error message should appear
#    Examples:
#      | username  | password  |
#      | Aksel1506 | wrong     |
#      | Salamo    | Amchiche5 |
#      | Jordan    | wrong     |
#
#
##    Scenario Outline