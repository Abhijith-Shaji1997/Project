package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.GeneralUtilities;

public class LoginPageClass {

	WebDriver driver;

	GeneralUtilities gl = new GeneralUtilities();

	public LoginPageClass(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//*[@id='loginform-username']")

	WebElement username;

	@FindBy(xpath = "//input[@id='loginform-password']")

	WebElement password;

	@FindBy(xpath = "//*[@name='login-button']")

	WebElement login;

	@FindBy(xpath = "//*[@class='dropdown-toggle']")

	WebElement carolThomas;

	@FindBy(xpath = "//p[contains(text(),'Incorrect username')]")

	WebElement incorrect;

	public String getUrl() {

		return gl.getCurrenturl(driver);

	}

	public void login(String uname, String pword) {

		gl.typeElement(username, uname);

		gl.typeElement(password, pword);
		
		gl.clickElement(login);

	}

	public Boolean isCaolThomasDisplayed() {

		return gl.isDisplayedOfMethod(carolThomas);

	}

	public String getTextOfIncorrectOfMessage() {

		return gl.getTextOfAnElement(incorrect);
	}

}
