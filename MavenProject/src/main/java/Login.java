

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;

	By email = By.id("email");
	By pass = By.id("pass");
	By login = By.id("send2");

	public Login(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void typeEmail(String username) {
		driver.findElement(email).sendKeys(username);
	}

	public void typePassword(String password) {
		driver.findElement(pass).sendKeys(password);
	}

	public void clickOnLogin() {
		driver.findElement(login).click();
	}

}
