Feature: Zoopler - For sale

  Scenario: As a user I want to be able to search for properties for sale
    Given Zoopler - I navigate to homepage
    And Zoopler - Common - I delete all cookies
    And Zoopler - I select For sale tab
    And Zoopler - Entered location in the search field
    And Zoopler - Set price Minimum price pcm and assert
    And Zoopler - Set Maximum price pcm and assert
    And Zoopler - Set property type to Houses
    And Zoopler - Selected number of bedrooms
    When Zoopler - I clicked on search button
    Then Zoopler - List of properties For sale should be displayed
    And Zoopler - Selected Grid view for property for sale
    And zoopler - Selected Map view of property for sale
