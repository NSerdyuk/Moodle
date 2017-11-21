import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage{
    WebDriver driver;
    PageLogin pageLogin;
    @Test
    public void Test() {

        pageLogin= new PageLogin(driver);
        pageLogin.loginToGuru99("NSerdyuk","066987nA6509");





    }
}
