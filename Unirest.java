import java.net.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.http.Unirest;
import org.junit.Assert;
import org.junit.Test;

public class Unirest {
    Unirest.setTimeouts(0, 0);
    HttpResponse<String> response = Unirest.post("https://petstore.swagger.io/v2/store/order")
            .header("Content-Type", "application/json")
            .body("{\r\n\"id\": 8,\r\n\"petId\": 5,\r\n\"quantity\": 0,\r\n\"shipDate\": \"2022-07-30T17:12:23.423Z\",\r\n\"status\": \"placed\",\r\n\"complete\": true\r\n}")
            .asString();
    //Check
     System.out.printf(response.getBody());
     Assert.assertEquals(200,response.getStatus());

    Unirest.setTimeouts(0, 0);
    HttpResponse<String> response = Unirest.get("https://petstore.swagger.io/v2/store/order/3")
            .body("")
            .asString();
//Check
     System.out.printf(response.getBody());

     Assert.assertEquals(200,response.getStatus());


    Unirest.setTimeouts(0, 0);
    HttpResponse<String> response = Unirest.delete("https://petstore.swagger.io/v2/store/order/2")
            .asString();
//Check
      System.out.printf(response.getBody());
      Assert.assertEquals(200,response.getStatus());

    Unirest.setTimeouts(0, 0);
    HttpResponse<String> response = Unirest.get("https://petstore.swagger.io/v2/store/inventory")
            .asString();
    //Check
        System.out.printf(response.getBody());
        Assert.assertEquals(200,response.getStatus());

}
