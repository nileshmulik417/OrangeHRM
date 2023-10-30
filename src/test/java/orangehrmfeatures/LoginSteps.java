package orangehrmfeatures;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import qa.DriverFactory;

public class LoginSteps {
	
	LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
	    WebDriver driver = DriverFactory.getDriver();	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters username as {string}")
	public void user_enters_username(String userName) {
	    loginPage.enteringUsername(userName);
	}
	
	@When("user enters password as {string}")
	public void user_enters_password(String passWord) {
	    loginPage.enteringPassword(passWord);
	}


	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    loginPage.clickingLoginButton();
	}

	@Then("user should redirect to Dashboard")
	public void user_should_redirect_to_dashboard() {
	    	    
	    Assert.assertTrue(loginPage.isDashBoardHeadingDisplayed());
	}


}
