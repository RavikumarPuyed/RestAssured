package ticketBooker;

import io.restassured.RestAssured;

public class UpdateBookingPatch {
	
	public static void main(String[] args) {
		RestAssured.given().log().all()
		                .baseUri("https://restful-booker.herokuapp.com/")
		                .basePath("booking/1")
		                .body("{\r\n"
		                		+ "    \"firstname\" : \"James\",\r\n"
		                		+ "    \"lastname\" : \"Brown\"\r\n"
		                		+ "}")
		                .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		                .header("Content-Type","application/json")
		            .when()
		            	 .patch()
		            .then()
		            	 .log().all()
		            	 .statusCode(200);
		            	
		               
		                
		
		
		
		
		
	}

}
