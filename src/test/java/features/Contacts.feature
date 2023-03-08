Feature: Contact page features

  @Regression
  Scenario: Make sure that email text filed is visible
    Given User open website and go to login page
    When User fill email as "Aksel1506" and password as "Amchiche5" and click on login
    And Clicks on contacts
    Then Email text filed should be visible

  @Regression @Sanity
  Scenario: Add new contact
    Given User open website and go to login page
    When User fill email as "Aksel1506" and password as "Amchiche5" and click on login
    And Clicks on contacts
    And Clicks on add new contact
    And Fll the first name and password
    Then A new contact should be added
