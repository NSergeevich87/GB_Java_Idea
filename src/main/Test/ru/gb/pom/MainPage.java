package ru.gb.pom;

import com.codeborne.*
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import ru.gb.pom.elements.GroupTableRow;
import ru.gb.pom.elements.StudentTableRow;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    //private final WebDriverWait wait;

    //@FindBy(css = "nav li.mdc-menu-surface--anchor a")
    //private WebElement usernameLinkInNavBar;
    private SelenideElement usernameLinkInNavBar = $("nav li.mdc-menu-surface--anchor a");

    //@FindBy(css = "p.svelte-uwkxn9")
    //private WebElement errorText;
    private SelenideElement errorText = $("p.svelte-uwkxn9");
    //@FindBy(id = "create-btn")
    //private WebElement createGroupButton;
    private SelenideElement createGroupButton = $("create-btn");
    //@FindBy(xpath = "form#update-item input[type='text']")
    //private WebElement groupNameField;
    private SelenideElement groupNameField = $x("form#update-item input[type='text']");
    //@FindBy(css = "form div.submit button")
    //private WebElement submitButtonOnModalWindow;
    private SelenideElement submitButtonOnModalWindow = $("form div.submit button");
    //@FindBy(css = "button.material-icons mdc-icon-button mdc-icon-button--display-flex smui-icon-button--size-button mdc-icon-button--reduced-size mdc-ripple-upgraded--unbounded mdc-ripple-upgraded")
    //private WebElement deletePostButton;
    private SelenideElement deletePostButton = $("button.material-icons mdc-icon-button mdc-icon-button--display-flex smui-icon-button--size-button mdc-icon-button--reduced-size mdc-ripple-upgraded--unbounded mdc-ripple-upgraded");
    //@FindBy(css = "span.mdc-button__label")
    //private WebElement saveButtonPost;
    private SelenideElement saveButtonPost = $("span.mdc-button__label");
    //@FindBy(xpath = "//span[text()='Creating Study Group']" + "//ancestor::div[contains(@class, 'form-modal-header')]//button")
    //private WebElement closeCreateGroupIcon;
    private SelenideElement closeCreateGroupIcon = $x("//span[text()='Creating Study Group']" + "//ancestor::div[contains(@class, 'form-modal-header')]//button");
    //@FindBy(css = "div#generateStudentsForm-content input")
    //private WebElement createStudentsFormInput;
    private SelenideElement createStudentsFormInput = $("div#generateStudentsForm-content input");
    //@FindBy(css = "div#generateStudentsForm-content div.submit button")
    //private WebElement saveCreateStudentsForm;
    private SelenideElement saveCreateStudentsForm = $("div#generateStudentsForm-content div.submit button");
    //@FindBy(xpath = "//h2[@id='generateStudentsForm-title']/../button")
    //private WebElement closeCreateStudentsFormIcon;
    private SelenideElement closeCreateStudentsFormIcon = $x("//h2[@id='generateStudentsForm-title']/../button");
    //@FindBy(xpath = "//table[@aria-label='Tutors list']/tbody/tr")
    //private List<WebElement> rowsInGroupTable;
    private SelenideElement rowsInGroupTable = $x("//table[@aria-label='Tutors list']/tbody/tr");
    //@FindBy(xpath = "//table[@aria-label='User list']/tbody/tr")
    //private List<WebElement> rowsInStudentTable;
    private SelenideElement rowsInStudentTable = $x("//table[@aria-label='User list']/tbody/tr");
    //@FindBy(xpath = "//nav//li[contains(@class,'mdc-menu-surface--anchor')]//span[text()='Profile']")
    //private WebElement profileButton;
    private SelenideElement profileButton = $x("//nav//li[contains(@class,'mdc-menu-surface--anchor')]//span[text()='Profile']");

    public void clickProfileButton() {
        usernameLinkInNavBar.should(Condition.visible).click();
        profileButton.should(Condition.visible).click();
        //wait.until(ExpectedConditions.visibilityOf(usernameLinkInNavBar)).click();
        //wait.until(ExpectedConditions.visibilityOf(profileButton)).click();
    }
    //public MainPage(WebDriver driver, WebDriverWait wait) {
        //this.wait = wait;
        //PageFactory.initElements(driver, this);
    //}

//    public WebElement waitAndGetGroupTitleByText(String title) {
//        String xpath = String.format("//table[@aria-label='Tutors list']/tbody//td[text()='%s']", title);
//        return $(By.xpath(xpath)).shouldBe(Condition.visible);
//    }

    public void createGroup(String groupName) {
//        wait.until(ExpectedConditions.visibilityOf(createGroupButton)).click();
//        saveButtonPost.click();
//        wait.until(ExpectedConditions.visibilityOf(groupNameField)).sendKeys(groupName);
//        submitButtonOnModalWindow.click();
//        waitAndGetGroupTitleByText(groupName);
        createGroupButton.shouldBe(Condition.visible).click();
        saveButtonPost.click();
        groupNameField.shouldBe(Condition.visible).sendKeys(groupName);
        submitButtonOnModalWindow.click();
        //waitAndGetGroupTitleByText(groupName);
    }

    public void closeCreateGroupModalWindow() {
        closeCreateGroupIcon.click();
        //Condition.visible;
        //Condition.hidden;
        $x("").should(Condition.hidden);
        closeCreateGroupIcon.shouldBe(Condition.disappear);
        //wait.until(ExpectedConditions.invisibilityOf(closeCreateGroupIcon));
    }

    public void typeAmountOfStudentsInCreateStudentsForm(int amount) {
//        wait.until(ExpectedConditions.visibilityOf(createStudentsFormInput))
//                .sendKeys(String.valueOf(amount));
        createStudentsFormInput.shouldBe(Condition.disappear);
    }

    public void clickSaveButtonOnCreateStudentsForm() {
        //wait.until(ExpectedConditions.visibilityOf(saveCreateStudentsForm)).click();
        saveCreateStudentsForm.should(Condition.visible).click();
    }

    public void closeCreateStudentsModalWindow() {
        closeCreateStudentsFormIcon.click();
        //wait.until(ExpectedConditions.invisibilityOf(closeCreateStudentsFormIcon));
    }

    public void clickDeletePostButton() {
        deletePostButton.click();
    }

    public String getUsernameLabelText() {
//        return wait.until(ExpectedConditions.visibilityOf(usernameLinkInNavBar))
//                .getText().replace("\n", " ");
        return usernameLinkInNavBar.shouldBe(Condition.visible).getText().replace("\n", " ");
    }

    public String getLoggingErrorText() {
//        return wait.until(ExpectedConditions.visibilityOf(errorText))
//                .getText();
        return errorText.shouldBe(Condition.visible).getText();
    }

    public void clickTrashIconOnGroupWithTitle(String title) {
        getRowByTitle(title).clickTrashIcon();
    }

    public void clickRestoreFromTrashIconOnGroupWithTitle(String title) {
        getRowByTitle(title).clickRestoreFromTrashIcon();
    }

    public void clickAddStudentsIconOnGroupWithTitle(String title) {
        getRowByTitle(title).clickAddStudentsIcon();
    }

    public void clickZoomInIconOnGroupWithTitle(String title) {
        getRowByTitle(title).clickZoomInIcon();
    }

    public String getStatusOfGroupWithTitle(String title) {
        return getRowByTitle(title).getStatus();
    }

    public void waitStudentsCount(String groupTestName, int studentsCount) {
        getRowByTitle(groupTestName).waitStudentsCount(studentsCount);
    }

    private GroupTableRow getRowByTitle(String title) {
        return rowsInGroupTable.stream()
                .map(GroupTableRow::new)//.map(root -> new GroupTableRow(root))//.map(GroupTableRow::new)
                .filter(row -> row.getTitle().equals(title))
                .findFirst().orElseThrow();
    }

    public void clickTrashIconOnStudentWithName(String name) {
        getStudentRowByName(name).clickTrashIcon();
    }

    public void clickRestoreFromTrashIconOnStudentWithName(String name) {
        getStudentRowByName(name).clickRestoreFromTrashIcon();
    }

    public String getStatusOfStudentWithName(String name) {
        return getStudentRowByName(name).getStatus();
    }

    public String getStudentNameByIndex(int index) {
        //wait.until(ExpectedConditions.visibilityOfAllElements(rowsInStudentTable));
        return rowsInStudentTable.should()
    }

    private StudentTableRow getStudentRowByName(String name) {
        //wait.until(ExpectedConditions.visibilityOfAllElements(rowsInStudentTable));
        return rowsInStudentTable
                .asDynamicIterable()
                .stream()
                .map(StudentTableRow::new)
                .filter(row -> row.getName().equals(name))
                .findFirst().orElseThrow();
    }
}
