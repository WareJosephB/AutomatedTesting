Feature: Nosy person snooping on package capabilities
  As a nosy person
  I want to see the limits of the tools I use
  So that I can try and avoid breaking them

Scenario: Trying multiple givens
  Given that given works
  And that given-and works
  When I import this feature file
  Then I should see multiple givens
  
Scenario: Trying multiple whens
  Given that given works
  When I import this feature file
  And the previous feature file
  Then I should see this all work

Scenario: Trying multiple whens
  Given that given works
  When I import this feature file
  Then I should see this all work
  And I should see this too
