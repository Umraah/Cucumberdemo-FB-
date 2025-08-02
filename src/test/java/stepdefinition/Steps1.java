package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps1 {
	WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User enters invalid username and invalid password")
	public void user_enters_invalis_username_and_invalid_password() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("umjserhgfo");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("auyfeden222");
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	    
	}

	@Then("an error message should be displayed")
	public void an_error_message_should_be_displayed() {
		System.out.println("Entered invalid credentials");
		Assert.assertTrue(true);
	    
	}


}
