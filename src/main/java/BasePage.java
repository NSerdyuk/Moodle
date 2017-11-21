import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BasePage extends Object {
    @org.junit.Before
    public void Logining() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Натали/IdeaProjects/YandexMarket/.idea/drr/chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(co);
        driver.get("http://moodle.aplana.com/login/index.php");
        //driver.get("https://yandex.ru/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
}
