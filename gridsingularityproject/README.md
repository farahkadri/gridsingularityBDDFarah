Task Assignment

I have used BDD Framework for this assignment.
Main Page -->gridsingularityproject\src\main\java\com\gridSingularity\pageObjects
Step Definition File -->gridsingularityproject\src\main\java\com\gridSingularity\stepdefinitions
Feature File -->gridsingularityproject\src\main\java\com\gridSingularity\feature.file
Base File --> gridsingularityproject\src\main\java\com\gridSingularity\testBase
Runner File -->gridsingularityproject\src\main\java\com\gridSingularity\TestRunner

Note- There are reports in this file, But  I havent used it for this project. Sure, we can use reports in long term.
I have used my mobile project reference for this assignment. Though, for mobile we had different drivers and I had used
appium for this.


Login testcase. Validate that a precreated user is able to login to d3a.io
(Depends on testcase 1) Create a Project. Validate that a logged in user is able to create a project from this page https://www.d3a.io/projects (the page is also accessible via a link to the left panel, 
second icon from the top). Validate that the project is listed correctly after being created.
(Depends on testcase 2) Create a simulation. Validate that, if the project in testcase 2 has been created successfully, a logged in user can create a simulation (button "New Simulation" in the project view). The simulation can be empty, does not need to have any special setup. Also validate that the configuration is listed correctly.
The automated test suite can be created either using Cypress or Selenium (ideally in Javascript or Python).

Extra points for writing the testcases in Gherkin syntax (given/when/then).

