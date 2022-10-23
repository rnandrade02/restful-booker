Feature: Criação de uma nova reserva
  Scenario: Deve criar uma nova reserva
    Given Que quero criar uma reserva
    When Envio um request valido para o endpoint de criacao de reserva
    Then Reserva criada com sucesso