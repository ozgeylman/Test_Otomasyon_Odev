import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddRecordTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testAddAndEditRecord() {
        driver.get("https://demoqa.com/webtables");

        // "Add" düğmesini tıklama
        WebElement addButton = driver.findElement(By.cssSelector("button#addNewRecordButton"));
        addButton.click();

        // Yeni kayıt ekleme
        WebElement firstNameInput = driver.findElement(By.cssSelector("input#firstName"));
        WebElement lastNameInput = driver.findElement(By.cssSelector("input#lastName"));
        WebElement emailInput = driver.findElement(By.cssSelector("input#userEmail"));
        WebElement ageInput = driver.findElement(By.cssSelector("input#age"));
        WebElement salaryInput = driver.findElement(By.cssSelector("input#salary"));
        WebElement departmentInput = driver.findElement(By.cssSelector("input#department"));
        WebElement submitButton = driver.findElement(By.cssSelector("button#submit"));

        firstNameInput.sendKeys("John");
        lastNameInput.sendKeys("Doe");
        emailInput.sendKeys("john.doe@example.com");
        ageInput.sendKeys("30");
        salaryInput.sendKeys("50000");
        departmentInput.sendKeys("Engineering");
        submitButton.click();

        // Kaydı düzenleme
        WebElement editButton = driver.findElement(By.cssSelector("div.rw-table > div:nth-of-type(1) > div > div:nth-of-type(7) > span > svg"));
        editButton.click();

        // Güncellenmiş bilgileri gir
        firstNameInput = driver.findElement(By.cssSelector("input#firstName"));
        salaryInput = driver.findElement(By.cssSelector("input#salary"));

        firstNameInput.clear();
        firstNameInput.sendKeys("Jane");
        salaryInput.clear();
        salaryInput.sendKeys("55000");
        submitButton.click();

        // Değişiklikleri kontrol etme
        WebElement updatedName = driver.findElement(By.cssSelector("div.rw-table > div:nth-of-type(1) > div > div:nth-of-type(1)"));
        WebElement updatedSalary = driver.findElement(By.cssSelector("div.rw-table > div:nth-of-type(1) > div > div:nth-of-type(6)"));

        Assert.assertEquals(updatedName.getText(), "Jane", "Name was not updated correctly");
        Assert.assertEquals(updatedSalary.getText(), "55000", "Salary was not updated correctly");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
