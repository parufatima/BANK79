Feature: This is a Bank79 Login feature.


@Login
Scenario: Verify Login  functionality with valid id and password
Given Lunch the application <"URL">
When Enter valid user id
When Enter valid password
When Click on login
Then Verify the title of homepage.

@Login
Scenario: Verify Login  functionality with Invalid id and valid password
Given Lunch the application <"URL">
When Enter Invalid user id
When Enter valid password
When Click on login
Then Verify user can not login successfully

@Login
Scenario: Verify Login  functionality with valid id and Invalid password
Given Lunch the application <"URL">
When Enter valid user id
When Enter Invalid password
When Click on login
Then Verify user can not login successfully

@Login
Scenario: Verify Login  functionality with Invalid id and Invalid password
Given Lunch the application <"URL">
When Enter Invalid user id
When Enter Invalid password
When Click on login
Then Verify user can not login successfully



  Scenario Outline: Verify Login  functionality
    Given Lunch the application <"URL">
    When Enter user id <value> 
    When Enter user <password>
    Then I verify the <status> 

       Examples: 
      | id        | password | status  |
      |mngr474253 | EgEgUtE  | success |
      | David     |EgEgUtE   | Fail    |
      | mngr474253|   abc123 |  Fail   |
      |Maxim      | Max123   | Fail    |
      

