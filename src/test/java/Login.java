import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage{
    WebDriver driver;
    @Test
    public void Test() {

         PageLogin pageLogin= new PageLogin(driver);
        pageLogin.setLogin();
        pageLogin.setPassword();
        pageLogin.clickSubmitButton();





    }
}
