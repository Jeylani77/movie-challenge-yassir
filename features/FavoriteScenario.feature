Feature: Favorite Movies and TV Shows

	Scenario: Add Movie to Favorite
    Given user is on the Details Movies screen 
    When user click on "ADD TO FAVORITE" button
    Then movie should be added to list of favorite movies

  Scenario: List Favorite Movies
    Given user is on the list of Movies screen
    When user tap the icon for favorite
    Then user should see a list of his favorite movies
  
  Scenario: Add TV Show to Favorite
    Given user is on the Details TV Shows screen 
    When user click on "ADD TO FAVORITE" button
    Then TV Show should be added to list of favorite TV Shows

  Scenario: List Favorite TV Shows
    Given user is on the list of TV shows screen
    When user tap the icon for favorite
    Then user should see a list of his favorite TV Shows
  
  Scenario: Unfavorite Movie
    Given user is on the list of favorite movie
    When user tap on the movie
    And user click the "UNFAVORITE" button
    Then the movie should be removed from his list of favorite movies

  Scenario: Unfavorite TV Show
    Given user is on the list of favorite TV Show
    When user tap on the TV Show
    And user click the "UNFAVORITE" button
    Then the TV Show should be removed from his list of favorite TV Show
    