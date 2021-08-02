package TestCases;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TesteCepValido {

    @Test
    public void simpleRequest() {
        given()

                .when()
                         .get("https://viacep.com.br/ws/91060900/json/")
                .then()
                         .log().all();
    }
}
