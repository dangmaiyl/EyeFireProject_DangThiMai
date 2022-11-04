package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddNewPage extends BasePage {
    public AddNewPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//button[text()='+ Thêm mới học sinh']")
    private WebElement themMoiHocSinh;
    @FindBy(xpath = "//input[@placeholder=\"Mã học sinh\"]")
    private WebElement maHocSinh;
    @FindBy(xpath = "//input[@placeholder=\"Họ\"]")
    private WebElement ho;
    @FindBy(xpath = "//input[@placeholder=\"Tên\"]")
    private WebElement ten;
    @FindBy(xpath = "(//nb-icon[@icon=\"chevron-down-outline\"])[2]")
    private WebElement selectLop;
    @FindBy(xpath = "//nb-option[text()='1']")
    private WebElement lop;
    @FindBy(xpath = "//input[@placeholder=\"dd/mm/yyyy\"]")
    private WebElement ngaySinh;
    @FindBy(xpath = "(//nb-icon[@icon=\"chevron-down-outline\"])[3]")
    private WebElement selectGioiTinh;
    @FindBy(xpath = "//nb-option[text()='Nữ']")
    private WebElement gioiTinh;
    @FindBy(xpath = "//input[@placeholder=\"Địa chỉ\"]")
    private WebElement diaChi;
    @FindBy(xpath = "//button[@class=\"submit-button appearance-filled size-medium status-info shape-rectangle icon-start transitions\"]")
    private WebElement luu;

    public void clickThemMoiHocSinh(){
        clickElementByXpath(themMoiHocSinh);
    }
    public void inputMaHocSinh(String value){
        senKeyElementByXpath(maHocSinh,value);
    }
    public void inputHo(String value){
        senKeyElementByXpath(ho,value);
    }
    public void inputTen(String value){
        senKeyElementByXpath(ten,value);
    }
    public void clickIconSelectLop(){
        clickElementByXpath(selectLop);
    }
    public void clickLop(){
        clickElementByXpath(lop);
    }
    public void inputNgaySinh(String value){
        senKeyElementByXpath(ngaySinh,value);
    }
    public void clickIconSelectGioiTinh(){
        clickElementByXpath(selectGioiTinh);
    }
    public void clickGioiTinh(){
        clickElementByXpath(gioiTinh);
    }
    public void inputDiaChi(String value){
        senKeyElementByXpath(diaChi,value);
    }
    public void clickLuu(){
        clickElementByXpath(luu);
    }
}
