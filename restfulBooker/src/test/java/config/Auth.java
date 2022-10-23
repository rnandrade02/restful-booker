package config;

import Utils.ConstantesPath;
import io.restassured.http.ContentType;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Auth {
    ConstantesPath constantes;


    public String gerarToken(){

        Map<Object, String> param = new HashMap<>();
        param.put("password","password123");
        param.put("username","admin");

        String token = given()
                   .contentType(ContentType.JSON)
                   .body(param)
                   .when()
                   .post(constantes.URL_BASE+constantes.TOKEN)
                   .then()
                   .extract().path("token");
            return token;
    }

}
