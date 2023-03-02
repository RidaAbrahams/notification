package za.co.sar.ckad.notification.boundary;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class NotificationResourceTest {
    @Test
    void notifyRecipient() {
        given()
                .when().get("/v1/notification")
                .then()
                .statusCode(200)
                .body(is("Notification sent"));
    }
}
