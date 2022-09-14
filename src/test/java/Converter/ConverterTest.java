package Converter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.jupiter.api.Assertions.*;



public class ConverterTest {

    private double celcius;
    private double result;
    private double fahrenhiet;
    private Converter converter;
    private int arabic;
    private String roman;

    @Given("^user want to convert (\\d+) fahrenheit to celcius$")
    public void user_want_to_convert_fahrenheit_to_celcius(int arg1) throws Exception {
        converter = new Converter();
    }

    @When("^user enters (\\d+) fahrenheit$")
    public void user_enters_fahrenheit(int arg1) throws Exception {
        fahrenhiet = 200;
    }

    @Then("^fahrenheit is converted to (\\d+) celcius$")
    public void fahrenheit_is_converted_to_celcius(int arg1) throws Exception {
        result = converter.fahrenheitToCelcius(fahrenhiet);
        assertEquals(93.333, result, 0.001);

    }

    @Given("^user want to convert (\\d+) celcius to fahrenheit$")
    public void user_want_to_convert_celcius_to_fahrenheit(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        converter = new Converter();
    }

    @When("^user enters (\\d+) celcius$")
    public void user_enters_celcius(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        celcius = 200;
    }

    @Then("^celcius is converted to (\\d+) fahrenheit$")
    public void celcius_is_converted_to_fahrenheit(int arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        result = converter.celciusToFahrenheit(celcius);
        assertEquals(392.0, result, 0.1);
    }

    @Given("^user wants to convert (\\d+) to roman numerals$")
    public void user_wants_to_convert_to_roman_numerals(int arg1) throws Exception {
        converter = new Converter();
    }

    @When("^user enters (\\d+)$")
    public void user_enters(int arg1) throws Exception {
        arabic = 10;
    }

    @Then("^(\\d+) is converted to \"([^\"]*)\"$")
    public void is_converted_to(int arg1, String arg2) throws Exception {
        roman = converter.convertArabicToRoman(arabic);
        assertEquals("X", roman);
    }


}
