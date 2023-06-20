package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;
import utility.ExplicitWait;
import utility.FluentWaitClass;
import utility.GeneralUtilities;

public class DashboardPage {

	WebDriver driver;

	GeneralUtilities gl = new GeneralUtilities();

	ExplicitWait ewait = new ExplicitWait();

	FluentWaitClass fwait = new FluentWaitClass();

	public DashboardPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[contains(text(),'Welcome to Payroll Application')]")

	WebElement welcomeMessage;

	@FindBy(xpath = "//a[contains(text(),'Company')]")

	WebElement company;

	@FindBy(xpath = "//a[contains(text(),'Clients')]")

	WebElement clients;

	@FindBy(xpath = "//a[contains(text(),'Workers')]")

	WebElement workers;

	@FindBy(xpath = "//a[contains(text(),'Deduction')]")

	WebElement deduction;

	@FindBy(xpath = "//a[contains(text(),'TimeSheet')]")

	WebElement timesheet;

	@FindBy(xpath = "//a[contains(text(),'Payslip')]")

	WebElement payslip;

	@FindBy(xpath = "//a[contains(text(),'Invoice')]")

	WebElement invoice;

	@FindBy(xpath = "//a[contains(text(),'Report')]")

	WebElement report;

	@FindBy(xpath = "//a[contains(text(),' Settings')]")

	WebElement settings;

	@FindBy(xpath = "//*[@alt='logo']")

	WebElement Logo;
	
	@FindBy(xpath = "(//*[(text()='Deductions')])[2]")
	
	WebElement deductionLogo;
	
	
	

	public Boolean isWelcomeMessageDisplyed() {

		return gl.isDisplayedOfMethod(welcomeMessage);

	}

	public Boolean isClientTableDisplayed() {

		return gl.isDisplayedOfMethod(clients);
	}

	public void clickOnclientPage() {

		gl.clickElement(clients);
	}

	public void clickOnWorkersPage() {
		
		//fwait.elementToBeClickableWait(driver,workers);

		gl.clickElement(workers);

	}

	public Boolean isLogoDisplayed() {

		return gl.isDisplayedOfMethod(Logo);
	}
	
	public void clickOnDeductiontab() {
		
		gl.clickElement(deduction);
	}
	
	public Boolean isDeductionTabIsOpenOrNoT() {
		
		return gl.isDisplayedOfMethod(deductionLogo);
		
		
		
		
	}

}
