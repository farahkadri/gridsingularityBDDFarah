Feature: As a Amazon user I should be able to login and logout with valid credentials

  Scenario Outline: 1.Login into the application with valid credentials
    Given I am on the Login page URL "https://www.d3a.io/projects"
    When I enter username as "testusername"
    #You can use the test username here
    And I enter password as "testpassword"
    #You can use the test password here
    And click on login button
    Examples:
      |  |

  Scenario Outline: 2.  Create a Project and Create a simulation
  Validate that a logged in user is able to create a project from this page
    Given I am on the Login page URL "https://www.amazon.in/"
    When I enter username as "testusername"
    And I enter password as "testpassword"
    And click on login button
    Then Click on Project tab
    When Click on Create Project Icon
    And Click on New Simulation Button
    Examples:
      |  |



   
