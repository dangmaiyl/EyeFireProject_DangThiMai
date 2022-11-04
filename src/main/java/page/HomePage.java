package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//nb-icon[@class=\"expand-state\"]")
    private WebElement iconQuanLyHocSinh;
    @FindBy(xpath = "(//span[@class=\"menu-title\"])[2]")
    private WebElement quanLyHocSinh;

    public void clickIconQuanLyHocSinh(){
        clickElementByXpath(iconQuanLyHocSinh);
    }
    public void clickQuanLyHocSinh(){
        clickElementByXpath(quanLyHocSinh);
    }
}
