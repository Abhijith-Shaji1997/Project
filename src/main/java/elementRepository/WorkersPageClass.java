package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;
import utility.ExplicitWait;
import utility.FluentWaitClass;
import utility.GeneralUtilities;

public class WorkersPageClass {

	WebDriver driver;

	GeneralUtilities gl = new GeneralUtilities();

	ExplicitWait ewait = new ExplicitWait();

	FluentWaitClass fwait = new FluentWaitClass();

	public WorkersPageClass(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@href='/payrollapp/worker/create']")

	WebElement CreateWorker;

	@FindBy(xpath = "//*[@id='worker-gender']")

	WebElement gender;

	@FindBy(xpath = "//*[@id='worker-branch_id']")

	WebElement branch;

	@FindBy(xpath = "//*[@id='worker-first_name']")

	WebElement firstName;

	@FindBy(xpath = "//*[@id='worker-division_id']")

	WebElement division;

	@FindBy(xpath = "//*[@id='worker-last_name']")

	WebElement lastName;

	@FindBy(xpath = "//*[@id='worker-dob']")

	WebElement dateOfBirth;

	@FindBy(xpath = "//*[@id='worker-address1']")

	WebElement addressLine;

	@FindBy(xpath = "//*[@id='worker-employment_type']")

	WebElement employmentType;

	@FindBy(xpath = "//*[@id='worker-phone']")

	WebElement phoneNumber;

	@FindBy(xpath = "//*[@id='worker-payslip_method']")

	WebElement paySlipMethod;

	@FindBy(xpath = "//*[@id='worker-email']")

	WebElement workersEmail;

	@FindBy(xpath = "//*[@id='worker-postcode']")

	WebElement postCode;

	@FindBy(xpath = "//*[@id='worker-ni_number']")

	WebElement workersNiNumber;

	@FindBy(xpath = "//*[@class='btn btn-success']")

	WebElement nextButton;

	@FindBy(xpath = "//*[@id='worker-payment_method']")

	WebElement paymentMethod;

	@FindBy(xpath = "//*[@id='worker-start_date']")

	WebElement startDate;

	@FindBy(xpath = "//*[@id='worker-ac_name']")

	WebElement accountName;

	@FindBy(xpath = "//*[@id='worker-ac_no']")

	WebElement accountNumber;

	@FindBy(xpath = "//*[@id='worker-sort_code']")

	WebElement sortCode;

	@FindBy(xpath = "//*[@class='btn btn-success']")

	WebElement saveButton;

	@FindBy(xpath = "(//*[(text()='Abhijith Shaji')])[2]")

	WebElement workerNameDisplayOrNot;

	@FindBy(xpath = "//*[@id='workersearch-first_name']")

	WebElement searchName;

	@FindBy(xpath = "//*[@id='workersearch-postcode']")

	WebElement postCodeSearch;

	@FindBy(xpath = "//*[(text()='Search')]")

	WebElement searchButton;

	@FindBy(xpath = "//*[(text()='Abhijith Shaji')]")

	WebElement nameDisplayOrNot;
	
	@FindBy(xpath = "(//*[@data-method='post'])[2]")
	
	WebElement deleteWorker;

	public void clickOnCreateWorkers() {

		gl.clickElement(CreateWorker);
	}

	public void selectGender(int index) {

		gl.selectByIndexDropDown(gender, index);
	}

	public void selectBranch(int index) {

		gl.selectByIndexDropDown(branch, index);

	}

	public void typeFirstName(String str) {

		gl.typeElement(firstName, str);

	}

	public void typeLastName(String str) {

		gl.typeElement(lastName, str);
	}

	public void selectDivision(int index) {

		gl.selectByIndexDropDown(division, index);

	}

	public void typeDateOfBirth(String str) {

		gl.typeElement(dateOfBirth, str);
	}

	public void selectEmploymentType(int index) {

		gl.selectByIndexDropDown(employmentType, index);

	}

	public void typeAddressLine(String str) {

		gl.typeElement(addressLine, str);
	}

	public void selectPayslipMethod(int index) {

		gl.selectByIndexDropDown(paySlipMethod, index);
	}

	public void typePhoneNumber(String str) {

		gl.typeElement(phoneNumber, str);
	}

	public void typeNiNumber(String str) {

		gl.typeElement(workersNiNumber, str);
	}

	public void typeEmail(String str) {

		gl.typeElement(workersEmail, str);
	}

	public void typePostCode(String str) {

		gl.typeElement(postCode, str);

	}

	public void clickNextButton() {

		gl.clickElement(nextButton);
	}

	public void selectPaymentMethod(int index) {

		gl.selectByIndexDropDown(paymentMethod, index);

	}

	public void clearStartDateBox() {

		gl.clearElement(startDate);
	}

	public void typeStartDate(String str) {

		gl.typeElement(startDate, str);
	}

	public void typeAccountName(String str) {

		gl.typeElement(accountName, str);
	}

	public void typeAccountNumber(String str) {

		gl.typeElement(accountNumber, str);
	}

	public void typeSortCode(String str) {

		gl.typeElement(sortCode, str);
	}

	public void clickSaveButton() {

		gl.clickElement(saveButton);

	}

	public void seachNameOfWorker(String str) {

		gl.typeElement(searchName, str);
	}

	public void seachByUsingPostCode(String str) {

		gl.typeElement(postCodeSearch, str);
	}

	public void clickSearchButton() {

		gl.clickElement(searchButton);
	}

	public Boolean isNameDisplayedOrNot() {

		 return gl.isDisplayedOfMethod(nameDisplayOrNot);

	}
	
	//public void clickToDeleteWorker() {
		
		//gl.clickElement(deleteWorker);
	//}
	
	public void clickToAcceptAlert(WebDriver driver) {
		
		driver.switchTo().alert().accept();
	}

	public Boolean IsWorkerNameDisplayedOrNot() {

		return gl.isDisplayedOfMethod(workerNameDisplayOrNot);
	}

	public void clickToDeleteWorker() {
		
		gl.clickElement(deleteWorker);
		
		
	}

		
	}

