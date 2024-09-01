import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClickButtonTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testClickButton() {
        driver.get("https://demoqa.com/elements");

        // "Buttons" seçeneğini tıklama
        WebElement buttonsMenu = driver.findElement(By.cssSelector("span.text"));
        buttonsMenu.click();

        // "Click Me" düğmesini tıklama
        WebElement clickMeButton = driver.findElement(By.cssSelector("button.btn.btn-primary"));
        clickMeButton.click();

        // Mesajı kontrol etme
        WebElement message = driver.findElement(By.cssSelector("p#dynamicClickMessage"));
        Assert.assertTrue(message.isDisplayed(), "Message is not displayed");
        Assert.assertEquals(message.getText(), "You have done a dynamic click", "Message text is incorrect");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
