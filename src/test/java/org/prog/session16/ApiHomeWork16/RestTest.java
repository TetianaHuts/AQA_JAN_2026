package org.prog.session16.ApiHomeWork16;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.prog.session16.ApiHomeWork16.dto.PersonDto;
import org.prog.session16.ApiHomeWork16.dto.ResultsDto;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestTest {

    //TODO: add location to request
//TODO: validate street number and name in location are not empty

    @Test
    public void testApiCall() {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://randomuser.me/");
        requestSpecification.basePath("/api/");
        requestSpecification.queryParam("noinfo");
        requestSpecification.queryParam("inc", "gender,name,nat,location");

        Response response = requestSpecification.get();
        ResultsDto dto = response.as(ResultsDto.class);
        PersonDto person = dto.getResults().get(0);
        String streetName = person.getLocation().getStreet().getName();
        String streetNumber = person.getLocation().getStreet().getNumber();

        Assert.assertNotNull(streetName, "Street name is null");
        Assert.assertNotNull(streetNumber, "Street number is null");

        Assert.assertFalse(streetName.isEmpty(), "Street name is empty");
        Assert.assertFalse(streetNumber.isEmpty(), "Street name is empty");

        System.out.println("Street: " + streetName + " " + "Number: " + streetNumber);
    }

}
