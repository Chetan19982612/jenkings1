Feature:  Add two numbers
In this feature will Add two numbers
@test
Scenario: Add two number scenario
Given User enter two numbers
Then user Add two numbers
And Result is displayed


@test2
Scenario Outline: Add two numbers scenario
Given User enter two numbers <first number><second number>
Then user add two numbers
And Result is displayed 

Examples: 
|firstnumber|second number|
|5|6|
|2|3|
|8|7|

 