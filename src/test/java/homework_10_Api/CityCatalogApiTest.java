package homework_10_Api;

import dto.CityCatalog;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class CityCatalogApiTest extends BaseCityCatalog {

    String API_key = "f643394832e267a849c72208595dc6bb";
    private Map<String, Object> reqBodyCityCatalog = new HashMap<>();

    @BeforeEach
    public void setReqBodyCityCatalog() {
        Map<String, Object> methodPropertiesCityCatalog = new HashMap<>();
        methodPropertiesCityCatalog.put("Page", 1);
        methodPropertiesCityCatalog.put("Warehouse", 1);
        methodPropertiesCityCatalog.put("FindByString", "Дніпро");
        methodPropertiesCityCatalog.put("Limit", 7);
        reqBodyCityCatalog.put("apiKey", API_key);
        reqBodyCityCatalog.put("modelName", "Address");
        reqBodyCityCatalog.put("calledMethod", "getSettlements");
        reqBodyCityCatalog.put("methodProperties", methodPropertiesCityCatalog);
    }

    @Test
    public void checkStatusSuccess() {
        given()
                .spec(reqSpecCityCatalog)
                .contentType(ContentType.JSON)
                .body(reqBodyCityCatalog)
                .when()
                .post()
                .then()
                .spec(responseSpecCityCatalog)
                .statusCode(200)
                .assertThat()
                .body("success", equalTo(true));
    }

    @Test
    public void checkItemDnipro() {
        given()
                .spec(reqSpecCityCatalog)
                .contentType(ContentType.JSON)
                .body(reqBodyCityCatalog)
                .when()
                .post()
                .then()
                .spec(responseSpecCityCatalog)
                .statusCode(200)
                .assertThat()
                .body("data.Description", hasItems("Дніпро", "Дніпровка", "Дніпровське"))
                .body("info.totalCount", equalTo(7));
    }

    @Test
    public void checkPojo() {
        List<CityCatalog> cityCatalogList = given()
                .spec(this.reqSpecCityCatalog)
                .when()
                .contentType(ContentType.JSON).when().body(this.reqBodyCityCatalog)
                .post()
                .then().log().all()
                .extract()
                .body().jsonPath().getList("data", CityCatalog.class).stream().filter(el -> el.getAreaDescription().
                        contains("Запорізька")).collect(Collectors.toList());
        Assertions.assertTrue(cityCatalogList.size() > 0);
    }


}
