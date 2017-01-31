Feature: Zoopler - To rent

  Scenario: As a user I want to be able to search for property to rent
    Given Zoopler - I navigate to homepage
    And Zoopler - Common - I delete all cookies
    And Zoopler - I select To rent tab
    And Zoopler - I entered location in the search field
    And Zoopler - Set price Min price pcm and assert
    And Zoopler - Set Max price pcm and assert
    And Zoopler - Set property type to Flats
    And Zoopler - I clicked Bedrooms
    When Zoopler - I clicked on search button
    Then Zoopler - List of to rent properties should be displayed
    And Zoopler - I selected Grid view
    And zoopler - Selected Map view
