package ru.gb.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.gb.pom.elements.GroupTableRow;

import java.util.List;

public class MainPage {
    private final WebDriverWait wait;

    @FindBy(css = "nav li.mdc-menu-surface--anchor a")
    private WebElement usernameLinkInNavBar;

    @FindBy(css = "p.svelte-uwkxn9")
    private WebElement errorText;

    @FindBy(id = "create-btn")
    private WebElement createGroupButton;

    @FindBy(xpath = "//form//span[contains(text(), 'Group name')]/following-sibling::input")
    private WebElement groupNameField;

    @FindBy(css = "form div.submit button")
    private WebElement submitButtonOnModalWindow;

    @FindBy(css = "button.material-icons mdc-icon-button mdc-icon-button--display-flex smui-icon-button--size-button mdc-icon-button--reduced-size mdc-ripple-upgraded--unbounded mdc-ripple-upgraded")
    private WebElement deletePostButton;

    @FindBy(css = "span.mdc-button__label")
    private WebElement saveButtonPost;

    @FindBy(xpath = "//span[text()='Creating Study Group']" +
            "//ancestor::div[contains(@class, 'form-modal-header')]//button")
    private WebElement closeCreateGroupIcon;

    @FindBy(xpath = "//table[@aria-label='Tutors list']/tbody/tr")
    private List<WebElement> rowsInGroupTable;

    public MainPage(WebDriver driver, WebDriverWait wait) {
        this.wait = wait;
        PageFactory.initElements(driver, this);
    }

    public WebElement waitAndGetGroupTitleByText(String title) {
        String xpath = String.format("//table[@aria-label='Tutors list']/tbody//td[text()='%s']", title);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public void createGroup(String groupName) {
        wait.until(ExpectedConditions.visibilityOf(createGroupButton)).click();
        saveButtonPost.click();
        //wait.until(ExpectedConditions.visibilityOf(groupNameField)).sendKeys(groupName);
        //submitButtonOnModalWindow.click();
        //waitAndGetGroupTitleByText(groupName);
    }

    public void closeCreateGroupModalWindow() {
        closeCreateGroupIcon.click();
        wait.until(ExpectedConditions.invisibilityOf(closeCreateGroupIcon));
    }

    public void clickDeletePostButton() {
        deletePostButton.click();
    }

    public String getUsernameLabelText() {
        return wait.until(ExpectedConditions.visibilityOf(usernameLinkInNavBar))
                .getText().replace("\n", " ");
    }

    public String getLoggingErrorText() {
        return wait.until(ExpectedConditions.visibilityOf(errorText))
                .getText();
    }

    public void clickTrashIconOnGroupWithTitle(String title) {
        getRowByTitle(title).clickTrashIcon();
    }

    public void clickRestoreFromTrashIconOnGroupWithTitle(String title) {
        getRowByTitle(title).clickRestoreFromTrashIcon();
    }

    public String getStatusOfGroupWithTitle(String title) {
        return getRowByTitle(title).getStatus();
    }

    private GroupTableRow getRowByTitle(String title) {
        return rowsInGroupTable.stream()
                .map(GroupTableRow::new)//.map(root -> new GroupTableRow(root))//.map(GroupTableRow::new)
                .filter(row -> row.getTitle().equals(title))
                .findFirst().orElseThrow();
    }
}
