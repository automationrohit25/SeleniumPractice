
public class restApi {

	public static void main(String[] args) {
		RestAssured.baseURI = "";
		
		String response = given().queryParam().log().all().
				         .when().post("").then().assertThat.statusCode(200).
				         extract().responseAsString();
		
		JsonPath js = new JsonPath(response);
		
		String url = js.get("id");
		
		String response = given().headers("url", url).log().all()
				.when().post("").then().assertThat.statusCode(200).
		         extract().responseAsString();
	}

}
