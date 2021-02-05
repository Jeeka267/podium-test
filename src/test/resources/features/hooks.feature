Feature: Test Tagged Hooks

#************** Local Hooks *******************#

  @First
  Scenario: Home page test
    Given User already in home page
    When Title of the page is home page

 @Second
  Scenario: Login page test
    Given  User already in home page
    When Title of the page is home page
    Then Click on login link
    Then Enter the username and password
      |test123@gmail.com|test09876|