package TestBase;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ConsultaCepValido extends SimpleBaseTest{

    @Test
    public void newSimpleTesCase(){
        Response payload =

        given()
                .spec(requestSpec)

        .when()
               .get()

        .then()
        .spec(responseSpec)
        .log().all()
        .extract().response();

        String localidade = payload.then().extract().path("localidade");
        String bairro = payload.then().extract().path("bairro");
        String uf = payload.then().extract().path("uf");

        //Assert.assertEquals(localidade,"Porto Alegre");
       // Assert.assertEquals(bairro, "Mário Quintana");
      //  Assert.assertEquals(uf, "RS");


    }

}
