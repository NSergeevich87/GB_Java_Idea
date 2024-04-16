package ru.gb;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.gb.pom.LoginPage;
import ru.gb.pom.MainPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerfectGBTests {

    private WebDriver driver;
    private WebDriverWait wait;
    // add login and page
    // ====================
    private LoginPage loginPage;
    private MainPage mainPage;
    // ====================
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
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://test-stand.gb.ru/login");

        // add login page object
        loginPage = new LoginPage(driver, wait);

    }
//    @Test
//    void loginTest() {
//        loginPage.login(USERNAME, PASSWORD);
//        mainPage = new MainPage(driver, wait);
//        assertTrue(mainPage.getUsernameLabelText().contains(USERNAME));
//    }

    @Test
    public void testAddingGroupOnMainPage() { //throws IOException {
        loginPage.login(USERNAME, PASSWORD);
        mainPage = new MainPage(driver, wait);
        assertTrue(mainPage.getUsernameLabelText().contains(USERNAME));

        String groupTestName = "New Test Group " + System.currentTimeMillis();
        mainPage.createGroup(groupTestName);

        assertTrue(mainPage.waitAndGetGroupTitleByText(groupTestName).isDisplayed());

        // Делаем скриншот
//        byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//        Files.write(Path.of(
//                "src/main/Test/resources/screenshot_" + System.currentTimeMillis() + ".png"), screenshotBytes);
    }

    @Test
    void testArchiveGroupOnMainPage() {
        loginPage.login(USERNAME, PASSWORD);
        mainPage = new MainPage(driver, wait);
        assertTrue(mainPage.getUsernameLabelText().contains(USERNAME));

        String groupTestName = "New Test Group " + System.currentTimeMillis();
        mainPage.createGroup(groupTestName);

        mainPage.closeCreateGroupModalWindow();

        assertEquals("active", mainPage.getStatusOfGroupWithTitle(groupTestName));
        mainPage.clickTrashIconOnGroupWithTitle(groupTestName);
        assertEquals("inactive", mainPage.getStatusOfGroupWithTitle(groupTestName));
        mainPage.clickRestoreFromTrashIconOnGroupWithTitle(groupTestName);
        assertEquals("active", mainPage.getStatusOfGroupWithTitle(groupTestName));
    }
    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
