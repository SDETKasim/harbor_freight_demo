@us02 @smoke @regression
Feature: Login Functionality
  As a user I should be able to login successfully to my Harbor Freight account
  using valid credentials.

  @positive@demo
  Scenario Outline: User successfully logins with valid email and password credentials
    Given user is on the login page "https://www.harborfreight.com/customer/account/login"
    When user enters their credentials from "<SheetName>" <RowNumber>
    And clicks the login button
    Then user should be redirected to the orders page "https://www.harborfreight.com/customer/orders"
    And user should see header greeting text is "Hi, " first name from "<SheetName>" <RowNumber>

    Examples:
      | SheetName      | RowNumber |
      | ValidLoginData | 1         |


  @negative
  Scenario Outline: User is unable to login with valid email and invalid password
    Given user is on the login page "https://www.harborfreight.com/customer/account/login"
    When user enters their credentials from "<SheetName>" <RowNumber>
    And clicks the login button
    Then user should remain on the login page "https://www.harborfreight.com/customer/account/login"

    Examples:
      | SheetName        | RowNumber |
      | InvalidLoginData | 1         |


  @negative
  Scenario Outline: User is unable to login with valid email and empty password field
    Given user is on the login page "https://www.harborfreight.com/customer/account/login"
    When user enters their credentials from "<SheetName>" <RowNumber>
    And clicks the login button
    Then user should remain on the login page "https://www.harborfreight.com/customer/account/login"

    Examples:
      | SheetName        | RowNumber |
      | InvalidLoginData | 2         |

