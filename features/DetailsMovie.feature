Feature: Movies and TV Shows Details

  Scenario: User views the list of movies
    Given user open movie app
    And user is on the Main screen
    When user tap "MOVIES" tab
    Then user should see a list of available movies
    And user close the app

  Scenario: User views the list of TV shows
    Given user open movie app
    And user is on the Main screen
    When user tap on "TV SHOW" tab
    Then user should see a list of available TV shows
    And user close the app
    

  Scenario: User views details of a movie
    Given user is on the Movies screen
    When user tap on a specific movie
    Then user should see the details of the selected movie

  Scenario: User views details of a TV show
    Given user is on the TV Shows screen
    When  user selects a specific TV show
    Then user should see the details of the selected TV show
    