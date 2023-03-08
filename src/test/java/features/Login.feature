Feature: Test the login functionality

  @Sanity @Regression
  Scenario: login with valid email and valid password
    Given User open website and go to login page
    When User fill email as "Aksel1506" and password as "Amchiche5" and click on login
    Then user should navigate to home page

  @Regression
  Scenario Outline: Login with invalid credential
    Given User open website and go to login page
    When User fill email as "<username>" and "<password>" and click on login
    Then error message should appear

    Examples:
      | username  | password  |
      | Aksel1506 | wrong     |
      | Salamo    | Amchiche5 |
      | Jordan    | wrong     |
