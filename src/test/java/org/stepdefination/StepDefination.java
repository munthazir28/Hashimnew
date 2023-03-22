package org.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {
	public WebDriver driver;
	@Given("user facebook signin page")
	public void user_facebook_signin_page() {
	    WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	}

	@When("user enter invalid username and invalid password and invalid gmail and invalid DOB")
	public void user_enter_invalid_username_and_invalid_password_and_invalid_gmail_and_invalid_DOB() throws InterruptedException {
		WebElement createaccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createaccount.click();
		Thread.sleep(1000);
	    WebElement firstname = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
	    firstname.sendKeys("####98798@@@$$%^&");
	    WebElement lastname = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
	    lastname.sendKeys("#$$%%^&&*@!");
	    WebElement email = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
	    email.sendKeys("@#$%^^$@@@$@gmail.com");
	    WebElement confirm = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[4]"));
	    confirm.sendKeys("@#$%^^$@@@$@gmail.com");
	    WebElement pass = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]"));
	    pass.sendKeys("r3rfrhfhf93h923y8yhiubcid");
	    WebElement date= driver.findElement(By.name("birthday_day"));
	    date.sendKeys("28");
	    WebElement month = driver.findElement(By.name("birthday_month"));
	    month.sendKeys("Nov");
	    WebElement year = driver.findElement(By.name("birthday_year"));
	    year.sendKeys("2000");
	    WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
	    gender.click();
	}

	@When("user click signin button")
	public void user_click_signin_button() {
		WebElement signin = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		signin.click();
	    
	}

	@Then("user should be in invalid credential page")
	public void user_should_be_in_invalid_credential_page() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue("check the url", url.contains("www.facebook.com"));
	    
	}

}
