@clarkqa @angebote
Feature: clark sales funnel test automation

  @Happy_path @Privathaftpflicht_testing
  Scenario: Privathaftpflicht testing
  Given I goto to url "http://staging.clark.de/de/app/contracts?cv=2"
  When I select Angebote
  And I select the Privathaftpflicht option in the Angebote menu
  And I select Angebote anzeigen button on the questionnaire page
  And I select Zum angebote button on the offer request page
  And I select the recommended offer on the available offers page
  And I perform registration with random dummy account
  And I enter the personal details on the checkout profile page
  And I select the start date on the checkout start date page
  And I enter the bank details on the checkout payment details page
  And I select the Zum Abschluss button on checkout summary page
  And I proceed to the manager page
  Then I verify the existence of Privathaftpflicht on manager page