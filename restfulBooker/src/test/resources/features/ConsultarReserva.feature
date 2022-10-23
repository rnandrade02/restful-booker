#languege pt
Feature: Consultar Reservas

  Scenario: Deve Consultar Reserva Por ID
    Given Que tenho um id de uma reserva
    When Consulto o endpoint para buscar uma Reserva
    Then Obtenho os dados da reserva

