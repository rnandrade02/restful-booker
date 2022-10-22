package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import rest.BookerApiTest;

public class ConsultarLivros {

    
    BookerApiTest bookerApiTest = new BookerApiTest();

    @Given("Que tenho um id de um livro")
    public void queTenhoUmIdDeUmLivro() {

    }
    @When("Consulto o endpoint para buscar um livro")
    public void consultoOEndpointParaBuscarUmLivro() {
        bookerApiTest.consultarLivroId("400");

           }
    @Then("Obtenho os dados do livro consultado")
    public void obtenhoOsDadosDoLivroConsultado() {

    }


}
