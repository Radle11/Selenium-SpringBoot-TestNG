package springBootSelenium.page.facebook;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import springBootSelenium.utils.PageObject;


@Component
public class FacebookLogInPage extends PageObject {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public PageObject passwordInput() {
        by = By.xpath("//div/input[@name='pass']");
        return this;
    }

    public PageObject loginButton() {
        by = By.xpath("//div/button[@name='login']");
        return this;
    }

    public PageObject emailInput() {
        by = By.xpath("//div/input[@name='email']");
        return this;
    }

    public PageObject errorMessage() {
        by = By.xpath("//a[@href='/login/identify/']/parent::div");
        return this;
    }


    public void login(String email, String password) {
        emailInput().sendKeys(email);
        logger.info("Facebook enter email input " + Thread.currentThread().getId());
        passwordInput().sendKeys(password);
        logger.info("Facebook enter password input " + Thread.currentThread().getId());
        loginButton().click();
        logger.info("Facebook login button " + Thread.currentThread().getId());

    }
}
