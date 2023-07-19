package executePageClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.ClientPageClass;
import elementRepository.DashboardPage;
import elementRepository.LoginPageClass;
import retryAnalyzer.RetryAnalyzerClass;

public class ExexcuteClientPageClass extends BaseClass {

	LoginPageClass lp;

	DashboardPage db;

	ClientPageClass cl;

	@Test(groups= {"group3"},retryAnalyzer = RetryAnalyzerClass.class )
	public void verifyCreateNewClient() throws IOException {

		lp = new LoginPageClass(driver);

		db = new DashboardPage(driver);

		cl = new ClientPageClass(driver);

		lp.login("carol", "1q2w3e4r");

		db.clickOnclientPage();

		cl.cliclOnCreateClientPage();

		cl.selectValueFromBranch(1);

		cl.selectInvoiceOrder(1);

		cl.selectValueDivision(1);

		cl.selectDeliveryMethod(1);

		cl.typeInvoiceContact(cl.readInvoiceContact(1,1));

		cl.typeClientName(cl.readClientName(0, 1));

		cl.typePhoneNumber(cl.readPhoneNumber(2, 1));

		cl.typeAddressOfClient(cl.readClientAddress(3, 1));

		cl.selectMasterDocument(1);

		cl.typeClientSettlementDays(cl.readSettlemrntDays(4, 1));

		cl.typeMail(cl.readEmail(5, 1));

		cl.typePostCode(cl.readPostCode(6, 1));

		cl.typeRegistartion(cl.readCompanyReg(7, 1));

		cl.selectVatRate(3);

		cl.clickSaveButton();

		Boolean actresult = cl.createClientName();

		Assert.assertTrue(actresult);

		System.out.println(actresult);

	}

	@Test(groups={"group3"},retryAnalyzer = RetryAnalyzerClass.class)

	public void verifyClientSearchInClientPage() throws IOException {

		lp = new LoginPageClass(driver);

		db = new DashboardPage(driver);

		cl = new ClientPageClass(driver);

		lp.login("carol", "1q2w3e4r");

		db.clickOnclientPage();

		cl.typeNameInSearchBox("Abhijith");

		cl.clickSearchButton();

		Boolean actresult = cl.displayNameInTable();

		Assert.assertTrue(actresult);

		System.out.println(actresult);

	}

}
