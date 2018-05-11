package br.com.qachallenge;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


class LoginTest {
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	LoginTest() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 15);
	}


	@BeforeEach
	void setUp() throws Exception {
		driver.get("https://staging.annotation.tools.unbabel.com/login/");
	}

	@Test
	void testDeveLogarNoReddit() throws InterruptedException {
		WebElement campoUsuario = driver.findElement(By.id("username"));
		WebElement campoSenha = driver.findElement(By.id("password"));
		WebElement botaoLogin = driver.findElement(By.cssSelector("button[type=submit]"));
	    
		campoUsuario.sendKeys("emanuel+herbert@unbabel.com");
		campoSenha.sendKeys("339356123");
		botaoLogin.click();
		
//		WebElement botaoLogout = driver.findElement(By.xpath("zzzz"));
//		wait.until(ExpectedConditions.elementToBeClickable(botaoLogout));
//		Assert.assertTrue(botaoLogout.isDisplayed());
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
}
