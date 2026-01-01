package PageContent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomePageTest {
	private WebDriver driver = new EdgeDriver();
	@Given("User is in the Home Page")
	public void user_is_in_the_home_page() {
	    driver.get("https://practicetestautomation.com/");
	    driver.manage().window().maximize();
	}

	@When("User Scrolls down to the form section")
	public void user_scrolls_down_to_the_form_section() {
	    WebElement form = driver.findElement(By.xpath("//*[@id=\"mp_form_below_posts7\"]/form"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true)", form);
	}

	@When("user enters name")
	public void user_enters_name() {
	    driver.findElement(By.xpath("//*[@id=\"form_first_name_7\"]")).sendKeys("Soham");
	}

	@When("User enters email")
	public void user_enters_email() {
		driver.findElement(By.xpath("//*[@id=\"form_email_7\"]")).sendKeys("test@gmail.com");
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		driver.findElement(By.xpath("//*[@id=\"mp_form_below_posts7\"]/form/div[3]/input")).click();
	}

	@Then("User should see the confirmation Title")
	public void user_should_see_the_confirmation_title() throws InterruptedException {
	    Thread.sleep(5000);
		String expT = "MailPoet Page | Practice Test Automation";
	    String actT = driver.getTitle();
	    Assert.assertEquals(expT, actT);
	    Thread.sleep(4000);
	    driver.quit();
	}

}
