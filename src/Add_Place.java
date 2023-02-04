import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.payload;

public class Add_Place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set Base URI
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		given().
		log().all().
		queryParam("key","qaclick123").
		header("Content-Type","application/json").
		body(payload.AddPlace()).
		 
		when().
		post("/maps/api/place/add/json").
		
		then().
		log().all().assertThat().
		statusCode(200);
		//body("scope", equalTo("APP"));
		 
		
			

	}

}
