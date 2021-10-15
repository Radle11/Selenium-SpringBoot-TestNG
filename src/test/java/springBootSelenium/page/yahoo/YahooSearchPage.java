package springBootSelenium.page.yahoo;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import springBootSelenium.utils.PageObject;
@Component
public class YahooSearchPage extends PageObject {

    public PageObject inputBox() {
        by = By.name("p");
        return this;
    }

    public PageObject searchButton() {
        by = By.id("ybar-search");
        return this;
    }

    public PageObject searchResult() {
        by = By.xpath("//ol[@class=' reg searchCenterMiddle']//a[contains(text(),'Selenium')]");
        return this;
    }



    public void search(String search){
        this.inputBox().click().sendKeys(search);
        this.searchButton().click();
    }


}
