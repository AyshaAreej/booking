Feature: Booking

  @tag1
  Scenario: Verify the search results
    Given Open booking.com website using an incognito tab
    Then First search the hotels in Mumbai
    And Select the date  1st September 2021 – 2nd September 2021 (1 night)
    And Select 1 room for 2 adults
    Then search hotels according to given data
    And Apply “Price (lowest first)"  for first page hotel cards
    And Validate data record

  @tag2
  Scenario: Verify the search results
    Given Open booking.com website using an incognito tab
    Then First search the hotels in Budapest
    And Select the date 30th December 2021 – 2nd January 2022 (2 nights)
    And Select 2 rooms for 4 adults
    Then search hotels according to given data
    And Apply “Price (lowest first)"  for first page hotel cards
    And Validate data

  @tag3
  Scenario: Verify the search results
    Given Open booking.com website using an incognito tab
    Then First search the hotels in London
    And Select the date 15 days, + 2 months from today (execution time), +1 day (1 night)
    And Select 1 room for 2 adults 2 children (2 years old, 6 years old)
    Then search hotels according to given data
    And Apply “Price (lowest first)"  for first page hotel cards
    And Validate data

  @tag4
  Scenario Outline: Validate data
    Given Check all data of hotels <name>
    When I check for the <nights> in hotel
    Then I verify the <status>

    Examples: 
      | name     | Nights | status  |
      | Mumbai   |      1 | success |
      | Budapest |      2 | success |
      | London   |      1 | success |
