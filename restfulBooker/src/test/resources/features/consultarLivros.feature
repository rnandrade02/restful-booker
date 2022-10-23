#languege pt
Feature: Consultar livros

  Scenario: Deve Consultar Livro Por ID
    Given Que tenho um id de um livro
    When Consulto o endpoint para buscar um livro
    Then Obtenho os dados do livro consultado

