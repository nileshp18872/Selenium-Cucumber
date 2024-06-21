package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	public WebDriver driver; 
	
	@Given("user is on login_page")
	public void user_is_on_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//System.setProperty("webdriver.chrome.driver","C:\\nilesh\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://162.243.162.181/beta-booster/public/logn");
		Thread.sleep(5000);
		System.out.println("User on login page");
	}

	@When("user click login button")
	public void user_click_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[1]/div/input")).sendKeys("beta1-18nov@yopmail.com");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[2]/div/input")).sendKeys("Sit@1234");
		Thread.sleep(5000);  
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[3]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[1]/div[4]/div/button/img")).click();
		Thread.sleep(5000);
		
		System.out.println("click login button");
	}

	@Then("user will login successfully")
	public void user_will_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		String verifywintitle = driver.getTitle();
		Assert.assertTrue(verifywintitle.equalsIgnoreCase("Beta Booster | Dashboard"));
		driver.close();
		System.out.println("User moved to Home page");
	}




}
