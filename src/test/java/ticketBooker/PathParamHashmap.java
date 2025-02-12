package ticketBooker;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class PathParamHashmap {
	
	public static void main(String[] args) {
		Map<String, Object> pathpara=new HashMap<>();
		pathpara.put("Book", "booking");
		pathpara.put("id",1);
		
		RestAssured.given()
        .log().all()
        .baseUri("https://restful-booker.herokuapp.com/")
        //.basePath("booking/{id}")
        .pathParams(pathpara)
   .when()
         .get()
   .then().log().all()
         .statusCode(200);

		
	}

}
