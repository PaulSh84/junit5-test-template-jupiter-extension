import java.util.Arrays;
import java.util.List;
import io.github.bonigarcia.seljup.BrowserBuilder;
import io.github.bonigarcia.seljup.SeleniumExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.RegisterExtension;

public class MultiBrowserTestTemplate {

    @RegisterExtension
    static SeleniumExtension extension = new SeleniumExtension();

    @BeforeAll
    static void setup() {
        String browsersList = System.getProperty("prop.browsers.list");
        List<String> browsers = Arrays.asList(browsersList.split(","));
        if (browsers.contains("chrome")) {
            extension.addBrowsers(BrowserBuilder.chrome().version("80.0.3987.106").build());
        }
        if (browsers.contains("firefox")) {
            extension.addBrowsers(BrowserBuilder.firefox().version("73.0").build());
        }
    }

}
