package steps;

import factory.Factory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class StepDefinitions extends Factory {


    @When("Insert text to the field {string}")
    public void insert_text_to_the_field(DataTable dataTable) throws Exception {
        methodsFromTest.send(dataTable);


    }


//    @Given("Acessing page")
//    public void acessingPage() {
//        driver.get("https://www.google.pl/");
//    }

    @When("Insert texts to the field")
    public void insertTextsToTheField(DataTable dataTable) throws Exception {
       methodsFromTest.send(dataTable);
    }

    @Given("Acessing {string} page")
    public void acessingPage(String arurl) {
        driver.get(arurl);
    }
}
