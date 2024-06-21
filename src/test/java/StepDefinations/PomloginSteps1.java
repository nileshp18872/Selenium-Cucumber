package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import poms.PomLogin;

public class PomloginSteps1 {
	
	
	WebDriver driver = null; 
	PomLogin login;
	
	@Given("user is on login pageee")
	public void user_is_on_login_pageee() throws InterruptedException {
		
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\nilesh\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://162.243.162.181/beta-booster/public/login");
		Thread.sleep(5000);
		System.out.println("User on login page");
	}

	@When("^usr enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) throws InterruptedException {
		
		 login = new PomLogin(driver);
		
		login.valid_useremail(username);
		login.valid_userpass(password);
		
		
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[1]/div/input")).sendKeys(username);
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[2]/div/input")).sendKeys(password);
		Thread.sleep(5000);  
		
		System.out.println("User enter username and password");
	}

	@And("user click login buttonnn")
	public void user_click_login_buttonnn() throws InterruptedException {
		
		login.clicklogin();
		
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[3]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div[1]/div[4]/div/button/img")).click();
		Thread.sleep(5000);
		
		System.out.println("click login button");
	}

	@Then("user will move to home pageee")
	public void user_will_move_to_home_pageee() throws InterruptedException {
		
		Thread.sleep(2000);
		
		String verifywintitle = driver.getTitle();
		Assert.assertTrue(verifywintitle.equalsIgnoreCase("Beta Booster | Dashboard"));
		Thread.sleep(2000);
		System.out.println("User moved to Home pagee");
		
		login.clicklogout();
		
		//driver.findElement(By.xpath("//div/div/div[3]/div/div[1]/div[4]/div/div/div/div[2]/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}




}
