package practical;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ListComboBoxTest {

    @Test
    public void testListAndComboBox() {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();

        options.setBinary("/usr/bin/google-chrome");

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);

        try {

            String pagePath = new File(
                "src/test/resources/list-combobox.html"
            ).getAbsolutePath();

            driver.get("file://" + pagePath);

            // TASK 1: Find the combo box using its ID "comboBox".
            // Write your code below.

            // TASK 2: Select the option "Selenium" from the combo box.
            // Write your code below.
            
            System.out.println("=================================");
            System.out.println("LIST / COMBOBOX PRACTICAL");
            System.out.println("=================================");
            
            System.out.println("Complete TASK 1 and TASK 2.");
            System.out.println("Run the test after completing both tasks.");

            System.out.println("=================================");

        } finally {

            driver.quit();
        }
    }
}