Feature: Login Swag

  @test1
  Scenario: Ingresar s Swag y Validar los productos

    Given que me enuentro en el login de Swag
    When Ingreso mis credenciales "standard_user" y "secret_sauce"
    Then valido que aparezca un titulo "PRODUCTOS"
    And valido que exista un items

