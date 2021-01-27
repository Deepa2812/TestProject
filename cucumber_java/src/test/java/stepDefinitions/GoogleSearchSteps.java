package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	static WebDriver driver = null;
	@Given("Browser is open")
	public void browser_is_open() {
		//String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "/Users/Priya/Downloads/chromedriver2");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("User is on Google Search page")
	public void user_is_on_google_search_page() {
		driver.get("https://www.google.com/");
	}

	@When("User enters a text in Search")
	public void user_enters_a_text_in_search() {
		driver.findElement(By.name("q")).sendKeys("Automation step by step");

	}

	@And("clicks on Google search button")
	public void clicks_on_google_search_button() {
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}

	@Then("User is navigated to the search results page")
	public void user_is_navigated_to_the_search_results_page() {
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}

}
