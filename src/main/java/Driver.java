import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

class Driver {
    private static final String USER_NAME = "";
    private static final String PASSWORD = "";
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private Driver() {}

    public static void setupDriver() {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).version("97").setup();
        driver.set(new ChromeDriver(createChromeOptions()));
        ((HasAuthentication) driver.get()).register(UsernameAndPassword.of(USER_NAME, PASSWORD));
    }
    public static WebDriver getInstance() {
        if (driver.get() == null) {
            setupDriver();
        }
        return driver.get();
    }

    public static void closeDriver() {
        driver.get().quit();
        driver.remove();
    }

    private static ChromeOptions createChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
        options.setCapability(CapabilityType.HAS_NATIVE_EVENTS, true);
        return options;
    }
}
