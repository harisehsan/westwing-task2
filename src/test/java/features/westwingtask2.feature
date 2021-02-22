@westwingtask2
Feature: Westwing Task 2

  @test_automation_script_use_case_on_Westwingnow
  Scenario: Test automation script covering a provided use case on Westwingnow
    Given I am on the WestwingNow home page "https://www.westwingnow.de"
    When I search for "möbel"
    Then I should see product listing page with a list of products
    When I click on wishlist icon of the first found product
    And I perform login if not already done
    Then product should be added to the wishlist
    And I go to the wishlist page "https://www.westwingnow.de/customer/wishlist/index/"
    And I delete the product from my wishlist