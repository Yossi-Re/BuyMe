import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IntroRegistrationScreen extends BasePage{

    /**
     * Functions that this class includes: Registration, Enter name and email, Registration button in order to start working.
     */
    public void login(){
        enterBuyMeWebSite();
        pressRegistration();
        pressRegistration2();
        enterCredentials();


    }

    /**
     * Click on Registration button.
     */
    private void pressRegistration(){
        clickElement(By.xpath("//*[@id=\"ember953\"]/div/ul[1]/li[3]/a/span[2]"));
    }

    /**
     * Enter credentials
     */
    private void enterCredentials(){


        sendKeysToElement(By.xpath("//*[@placeholder=\"שם פרטי\"]"), Constants.NAME);
        sendKeysToElement(By.xpath("//*[@placeholder=\"מייל\"]"), Constants.EMAIL);
        sendKeysToElement(By.xpath(Constants.password1), Constants.PASSWORD);
        sendKeysToElement(By.xpath(Constants.password2), Constants.PASSWORD);
    }
    private void pressRegistration2(){
        clickElement(By.xpath("//*[@id=\"ember920\"]/div/div[1]/div/div/div[3]/div[1]/span"));
    }

    private void enterBuyMeWebSite(){
        navigate("https://buyme.co.il/");
    }
}
