Feature: je verifie la page de register
  En tant que utilisateur je souhaite m inscrire au site Mercury

  @tag2
  Scenario Outline: Title of your scenario outline
    Given je me connecte sur lapplication Mercury
    When je clique sur le lien register
    When je saisi le first name <"FirstName">
    When je saisi le last name <"LastName">
  
    Examples: 
      | LastName  | FirstName | 
      | Ridha |    Ben Khalifa |
      | Ghada |     Trabelsi | 
