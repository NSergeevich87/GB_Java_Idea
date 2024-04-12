package ru.gb;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HW_GB_Tests {

    private WebDriver driver;
    private WebDriverWait wait;
    private static String USERNAME;
    private static String PASSWORD;

    @BeforeAll
    public static void setupClass() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        USERNAME = "MEGAUSERNAME";
        PASSWORD = "8c57d8f638";
    }
    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    void loginTest() {
        driver.get("https://test-stand.gb.ru/login");

        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("form#login input[type='text']"))).sendKeys(USERNAME);
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("form#login input[type='password']"))).sendKeys(PASSWORD);

        WebElement loginButton = driver.findElement(By.cssSelector("form#login button"));
        loginButton.click();
        wait.until(ExpectedConditions.invisibilityOf(loginButton));

        WebElement createNewPost = driver.findElement(By.cssSelector("button"));
        createNewPost.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("input[type='text']"))).sendKeys("new_post");

        WebElement saveButton = driver.findElement(By.className("mdc-button__label"));
        saveButton.click();
        wait.until(ExpectedConditions.invisibilityOf(saveButton));

        String newPostName = driver.getTitle();
        assertEquals(String.format("new_post"), newPostName);

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile, new File("C:\\Users\\Professional\\Documents\\GB_Java_Idea\\screenshot.png"));
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
