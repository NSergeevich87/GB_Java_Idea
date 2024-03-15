package ru.gb.Unit_tests_seminar_5;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SeleniumTest {
    @Test
    public void testGoogleSearch() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement button = driver.findElement(By.id("L2AGLb"));
        button.click();
        Thread.sleep(300);

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();

        Thread.sleep(300);

        List<WebElement> searchResults = driver.findElements(By.cssSelector("div"));

        boolean isFound = false;
        for (WebElement webElement: searchResults) {
            System.out.println(webElement.getText());
            if (webElement.getText().contains("https://www.selenium.dev")) {
                isFound = true;
                break;
            }
        }

        assertTrue(isFound);
        driver.quit();
    }

    @Test
    public void testLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement userNameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        userNameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");

        Thread.sleep(300);

        loginButton.click();

        Thread.sleep(3000);

        WebElement productLabel = driver.findElement(By.className("title"));
        assertEquals("Products", productLabel.getText());

        driver.quit();
    }
}
