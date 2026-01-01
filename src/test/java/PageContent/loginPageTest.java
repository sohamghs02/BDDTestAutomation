package PageContent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class loginPageTest {
	private WebDriver driver = new EdgeDriver();
	@Given("User on the login page")
	public void user_on_the_login_page() {
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	    driver.manage().window().maximize();
	    
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		
	}
	@When("Click on the submit button")
	public void click_on_the_submit_button() {
	   driver.findElement(By.id("submit")).click();
	}

	@Then("{string} should be displayed")
	public void should_be_displayed(String string) throws InterruptedException {
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains(string));
		Thread.sleep(4000);
		driver.quit();
	}
}
