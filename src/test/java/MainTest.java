import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainTest {


    public static WebDriver driver;
    private WebDriver chromeDriver;

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ereuv\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        driver = DriverSingleton.getDriverInstance();
//        driver.get("https://buyme.co.il/");
    }

    @Test
    public void assertAllFields() {

IntroRegistrationScreen step1=new IntroRegistrationScreen();
        step1.login();
        Assert.assertEquals(Constants.NAME, driver.findElement(By.xpath("//*[@placeholder=\"שם פרטי\"]")).getAttribute("value"));
        Assert.assertEquals(Constants.EMAIL, driver.findElement(By.xpath(Constants.El_Mail)).getAttribute("value"));
        Assert.assertEquals(Constants.PASSWORD, driver.findElement(By.xpath(Constants.password1)).getAttribute("value"));
        Assert.assertEquals(Constants.PASSWORD, driver.findElement(By.xpath(Constants.password2) ).getAttribute("value"));

    }

    /**
     * Test for Step C - Assert website URL
     */
    @Test

    public void assertURLTest(){
        String buyMeURL = "https://buyme.co.il/";
        Assert.assertEquals(chromeDriver.getCurrentUrl(), buyMeURL);

    }

    /**
     * Assert tests for Step 4.
     */
  @Test
    public void assertSenderReceiverNames(){
        SenderReceiverScreen step4= new SenderReceiverScreen();
        step4.giftForSomeoneElse();
        Assert.assertEquals(Constants.NAME, driver.findElement(By.xpath("//*[@id=\"ember2187\"]")).getText());
        Assert.assertEquals(Constants.receiverName, driver.findElement(By.name("מי הזוכה המאושר? יש להשלים את שם המקבל/ת")).getText());
  }


}