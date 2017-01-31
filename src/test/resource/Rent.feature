  Feature: Creating Multiple rent for different location

  Background: 
    Given Zoopla - Am on the hompage
    And Zoopla - Am I cleared the cookies

  Scenario Outline: 
    And Zoopla - Rent - I selected the To rent
    And Zoopla - Location - I selected "<location>" property location
    And Zopla - Price Min - I selced "<MinPrice>" Minimum price of property
    And Zoopla - Price Max - I selected "<MaxPrice>" Maximum property price
    And Zoopla - Property type - Select "<PropertyType>" Property Type
    And Zoopla - Bedrooms - I selected "<Bedroom>" Bedrooms
    When Zoopla - I hit search button
    Then Zoopla - List of properties should be displayed

    Examples: 
      | location                       | MinPrice | MaxPrice  | PropertyType | Bedroom |
      | Manchester, Greater Manchester | £500 pcm | £800 pcm  | Houses       | 1+      |
      | Portsmouth                     | £700 pcm | £1000 pcm | Flats        | 2+      |
      | Poole, Dorset                  | £600 pcm | £900 pcm  | Houses       | 2+      |
      | Pontypridd                     | £400 pcm | £1000 pcm | Houses       | 3+      |
