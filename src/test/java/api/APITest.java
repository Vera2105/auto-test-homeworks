package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class APITest extends BaseApiTest {
    String API_key = "f643394832e267a849c72208595dc6bb";
    private Map <String, Object> requestBody = new HashMap<>();

    @BeforeEach
    public void setReqBody(){
        Map<String, Object> methodProperties = new HashMap<>();
        methodProperties.put("CityName", "м. Київ");
        methodProperties.put("Limit", 5);
        requestBody.put("apiKey", API_key);
        requestBody.put("modelName", "Address");
        requestBody.put("calledMethod", "searchSettlements");
        requestBody.put("methodProperties", methodProperties);
    }

    @Test
    public void checkThatSuccess() {
        given()
                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body("success", equalTo(true));
    }

    @Test
    public void checkJsonSchema(){
        given()
                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body(matchesJsonSchema(new File(System.getProperty("user.dir")+
                        "\\src\\main\\resources\\validator\\responseSchema.json")));

    }
    @Test
    public void checkRegions(){
        given()
                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body("data[0].Addresses.Present", hasItems("м. Київ, Київська обл.",
                        "смт. Макарів, Макарівський р-н, Київська обл."))
                .body("data[0].TotalCount", equalTo(106));

}
    @Test
    public void checkKyivIsPresentPojo() {
        List<Address> addressData = given()
                .spec(this.requestSpecification)
                .when()
                .contentType(ContentType.JSON).when().body(this.requestBody)
                .post()
                .then().log().all()
                .extract()
                .body().jsonPath().getList("data[0].Addresses", Address.class);
                 System.out.println(addressData);
                 addressData.forEach(el-> Assertions.assertTrue(el.getPresent().contains("Київ")));
    }
}
