package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExplicitWait;
import utility.FluentWaitClass;
import utility.GeneralUtilities;

public class DeductionClass {

	WebDriver driver;

	GeneralUtilities gl = new GeneralUtilities();

	ExplicitWait ewait = new ExplicitWait();

	FluentWaitClass fwait = new FluentWaitClass();

	public DeductionClass(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[(text()='Add Deduction')]")

	WebElement addDeduction;

	@FindBy(xpath = "//*[@class='select2-selection__rendered']")

	WebElement addWorker;

	@FindBy(xpath = "//*[@id='deduction-type']")

	WebElement addType;

	@FindBy(xpath = "//*[@id='deduction-amount']")

	WebElement addAmount;

	@FindBy(xpath = "//*[@class='btn btn-success']")

	WebElement saveButton;

	@FindBy(xpath = "//input[@class='select2-search__field']")

	WebElement pleaseSelectTextBox;

	public void clicOnAddDeduction() {

		gl.clickElement(addDeduction);
	}

	public void typeNameOfWorker(String str) {

		gl.clickElement(addWorker);
		
		gl.typeElement(pleaseSelectTextBox, str);
		
		//gl.sendKeysClick(addWorker, driver);
		
		
		
		

	}
	
	public void selectValueFromTextBox() {
		
		gl.sendKeysClick(pleaseSelectTextBox, driver);
	}

	public void addTypeofWorker(int index) {

		gl.selectByIndexDropDown(addType, index);
	}

	public void addAmountOfWorker(String str) {

		gl.typeElement(addAmount, str);
	}

	public void clickSaveButton() {

		gl.clickElement(saveButton);
	}

}
