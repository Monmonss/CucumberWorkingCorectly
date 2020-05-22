package factory;

import objects.BasicMethods;
import objects.MethodsFromTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Factory {

    protected static WebDriver driver;
    protected static BasicMethods basicMethods;
    protected static MethodsFromTest methodsFromTest;

    public static WebDriver createDriver() throws IOException {
        try {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(Constant.INFO);
            properties.load(fileInputStream);
            String name = properties.getProperty("browserName");

            switch (name) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "C://Users//blasz//Documents//chromedriver_win32//chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "fire":
                    System.out.println("dsdf");
                    break;
                case "IE":
                    break;
                case "deafult":
                    System.out.println("dsedf");
                    System.out.println("dsedf");
                    System.out.println("dsedf");
                    System.out.println("dsedf");
                    
                    break;
            }

        } catch (Exception exception) {
            System.out.println("impossible to create Driver");
        } finally {
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            basicMethods = PageFactory.initElements(driver, BasicMethods.class);
            methodsFromTest = PageFactory.initElements(driver, MethodsFromTest.class);
        }
        return driver;
    }
}