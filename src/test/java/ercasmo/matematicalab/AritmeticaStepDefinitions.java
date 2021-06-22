package ercasmo.matematicalab;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class AritmeticaStepDefinitions extends SpringIntegrationTest {
    int response = 0;
    String url = DEFAULT_URL + "";

    @When("the client calls \\/aritmeticasimple\\/add with values {int} and {int}")
    public void the_client_calls_arithmetic_add_with_values_and(Integer int1, Integer int2) {
        System.out.println(url + "add?uno=" +int1 + "&dos=" + int2);
        response = restTemplate.getForObject(url + "add?uno=" +
                int1 + "&dos=" + int2, Integer.class);
    }

    @Then("the client receives answer as {int}")
    public void the_client_receives_answer_as(int result) {
        assertEquals(result, response);
    }


    @When("the client calls \\/aritmeticasimple\\/subtract with values {int} and {int}")
    public void the_client_calls_calc_arithmetic_with_values_and(Integer int1, Integer int2) {
        response = restTemplate.getForObject(url + "subtract?uno=" +
                int1 + "&dos=" + int2, Integer.class);
    }

    @When("the client calls \\/aritmeticasimple\\/mul with values {int} and {int}")
    public void the_client_calls_arithmetic_mul_with_values_and(Integer int1, Integer int2) {
        response = restTemplate.getForObject(url + "mul?uno=" +
                int1 + "&dos=" + int2, Integer.class);
    }

    @When("the client calls \\/aritmeticasimple\\/div with values {int} and {int}")
    public void the_client_calls_arithmetic_div_with_values_and(Integer int1, Integer int2) {
        response = restTemplate.getForObject(url + "div?uno=" +
                int1 + "&dos=" + int2, Integer.class);
    }

}
