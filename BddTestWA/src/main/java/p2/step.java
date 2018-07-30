package p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step {
	WebDriver driver;
	@Given("^WebDriver should be loaded$")
	public void webdriver_should_be_loaded() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.gecko.driver", "E:\\drivers\\Gecko1\\geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("Driver loaded---------------------------------------------------");
	}

	@When("^User details are filled on the loginpage$")
	public void user_details_are_filled_on_the_loginpage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("http://ec2-18-219-199-137.us-east-2.compute.amazonaws.com:8090/TestWebapp/");
		System.out.println("Website loaded---------------------------------------------------");
		driver.findElement(By.xpath("/html/body/form/div[2]/input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/form/div[2]/input[2]")).sendKeys("pass");
		System.out.println("Filled the details---------------------------------------------------");
	}

	@Then("^Check if the login details are correct, goto next page\\.$")
	public void check_if_the_login_details_are_correct_goto_next_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.xpath("/html/body/form/div[2]/button")).click();
		System.out.println("Clicked the button---------------------------------------------------");
		driver.close();
		System.out.println("Driver closed---------------------------------------------------");
	}

}
