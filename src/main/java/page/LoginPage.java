package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-username")
    private WebElement userName;
    @FindBy(id = "input-password")
    private WebElement passWord;
    @FindBy(xpath = "//nb-checkbox[@name=\"rememberMe\"]//preceding-sibling::span")
    private WebElement rememberMe;
    @FindBy(xpath = "//button[text()=' Đăng nhập ']")
    private WebElement đăngNhập;

    public void navigateToHomePage(String url){
        getDriver().get(url);
    }
    public void clickUserName(){
        clickElementById(userName);
    }
    public void inputUserName(String value){
        senKeyElementById(userName,value);
    }
    public void clickPassWord(){
        clickElementById(passWord);
    }
    public void inputPassWord(String value){
        senKeyElementById(passWord,value);
    }
    public void clickRememberMe(){
        clickElementByXpath(rememberMe);
    }
    public void clickĐăngNhập(){
        clickElementByXpath(đăngNhập);
    }
}
