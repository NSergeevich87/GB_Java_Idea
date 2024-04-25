package ru.gb.pom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProfilePage {
    private SelenideElement additionalInfo = $x("//h3/following-sibling::div//div[contains(text(), 'Full name')]/following-sibling::div");
    private SelenideElement avatarFullName = $("div.mdc-card h2");
    private SelenideElement fullNameInAvatarSection = $("div.mdc-card h2");

    public String getAdditionalInfoText() {
        return additionalInfo.should(Condition.visible).getText();
    }

    public String getAvatarFullName() {
        return avatarFullName.should(Condition.visible).getText();
    }
}
