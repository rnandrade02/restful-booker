package steps;

import Utils.ConstanteSchema;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

import io.restassured.response.ValidatableResponse;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import rest.BookerApiTest;

public class ConsultarLivros {

    ValidatableResponse response;
    ConstanteSchema constanteSchema;
    int idLivro;
    BookerApiTest bookerApiTest = new BookerApiTest();

    @Given("Que tenho um id de um livro")
    public void queTenhoUmIdDeUmLivro() {idLivro = bookerApiTest.buscarIdLivro();}
    @When("Consulto o endpoint para buscar um livro")
    public void consultoOEndpointParaBuscarUmLivro() {
       response = bookerApiTest.consultarLivroId(String.valueOf(idLivro));
    }
    @Then("Obtenho os dados do livro consultado")
    public void obtenhoOsDadosDoLivroConsultado() {
        response.assertThat().statusCode(200).body(matchesJsonSchemaInClasspath(constanteSchema.BUSCAR_LIVRO_ID));

    }


}
