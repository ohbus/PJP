package xyz.subho.spring.springbootjpah2.intergration;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import xyz.subho.spring.springbootjpah2.SpringBootJpaH2Application;
import xyz.subho.spring.springbootjpah2.entity.Order;

/**
 * created by pc on Mar, 2020
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootJpaH2Application.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrderControllerIntegrationTest {

    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();


    @Test
    public void testAddOrder() throws JSONException {
        Order order = new Order();
        order.setId("1");
        order.setName("niraj");
        order.setDescription("desc");

        HttpEntity<Order> entity = new HttpEntity<Order>(order, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/api/order"),
                HttpMethod.POST, entity, String.class);

        String expected = "{\"id\":\"1\",\"name\":\"niraj\",\"description\":\"desc\"}";

        JSONAssert.assertEquals(expected, response.getBody(), false);
    }

    @Test
    public void testAllOrders() throws JSONException {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/api/order/1"),
                HttpMethod.GET, entity, String.class);

        String expected = "{\"id\":\"1\",\"name\":\"niraj\",\"description\":\"desc\"}";

        JSONAssert.assertEquals(expected, response.getBody(), false);
    }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}
