package objects;

import factory.Factory;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicMethods extends Factory {

    WebDriverWait wait;

    public BasicMethods() {
        this.wait = new WebDriverWait(driver, 60 );
    }

    public void WaitAndClickElement(WebElement element) {
        boolean clicked = false;
        int attempt = 0;
        while (clicked == false && attempt < 5) {
            try {
                this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
                clicked = true;
            } catch (Exception exception) {
                System.out.println("can not click element");
            }
            attempt++;
        }

    }
    public boolean WaitUntilWebElementIsVisible(WebElement element) {


            try {
                this.wait.until(ExpectedConditions.visibilityOf(element));
                System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
         return true;
            } catch (Exception e) {
                System.out.println("WebElement is NOT visible, using locator: " + "<" + element.toString() + ">");
                Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
             return false;
            }

    }

    public void sendKeysToWebElement(WebElement element, String textToSend) throws Exception {
        try {
            this.WaitUntilWebElementIsVisible(element);
            element.clear();
            element.sendKeys(textToSend);
            System.out.println("Successfully Sent the following keys: '" + textToSend + "' to element: " + "<" + element.toString() + ">");
        } catch (Exception e) {
            System.out.println("Unable to locate WebElement: " + "<" + element.toString() + "> and send the following keys: " + textToSend);
            Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
        }
    }


    public void waitAndInsertText(WebElement element, String txt) {

        try {
            this.wait.until(ExpectedConditions.visibilityOf(element));
            element.clear();
            element.sendKeys(txt);
            element.sendKeys(Keys.ENTER);


        } catch (Exception exception) {
        }

    }

}
