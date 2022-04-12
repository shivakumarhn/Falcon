package pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    private WebDriver driver;

    @FindBy(id = "text-input-what")
    private WebElement title;

    @FindBy(xpath = "//ul[@aria-label='suggestions']/child::li[@role='option']")
    private List<WebElement> searchResults;

    @FindBy(id = "text-input-where")
    private WebElement where;

    @FindBy(xpath = "//button[@class='yosegi-InlineWhatWhere-primaryButton']")
    private WebElement findJobs;


    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void enterTitle(String keyword) {
        title.sendKeys(keyword);
    }

    public void selectSuggestion(String option) {
        System.out.println("Keyword suggestions " + searchResults.size());
        int attempts = 0;
        while (attempts < 2) {
            try {
                for (WebElement element : searchResults)
                    if (element.getText().equals(option)) {
                        System.out.println(element.getText());
                        element.click();
                        break;
                    }
            } catch (StaleElementReferenceException e) {
                e.printStackTrace();
            }
            attempts++;
        }

    }

    public void enterLocation(String location) {
        where.sendKeys(location);
    }

    public void clickFindJobs() {
        findJobs.click();
    }


}
