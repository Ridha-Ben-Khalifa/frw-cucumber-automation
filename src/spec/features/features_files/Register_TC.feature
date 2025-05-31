Feature: je verifie la page de register
  En tant que utilisateur je souhaite m inscrire au site Mercury

  @registred
  Scenario Outline: Title of your scenario outline
    Given je me connecte sur lapplication Mercury
    When je clique sur le lien register
    And je saisi le first name <"FirstName">
    And je saisi le last name <"LastName">
    And je saisi le phone number <"Phone">
    And je saisi le email <"Email">
    And je saisi l adress <"Adress">
    And je saisi city <"City">
    And je saisi le state <"State">
    And je saisi le code postal <"PostalCode">
    And je saisi le pays <"Country">
    And je saisi le user name <"UserName">
    And je saisi le mot de passe <"Password">
    And je resaisi le mot de passe <"ConfirmPassword">
    And je clique sur le bouton envoyer
    Then je me redirige vers la page dacceuille "Your user name is"
                
            
        
    
    
  
    Examples: 
      | FirstName | LastName |Phone   | Email      | Adress           |City | State      |PostalCode|Country|UserName|Password|ConfirmPassword| 
      | ridha  |ben khalifa|98123456|ri@gmail.com|route teniour km 2|sfax |sfax centre |3002      |TUNISIA|ri123   |123456  |123456         |
      | foulen |fouleni    |97123456|fo@gmail.com|Jardins du Lac 2  |tunis|Tunis centre|1053      |TUNISIA|fo123   |123456  |123456         |