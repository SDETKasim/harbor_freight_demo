@us01 @smoke @regression
Feature: Account Creation Functionality
  As a new user I want to create an account on the Harbor Freight website
  So that I can make purchases and track my orders.


  @positive
  Scenario Outline: User provides valid registration details
    Given user is on registration page "https://www.harborfreight.com/customer/account/register"
    When the user enters valid "<firstName>", "<lastName>", "<email>", "<password>", "<phoneNumber>"
    And clicks on the Create Account button
    Then user should be redirected to the customer orders page "https://www.harborfreight.com/customer/orders"
    Then user should see that header account greeting text is "Hi, <firstName>"

    Examples:
      | firstName | lastName | email               | password       | phoneNumber |
      | Jane      | Smith    | Janesmith@gmail.com | Opensesame123! | 9999999999  |

  @negative
  Scenario Outline: User provides empty first name field
    Given user is on registration page "https://www.harborfreight.com/customer/account/register"
    When the user enters "<firstName>", "<lastName>", "<email>", "<password>", "<phoneNumber>"
    Then the user should see an error message "Please correct the highlighted fields above to continue."

    Examples:
      | firstName | lastName | email               | password       | phoneNumber |
      |           | Smith    | Janesmith@gmail.com | Opensesame123! | 9999999999  |

  @negative
  Scenario Outline: User provides empty last name field
    Given user is on registration page "https://www.harborfreight.com/customer/account/register"
    When the user enters "<firstName>", "<lastName>", "<email>", "<password>", "<phoneNumber>"
    Then the user should see an error message "Please correct the highlighted fields above to continue."

    Examples:
      | firstName | lastName | email               | password       | phoneNumber |
      | Jane      |          | Janesmith@gmail.com | Opensesame123! | 9999999999  |

  @negative
  Scenario Outline: User provides invalid email
    Given user is on registration page "https://www.harborfreight.com/customer/account/register"
    When the user enters "<firstName>", "<lastName>", "<email>", "<password>", "<phoneNumber>"
    Then the user should see an error message "Please correct the highlighted fields above to continue."

    Examples:
      | firstName | lastName | email              | password       | phoneNumber |
      | Jane      | Smith    | Janesmithgmail.com | Opensesame123! | 9999999999  |
      | Jane      | Smith    | Janesmith@gmailcom | Opensesame123! | 9999999999  |

  @negative
  Scenario Outline: User enters password with less than 8 characters, without 1 special character,
  without 1 number, without 1 uppercase, without 1 lowercase and with a space

    Given user is on registration page "https://www.harborfreight.com/customer/account/register"
    When the user enters "<firstName>", "<lastName>", "<email>", "<password>", "<phoneNumber>"
    Then the user should see an error message "Password entered does not meet the minimum requirements."

    Examples:
      | firstName | lastName | email              | password        | phoneNumber |
      | Jane      | Smith    | Janesmithgmail.com | Open12!         | 9999999999  |
      | Jane      | Smith    | Janesmith@gmailcom | Opensesame123   | 9999999999  |
      | Jane      | Smith    | Janesmith@gmailcom | Opensesame!     | 9999999999  |
      | Jane      | Smith    | Janesmith@gmailcom | opensesame123!  | 9999999999  |
      | Jane      | Smith    | Janesmith@gmailcom | OPENSESAME123!  | 9999999999  |
      | Jane      | Smith    | Janesmith@gmailcom | Opensesame 123! | 9999999999  |

  @negative
  Scenario Outline: User provides mismatched passwords
    Given user is on registration page "https://www.harborfreight.com/customer/account/register"
    When the user enters "<firstName>", "<lastName>", "<email>", "<password>", "<passwordConf>", "<phoneNumber>"
    Then the user should see an error message "Passwords entered do not match."

    Examples:
      | firstName | lastName | email               | password       | passwordConf   | phoneNumber |
      | Jane      | Smith    | Janesmith@gmail.com | Opensesame123! | Opensesame123@ | 9999999999  |







