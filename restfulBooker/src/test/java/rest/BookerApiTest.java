package rest;

import Utils.ConstantesPath;
import config.Auth;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class BookerApiTest {

    ConstantesPath constantes;
    String token = new Auth().gerarToken();


    public ValidatableResponse consultarLivroId(String idLivro){
       ValidatableResponse response =  given()
                .header("Authorization",token)
                .contentType(ContentType.JSON)
                .when()
                .get(constantes.URL_BASE+constantes.BOOKING_ID + idLivro)
                .then();
       return response;
    }

    public int buscarIdLivro(){
            int idLivro = given()
                .header("Authorization",token)
                .contentType(ContentType.JSON)
                .when()
                .get(constantes.URL_BASE+constantes.BOOKING)
                .then()
                .extract().path("bookingid[1]");
    return idLivro;
    }
}
