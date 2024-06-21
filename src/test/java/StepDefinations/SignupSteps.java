package StepDefinations;








import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupSteps {
	
	public WebDriver driver;
	
	@Given("user is on Registration page and click Create Account")
	public void user_is_on_Registration_page_and_click_Create_Account() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		//System.setProperty("webdriver.chrome.driver","C:\\nilesh\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://162.243.162.181/beta-booster/public/create/account");
		Thread.sleep(5000);
		
		System.out.println("user is on Registration page and click Create Account");
	}

	@When("user enter invalid data on the page")
	public void user_enter_invalid_data_on_the_page(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		
		 //Initialize data table   
	      //List<list> data = dataTable.raw();  
	      //System.out.println(data.get(1).get(1));   
	      
	      //driver.findElement(By.name("firstname")).sendKeys(data.get(1).get(1));  
	      
		System.out.println("user enter valid data on the page");
		System.out.println(dataTable.cell(1, 1));
		System.out.println(dataTable.cell(2, 1));
		System.out.println(dataTable.cell(3, 1));
		System.out.println(dataTable.cell(4, 1));
		System.out.println(dataTable.cell(5, 1));
		System.out.println(dataTable.cell(6, 1));
		System.out.println(dataTable.cell(7, 1));
		System.out.println(dataTable.cell(8, 1));
		System.out.println(dataTable.cell(9, 1));
		System.out.println(dataTable.cell(10, 1));
		System.out.println(dataTable.cell(11, 1));
		System.out.println("user click continue Button");
		 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[1]/div/input")).sendKeys(dataTable.cell(1, 1));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[2]/div/input")).sendKeys(dataTable.cell(2, 1));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[3]/div/input")).sendKeys(dataTable.cell(3, 1));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[4]/div/input")).sendKeys(dataTable.cell(4, 1));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[5]/div/input")).sendKeys(dataTable.cell(5, 1));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[6]/div/input")).sendKeys(dataTable.cell(6, 1));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[7]/div/input")).sendKeys(dataTable.cell(7, 1));
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[9]/button")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"select2--container\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/span/span/span[1]/input")).sendKeys(dataTable.cell(8, 1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[1]/div/div/span/span[1]/span/span[2]/b")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[2]/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/span/span/span[1]/input")).sendKeys(dataTable.cell(9, 1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[1]/div/div/span/span[1]/span/span[2]/b")).click();
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[3]/div/input")).sendKeys(dataTable.cell(10, 1));
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[4]/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/span/span/span[1]/input")).sendKeys(dataTable.cell(11, 1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[1]/div/div/span/span[1]/span/span[2]/b")).click();
		
		
		
	}

	@When("user click Continue button")
	public void user_click_Continue_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user click Confirm Account button");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/form/div/div[5]/button")).click();
		Thread.sleep(5000);
		
		
	}

	@Then("the user registration should be successful")
	public void the_user_registration_should_be_successful() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("the user registration should be successful");
	}




}
