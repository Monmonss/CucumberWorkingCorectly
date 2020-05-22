package objects;

import io.cucumber.datatable.DataTable;
import objects.BasicMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.List;

public class MethodsFromTest extends BasicMethods {
    public @FindBy(xpath = "//input[@class='gLFyf gsfi']") //tworzę elementy na stronie
            WebElement button;

    public MethodsFromTest() throws IOException {
        super();
    }

    public void openPage(String URL) throws IOException {
        driver.get(URL);

    }

    public MethodsFromTest send(DataTable dataTable) throws Exception {
        List<List<String>> list = dataTable.asLists(String.class);

      button.sendKeys(list.get(0).get(0));


        return new MethodsFromTest();
    }

}
