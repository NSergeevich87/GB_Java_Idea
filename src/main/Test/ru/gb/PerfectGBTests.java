package ru.gb;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;
//import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.gb.pom.LoginPage;
import ru.gb.pom.MainPage;
import ru.gb.pom.ProfilePage;

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
    private static String USERNAME_emp;
    private static String PASSWORD_emp;
    private static final String FULLNAME = "2 Student";
    @BeforeAll
    public static void setupClass() {
        //USERNAME = "GB2023106fa2616";
        //PASSWORD = "3b310867c4";
        USERNAME = "MEGAUSERNAME";
        PASSWORD = "8c57d8f638";
        USERNAME_emp = "";
        PASSWORD_emp = "";
    }
    @BeforeEach
    public void setupTest() {
        //driver = new ChromeDriver();
        //wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://test-stand.gb.ru/login");
        Selenide.open("https://test-stand.gb.ru/login");
        driver = WebDriverRunner.getWebDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        // add login page object
        //loginPage = new LoginPage(driver, wait);
        //mainPage = new MainPage(driver, wait);
        //mainPage = new MainPage(driver, wait);

        MainPage mainPage = Selenide.page(MainPage.class);
    }
//    @Test
//    void loginTest() {
//        loginPage.login(USERNAME, PASSWORD);
//        mainPage = new MainPage(driver, wait);
//        assertTrue(mainPage.getUsernameLabelText().contains(USERNAME));
//    }


    @Test
    @Disabled
    public void testAddingGroupOnMainPage() { //throws IOException {
        loginPage.login(USERNAME, PASSWORD);
        //mainPage = new MainPage(driver, wait);
        assertTrue(mainPage.getUsernameLabelText().contains(USERNAME));

        String groupTestName = "New Test Group " + System.currentTimeMillis();
        mainPage.createGroup(groupTestName);

        //assertTrue(mainPage.waitAndGetGroupTitleByText(groupTestName).isDisplayed());

        // Делаем скриншот
//        byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//        Files.write(Path.of(
//                "src/main/Test/resources/screenshot_" + System.currentTimeMillis() + ".png"), screenshotBytes);
    }

    @Test
    @Disabled
    void testArchiveGroupOnMainPage() {
        loginPage.login(USERNAME, PASSWORD);
        //mainPage = new MainPage(driver, wait);
        assertTrue(mainPage.getUsernameLabelText().contains(USERNAME));

        String groupTestName = "New Test Group " + System.currentTimeMillis();
        mainPage.createGroup(groupTestName);

        assertTrue(mainPage.getUsernameLabelText().contains(USERNAME));
    }

    @Test
    public void loggingErrorTest() {
        loginPage.login(USERNAME_emp, PASSWORD_emp);
        //mainPage = new MainPage(driver, wait);
        //assertTrue(mainPage.getUsernameLabelText().contains(USERNAME));
        assertTrue(mainPage.getLoggingErrorText().contains("Invalid credentials."));
    }

    @Test
    @Disabled
    public void changeStudentsInGroupTest() {
        loginPage.login(USERNAME, PASSWORD);
        //mainPage = new MainPage(driver, wait);
        assertTrue(mainPage.getUsernameLabelText().contains(USERNAME));

        String groupTestName = "New Test Group " + System.currentTimeMillis();
        mainPage.createGroup(groupTestName);

        assertEquals("active", mainPage.getStatusOfGroupWithTitle(groupTestName));
        mainPage.clickTrashIconOnGroupWithTitle(groupTestName);
        assertEquals("inactive", mainPage.getStatusOfGroupWithTitle(groupTestName));
        mainPage.clickRestoreFromTrashIconOnGroupWithTitle(groupTestName);
        assertEquals("active", mainPage.getStatusOfGroupWithTitle(groupTestName));
    }

    @Test
    void testBlockingStudentInTableOnMainPage() {

        loginPage.login(USERNAME, PASSWORD);
        String groupTestName = "New test group " + System.currentTimeMillis();
        mainPage.createGroup(groupTestName);

        mainPage.closeCreateGroupModalWindow();

        int studentCount = 3;
        mainPage.clickAddStudentsIconOnGroupWithTitle(groupTestName);
        mainPage.typeAmountOfStudentsInCreateStudentsForm(studentCount);
        mainPage.clickSaveButtonOnCreateStudentsForm();
        mainPage.closeCreateStudentsModalWindow();
        mainPage.waitStudentsCount(groupTestName, studentCount);
        mainPage.clickZoomInIconOnGroupWithTitle(groupTestName);
        // проверка
        String firstGeneratedStudentsName = mainPage.getStudentNameByIndex(0);
        assertEquals("active", mainPage.getStatusOfStudentWithName(firstGeneratedStudentsName));
        mainPage.clickTrashIconOnStudentWithName(firstGeneratedStudentsName);
        assertEquals("block", mainPage.getStatusOfStudentWithName(firstGeneratedStudentsName));
        mainPage.clickRestoreFromTrashIconOnStudentWithName(firstGeneratedStudentsName);
        assertEquals("active", mainPage.getStatusOfStudentWithName(firstGeneratedStudentsName));
    }
    @Test
    public void testNameInProfile() {
        loginPage.login(USERNAME, PASSWORD);
        mainPage.clickProfileButton();
        ProfilePage profilePage = Selenide.page(ProfilePage.class);

        assertEquals("MEGANAME MEGAUSE", profilePage.getAdditionalInfoText());
        assertEquals("MEGANAME MEGAUSE", profilePage.getAvatarFullName());
    }
    @AfterEach
    public void teardown() {
        WebDriverRunner.closeWebDriver();
    }
}