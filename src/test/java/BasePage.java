import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.File;

public class BasePage {


    public void sendKeysToElement(By locator, String text){

        getWebElement (locator).sendKeys(text);
    }
    public void clickElement (By locator){

        getWebElement(locator).click();
    }
    public void navigate(String url){
        DriverSingleton.getDriverInstance().get(url);
    }
    private WebElement getWebElement (By locator){
        return
                DriverSingleton.getDriverInstance().findElement(locator);
    }
    File myBuyMe = new File("buymeproject.xml");

    public File getMyBuyMe() {
        return myBuyMe;
    }
}
