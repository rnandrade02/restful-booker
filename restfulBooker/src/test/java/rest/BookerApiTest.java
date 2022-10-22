package rest;

import Utils.Constantes;
import config.Auth;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BookerApiTest {

    Constantes constantes;
    String token = new Auth().gerarToken();


    public void consultarLivroId(String idLivro){
        given()
                .header("Authorization",token)
                .contentType(ContentType.JSON)
                .when()
                .get(constantes.URL_BASE+constantes.BOOKING + idLivro)
                .then().log().all();
    }
}
