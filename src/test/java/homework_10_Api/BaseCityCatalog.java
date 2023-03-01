package homework_10_Api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeEach;

public class BaseCityCatalog {
    protected RequestSpecification reqSpecCityCatalog;
    protected ResponseSpecification responseSpecCityCatalog;


    @BeforeEach
    public void setSpecs() {
        reqSpecCityCatalog = new RequestSpecBuilder()
                .log(LogDetail.ALL)
                .setBaseUri("https://api.novaposhta.ua/v2.0/json/")
                .build();
        responseSpecCityCatalog = new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .build();
    }
}
