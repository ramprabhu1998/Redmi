package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogleDefinition {

	WebDriver driver;

@Given("User Enter Google Website")
public void user_Enter_Google_Website() {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
}

@When("user enter the name")
public void user_enter_the_name() {
	WebElement name = driver.findElement(By.name("txtUsername"));
	name.sendKeys("Admin",Keys.ENTER);
	
   
}

@When("user press Enter Key")
public void user_press_Enter_Key() {
    WebElement link = driver.findElement(By.id("txtPassword"));
    		link.sendKeys("admin123");
}

@Then("User should see the Search Result")
public void user_should_see_the_Search_Result() {
	WebElement click = driver.findElement(By.id("btnLogin"));
   click.click();
}

}
