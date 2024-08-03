Feature: test

  Scenario: error
    Given url 'http://127.0.0.1:8080/hello1'
    When method GET
    Then status 404
    And match $ contains {timestamp:"#notnull"}

  Scenario: Testing the exact response of a GET endpoint
  Given url 'http://127.0.0.1:8080/hello'
  When method GET
  Then status 200
  And match $ == {"AccountId":"123","Email":"bb@gmail.com","AccountName":"Durai"}
