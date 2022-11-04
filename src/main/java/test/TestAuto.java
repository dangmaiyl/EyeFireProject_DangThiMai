package test;

import constant.Constant;
import core.BaseTest;
import org.testng.annotations.Test;
import page.AddNewPage;
import page.HomePage;
import page.LoginPage;

public class TestAuto extends BaseTest {
    @Test
    public void Login() {
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.navigateToHomePage(Constant.URL);
        loginPage.clickUserName();
        loginPage.inputUserName(Constant.UserName);
        loginPage.clickPassWord();
        loginPage.inputPassWord(Constant.PassWord);
        loginPage.clickRememberMe();
        loginPage.clickĐăngNhập();
    }
    @Test
    public void clickQuanLyHocSinh(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.navigateToHomePage(Constant.URL);
        loginPage.clickUserName();
        loginPage.inputUserName(Constant.UserName);
        loginPage.clickPassWord();
        loginPage.inputPassWord(Constant.PassWord);
        loginPage.clickRememberMe();
        loginPage.clickĐăngNhập();

        homePage.clickIconQuanLyHocSinh();
        homePage.clickQuanLyHocSinh();
    }
    @Test
    public void themMoiHocSinh(){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        AddNewPage addNewPage = new AddNewPage(getDriver());

        loginPage.navigateToHomePage(Constant.URL);
        loginPage.clickUserName();
        loginPage.inputUserName(Constant.UserName);
        loginPage.clickPassWord();
        loginPage.inputPassWord(Constant.PassWord);
        loginPage.clickRememberMe();
        loginPage.clickĐăngNhập();

        homePage.clickIconQuanLyHocSinh();
        homePage.clickQuanLyHocSinh();

        addNewPage.clickThemMoiHocSinh();
        addNewPage.inputMaHocSinh("DEMO123");
        addNewPage.inputTen("Demo");
        addNewPage.inputHo("Test");
        addNewPage.clickIconSelectLop();
        addNewPage.clickLop();
        addNewPage.inputNgaySinh("01/02/2009");
        addNewPage.clickIconSelectGioiTinh();
        addNewPage.clickGioiTinh();
        addNewPage.inputDiaChi("Ha Noi");
        addNewPage.clickLuu();
    }

}
