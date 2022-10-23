package rest;

import Utils.ConstantesPath;
import config.Auth;
import dto.DtoReserva;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

import static io.restassured.RestAssured.given;

public class BookerApiTest {

    ConstantesPath constantes;
    @Autowired
    String token = new Auth().gerarToken();
    LocalDate localDate = LocalDate.now();


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

    public ValidatableResponse criarReserva(){

        ValidatableResponse response =  given()
                .header("Authorization",token)
                .contentType(ContentType.JSON)
                .body(DtoReserva.criarReservaDto("Rodrigo","Nogueira",
                        800.99,true,
                        DtoReserva.datas(String.valueOf(localDate),String.valueOf(localDate.plusDays(4))),"Café da manhã"))
                .when()
                .post(constantes.URL_BASE+constantes.BOOKING)
                .then();
        return response;
    }

    public ValidatableResponse editarReserva(int idReserva){

        ValidatableResponse response =  given()
                .header("Authorization",token)
                .contentType(ContentType.JSON)
                .body(DtoReserva.criarReservaDto("Rodrigo","Nogueira",
                        800.99,true,
                        DtoReserva.datas(String.valueOf(localDate),String.valueOf(localDate.plusDays(4))),"Café da manhã"))
                .when()
                .put(constantes.URL_BASE+constantes.BOOKING+idReserva)
                .then();
        return response;
    }
}
