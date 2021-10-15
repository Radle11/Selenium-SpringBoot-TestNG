package springBootSelenium.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;
import springBootSelenium.page.yahoo.YahooSearchPage;
import springBootSelenium.utils.AbstractTest;
import springBootSelenium.utils.PageObject;

public class YahooSearchPageTest extends AbstractTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    YahooSearchPage yahooSearchPage;

    @Test(description = "Yahoo.com Search functionality")
    public void verifyYahooSearch() {
        logger.info("Starting Yahoo search page test");
        String searchText="Selenium";
        yahooSearchPage.search(searchText);
        Assert.assertTrue(yahooSearchPage
                        .searchResult()
                        .getTexts()
                        .stream()
                        .allMatch(result->result.contains(searchText)),
                "Not all search results contains "+searchText);
        logger.info("Yahoo search page test completed.");
    }
}
