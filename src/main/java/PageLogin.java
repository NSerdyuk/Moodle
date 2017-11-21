import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin {

    public final String username ="NSerdyuk";
    public final String passwords ="066987nA6509";
    public WebDriver driver;

    @FindBy(id="username")
    public WebElement login;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(id="loginbtn")
    public WebElement submitButton;



   /* public PageRegistration (PageManager pages){
        super(pages);
    }*/

    public PageLogin(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }

    public void   setLogin() {

        login.sendKeys(username);
    }


    public  void setPassword (){
        password.sendKeys(passwords);

    }

    public void clickSubmitButton(){
        submitButton.click();
    }



}
