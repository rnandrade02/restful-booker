package rest;

import Utils.ConstantesPath;
import config.Auth;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class BookerApiTest {

    ConstantesPath constantes;
    String token = new Auth().gerarToken();


    public ValidatableResponse consultarReservaId(String idReserva){
       ValidatableResponse response =  given()
                .header("Authorization",token)
                .contentType(ContentType.JSON)
                .when()
                .get(constantes.URL_BASE+constantes.BOOKING_ID + idReserva)
                .then();
       return response;
    }

    public int buscarIdReserva(){
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
