import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin {

    //  public final String username ="NSerdyuk";
    //  public final String passwords ="066987nA6509";
    WebDriver driver;

    @FindBy(id = "username")
    public WebElement login;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "loginbtn")
    public WebElement submitButton;



   /* public PageRegistration (PageManager pages){
        super(pages);
    }*/

    public PageLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setLogin(String username) {

        login.sendKeys(username);

    }


    public void setPassword(String passwords) {
        password.sendKeys(passwords);

    }

    public void clickSubmitButton() {

        submitButton.click();
    }

    public void loginToGuru99(String username, String passwords) {

        //Fill user name

        this.setLogin(username);

        //Fill password

        this.setPassword(passwords);

        //Click Login button

        this.clickSubmitButton();


    }
}