package steps;

import Utils.ConstanteSchema;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import org.springframework.beans.factory.annotation.Autowired;
import rest.BookerApiTest;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.is;

public class CriarReserva {

    BookerApiTest bookerApiTest = new BookerApiTest();
    ValidatableResponse response;
    @Autowired
    ConstanteSchema constanteSchema;

    @Given("Que quero criar uma reserva")
    public void queQueroCriarUmaReserva() {}
    @When("Envio um request valido para o endpoint de criacao de reserva")
    public void envioUmRequestValidoParaOEndpointDeCriacaoDeReserva() {
        response = bookerApiTest.criarReserva();
    }
    @Then("Reserva criada com sucesso")
    public void reservaCriadaComSucesso() {
        response.assertThat().statusCode(200).body(matchesJsonSchemaInClasspath(constanteSchema.CRIAR_RESERVA));
        response.assertThat().body("booking.firstname",is("Rodrigo"));
    }




}
