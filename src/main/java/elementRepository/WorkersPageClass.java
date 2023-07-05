package elementRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.ExplicitWait;
import utility.FluentWaitClass;
import utility.GeneralUtilities;
import utility.ExcelRead;

public class WorkersPageClass {

	WebDriver driver;

	GeneralUtilities gl = new GeneralUtilities();

	ExplicitWait ewait = new ExplicitWait();

	FluentWaitClass fwait = new FluentWaitClass();

	public WorkersPageClass(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='/payrollapp/worker/create']")

	WebElement CreateWorker;

	@FindBy(xpath = "//select[@id='worker-gender']")

	WebElement gender;

	@FindBy(xpath = "//select[@id='worker-branch_id']")

	WebElement branch;

	@FindBy(xpath = "//input[@id='worker-first_name']")

	WebElement firstName;

	@FindBy(xpath = "//select[@id='worker-division_id']")

	WebElement division;

	@FindBy(xpath = "//input[@id='worker-last_name']")

	WebElement lastName;

	@FindBy(xpath = "//input[@id='worker-dob']")

	WebElement dateOfBirth;

	@FindBy(xpath = "//input[@id='worker-address1']")

	WebElement addressLine;

	@FindBy(xpath = "//select[@id='worker-employment_type']")

	WebElement employmentType;

	@FindBy(xpath = "//input[@id='worker-phone']")

	WebElement phoneNumber;

	@FindBy(xpath = "//select[@id='worker-payslip_method']")

	WebElement paySlipMethod;

	@FindBy(xpath = "//input[@id='worker-email']")

	WebElement workersEmail;

	@FindBy(xpath = "//input[@id='worker-postcode']")

	WebElement postCode;

	@FindBy(xpath = "//input[@id='worker-ni_number']")

	WebElement workersNiNumber;

	@FindBy(xpath = "//button[@class='btn btn-success']")

	WebElement nextButton;

	@FindBy(xpath = "//select[@id='worker-payment_method']")

	WebElement paymentMethod;

	@FindBy(xpath = "//*[@id='worker-ac_name']")

	WebElement accountName;

	@FindBy(xpath = "//input[@id='worker-ac_no']")

	WebElement accountNumber;

	@FindBy(xpath = "//input[@id='worker-sort_code']")

	WebElement sortCode;

	@FindBy(xpath = "//button[@class='btn btn-success']")

	WebElement saveButton;

	@FindBy(xpath = "(//*[(text()='Abhijith Shaji')])[2]")

	WebElement workerNameDisplayOrNot;

	@FindBy(xpath = "//input[@id='workersearch-first_name']")

	WebElement searchName;

	@FindBy(xpath = "//input[@id='workersearch-postcode']")

	WebElement postCodeSearch;

	@FindBy(xpath = "//button[(text()='Search')]")

	WebElement searchButton;

	@FindBy(xpath = "//table/tbody/tr/td[2]")

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

	public String readFirstName(int r, int c) throws IOException {

		return ExcelRead.readStringData(r, c);
	}

	public String readLastName(int r, int c) throws IOException {

		return ExcelRead.readStringData(r, c);
	}

	public String readDOB(int r, int c) throws IOException {

		return ExcelRead.readStringData(r, c);
	}

	public String readAddress(int r, int c) throws IOException {

		return ExcelRead.readStringData(r, c);
	}

	public String readPhone(int r, int c) throws IOException {

		return ExcelRead.readIntegerData(r, c);
	}

	public String readNiNumber(int r, int c) throws IOException {

		return ExcelRead.readIntegerData(r, c);
	}

	public String readEmail(int r, int c) throws IOException {

		return ExcelRead.readStringData(r, c);
	}

	public String readPostCode(int r, int c) throws IOException {

		return ExcelRead.readIntegerData(r, c);
	}

	public String readAccountName(int r, int c) throws IOException {

		return ExcelRead.readStringData(r, c);
	}

	public String readAccountNumber(int r, int c) throws IOException {

		return ExcelRead.readIntegerData(r, c);
	}

	public String readSortCode(int r, int c) throws IOException {

		return ExcelRead.readStringData(r, c);
	}

	public void clickNextButton() {

		gl.clickElement(nextButton);
	}

	public void selectPaymentMethod(int index) {

		gl.selectByIndexDropDown(paymentMethod, index);

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

	// public void clickToDeleteWorker() {

	// gl.clickElement(deleteWorker);
	// }

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
