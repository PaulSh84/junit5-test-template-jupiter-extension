import org.junit.jupiter.api.TestTemplate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MultiBrowserDemoTest extends MultiBrowserTestTemplate {

    @TestTemplate
    public void testInMultipleBrowsers(WebDriver driver) {
        driver.get("https://www.google.com/");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("JUnit5 extensions");
        search.submit();
    }
}
