package steps;

import Utils.ConstanteSchema;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

import io.restassured.response.ValidatableResponse;
import rest.BookerApiTest;

public class ConsultarReserva {

    BookerApiTest bookerApiTest = new BookerApiTest();
    ValidatableResponse response;
    ConstanteSchema constanteSchema;
    int idLivro;


    @Given("Que tenho um id de uma reserva")
    public void queTenhoUmIdDeUmaReserva() {
        idLivro = bookerApiTest.buscarIdReserva();
    }
    @When("Consulto o endpoint para buscar uma Reserva")
    public void consultoOEndpointParaBuscarUmaReserva() {
        response = bookerApiTest.consultarReservaId(String.valueOf(idLivro));
    }
    @Then("Obtenho os dados da reserva")
    public void obtenhoOsDadosDaReserva() {
        response.assertThat().statusCode(200).body(matchesJsonSchemaInClasspath(constanteSchema.BUSCAR_RESERVA_ID));
    }


}
