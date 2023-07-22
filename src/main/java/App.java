import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
        // Sets the system property "webdriver.chrome.driver" to the path of the ChromeDriver exe file.
        // This tells Selenium where to find the ChromeDriver on the system.
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        // Driver will wait for 10 seconds to find an element
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Driver will launch the browser and navigate to the URL
        driver.get("http://www.wikipedia.org");
        // Driver will close the browser.
        // Does not terminate the WebDriver instance, only the browser.
        driver.close();

    }
}
