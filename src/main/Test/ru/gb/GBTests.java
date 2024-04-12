package ru.gb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GBTests {
    @Test
    void loginTest() {
        String pathToChromeDriver = "src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Передача настроек напрямую

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Выставим implicitlyWaits для ожидания
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://test-stand.gb.ru/login");
        WebElement userNameField = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("form#login input[type='text']")));
        WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.cssSelector("form#login input[type='password']")));

        final String USERNAME = "MEGAUSERNAME"; //System.getProperty("geekbrains_username", System.getenv("geekbrains_username"));
        final String PASSWORD = "8c57d8f638"; //System.getProperty("geekbrains_password", System.getenv("geekbrains_password"));

        userNameField.sendKeys(USERNAME);
        passwordField.sendKeys(PASSWORD);

        WebElement loginButton = driver.findElement(By.cssSelector("form#login button"));
        loginButton.click();
        // Ждем исчезновение кнопки
        wait.until(ExpectedConditions.invisibilityOf(loginButton));

        // Проверка успешного логина по поиску имени с ожиданием
        WebElement userNameLink = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(USERNAME)));
        String actualUsername = userNameLink.getText().replace("\n", " ").trim();
        Assertions.assertEquals(String.format("Hello, %s", USERNAME), actualUsername);

        driver.quit();
    }
}
