Feature: je verifie la page d authetification
En tant que utilisateur je souhaite m authentifier au site Mercury       // User story

  @connexion
  Scenario: je verifie la page d authetification
    Given je me connecte sur lapplication Mercury
    When je saisi le username "Test"
    And je saisi le password "Test"
    And je clique sur le bouton submit
    Then je me redirige vers la page dacceuil "Login Successfully"