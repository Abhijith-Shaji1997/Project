package elementRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExcelRead;
import utility.ExplicitWait;
import utility.FluentWaitClass;
import utility.GeneralUtilities;

public class ClientPageClass {

	WebDriver driver;

	GeneralUtilities gl = new GeneralUtilities();

	ExplicitWait ewait = new ExplicitWait();

	FluentWaitClass fwait = new FluentWaitClass();

	public ClientPageClass(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Create Client')]")

	WebElement createclient;

	@FindBy(xpath = "(//input[@class='form-control'])[1]")

	WebElement clientName;

	@FindBy(xpath = "//input[@id='clientsearch-id']")

	WebElement clientId;

	@FindBy(xpath = "//button[contains(text(),'Search')]")

	WebElement search;

	@FindBy(xpath = "//button[contains(text(),'Reset')]")

	WebElement reset;

	@FindBy(xpath = "//select[@id='client-branch_id']")

	WebElement branch;

	@FindBy(xpath = "//select[@id='client-division_id']")

	WebElement Division;

	@FindBy(xpath = "//input[@id='client-client_name']")

	WebElement nameOfClient;

	@FindBy(xpath = "//textarea[@id='client-client_address']")

	WebElement address;

	@FindBy(xpath = "//input[@id='client-postcode']")

	WebElement postCode;

	@FindBy(xpath = "//input[@id='client-invoice_contact']")

	WebElement invoiceContact;

	@FindBy(xpath = "//input[@id='client-phone']")

	WebElement phoneNumber;

	@FindBy(xpath = "//input[@id='client-email']")

	WebElement clientMail;

	@FindBy(xpath = "//input[@id='client-company_reg']")

	WebElement registration;

	@FindBy(xpath = "//select[@id='client-invoice_order']")

	WebElement invoiceOrder;

	@FindBy(xpath = "//select[@id='client-invoice_delivery_method']")

	WebElement deliveryMethod;

	@FindBy(xpath = "//select[@id='client-master_document']")

	WebElement masterDocument;

	@FindBy(xpath = "//input[@id='client-settilement_days']")

	WebElement clientSettlementDays;

	@FindBy(xpath = "//select[@id='client-vat_rate']")

	WebElement vatRate;

	@FindBy(xpath = "//button[(text()='Save')]")

	WebElement saveButton;

	@FindBy(xpath = "//table/tbody/tr[3]/td[1]")

	WebElement createClientName;

	@FindBy(xpath = "//table/tbody/tr/td[2]")

	WebElement searchClientName;

	public void cliclOnCreateClientPage() {

		gl.clickElement(createclient);
	}

	public void selectValueFromBranch(int index) {

		gl.selectByIndexDropDown(branch, index);

	}

	public void selectValueDivision(int index) {

		gl.selectByIndexDropDown(Division, index);

	}

	public void typeClientName(String str) {

		gl.typeElement(nameOfClient, str);

	}

	public void typeAddressOfClient(String str) {

		gl.typeElement(address, str);

	}

	public void typePostCode(String str) {

		gl.typeElement(postCode, str);

	}

	public void typeInvoiceContact(String str) {

		gl.typeElement(invoiceContact, str);

	}

	public void typePhoneNumber(String str) {

		gl.typeElement(phoneNumber, str);

	}

	public void typeMail(String str) {

		gl.typeElement(clientMail, str);

	}

	public void typeRegistartion(String str) {

		gl.typeElement(registration, str);

	}

	public void typeClientSettlementDays(String str) {

		gl.typeElement(clientSettlementDays, str);

	}

	public void selectInvoiceOrder(int index) {

		gl.selectByIndexDropDown(invoiceOrder, index);

	}

	public void selectDeliveryMethod(int index) {

		gl.selectByIndexDropDown(deliveryMethod, index);

	}

	public void selectMasterDocument(int index) {

		gl.selectByIndexDropDown(masterDocument, index);

	}

	public void selectVatRate(int index) {

		gl.selectByIndexDropDown(vatRate, index);

	}

	public void clickSaveButton() {

		gl.javaScriptClick(driver, saveButton);

	}

	public Boolean createClientName() {

		return gl.isDisplayedOfMethod(createClientName);

	}

	public void typeNameInSearchBox(String str) {

		gl.typeElement(clientName, str);

	}

	public void clickSearchButton() {

		gl.clickElement(search);
	}

	public Boolean displayNameInTable() {

		return gl.isDisplayedOfMethod(searchClientName);
	}

	public String readInvoiceContact(int r, int c) throws IOException {

		return ExcelRead.readIntegerData(r, c);

	}

	public String readClientName(int r, int c) throws IOException {

		return ExcelRead.readStringData(r, c);
	}

	public String readPhoneNumber(int r, int c) throws IOException {

		return ExcelRead.readIntegerData(r, c);

	}

	public String readClientAddress(int r, int c) throws IOException {

		return ExcelRead.readStringData(r, c);
	}

	public String readSettlemrntDays(int r, int c) throws IOException {

		return ExcelRead.readIntegerData(r, c);
	}

	public String readPostCode(int r, int c) throws IOException {

		return ExcelRead.readIntegerData(r, c);

	}

	public String readEmail(int r, int c) throws IOException {

		return ExcelRead.readStringData(r, c);

	}

	public String readCompanyReg(int r, int c) throws IOException {

		return ExcelRead.readStringData(r, c);
	}

}
