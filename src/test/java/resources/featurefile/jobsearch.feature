Feature: I can search job in cv library

  Background: I am on home page

  @smoke
  Scenario Outline: verify job search result using different data set
    When I enter my job in "<JobTitle>"
    And I enter location "<location>"
    And I select distance "<distance>"
    And I click on more search options
    And I enter minimum salary "<min>"
    And I enter maximum salary "<max>"
    And I enter salary type "<salaryType>"
    And I select job type "<jobtype>"
    And I click on find job button
    Then I can see the result "<result>"



    Examples:
      | JobTitle          | location    | distance       | min   | max   | salaryType | jobtype   | result                                        |
      | Software Tester   | Crawley     | up to 5 miles  | 30000 | 50000 | Per annum  | Permanent | Permanent Software Tester jobs in Crawley     |
      | Software Engineer | Leeds       | up to 10 miles | 3000  | 5000  | Per month  | Contract  | Contract Software Engineer jobs in Leeds      |
      | Software Tester   | West Sussex | up to 15 miles | 300   | 500   | Per week   | Temporary | Temporary Software Tester jobs in West Sussex |
      | Automation Tester | London      | up to 35 miles | 300   | 500   | Per day    | Permanent | Permanent Automation Tester jobs in London    |
      | Automation Tester | London      | up to 50 miles | 30    | 50    | Per hour   | Permanent | Permanent Automation Tester jobs in London    |
      | Software Tester   | West Sussex | up to 50 miles | 45000 | 80000 | Per annum  | Permanent | Permanent Software Tester jobs in Leeds       |

