package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	@FindBy(xpath = "//*[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//*[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	private WebElement dashBoardHeading;
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		}
	
	public void enteringUsername(String uName) {
		
		wait.until(ExpectedConditions.visibilityOf(username));
		
		username.sendKeys(uName);
	}
	
	public void enteringPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickingLoginButton() {
		loginButton.click();
	}
	
	public boolean isDashBoardHeadingDisplayed() {
		
		wait.until(ExpectedConditions.visibilityOf(dashBoardHeading));
		return dashBoardHeading.isDisplayed();
	}
	

}
