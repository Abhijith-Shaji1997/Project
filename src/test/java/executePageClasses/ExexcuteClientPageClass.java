package executePageClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.ClientPageClass;
import elementRepository.DashboardPage;
import elementRepository.LoginPageClass;

public class ExexcuteClientPageClass extends BaseClass {

	LoginPageClass lp;

	DashboardPage db;

	ClientPageClass cl;

	@Test
	public void verifyCreateNewClient() {

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

		cl.typeInvoiceContact("123");

		cl.typeClientName("Abhijith");

		cl.typePhoneNumber("7907390262");

		cl.typeAddressOfClient("abhinivas kaithavana");

		cl.selectMasterDocument(1);

		cl.typeClientSettlementDays("3");

		cl.typeMail("abhijith123@gmail.com");

		cl.typePostCode("688003");

		cl.typeRegistartion("2313314");

		cl.selectVatRate(3);

		cl.clickSaveButton();

		Boolean actresult = cl.displayName();

		Assert.assertTrue(actresult);

		System.out.println(actresult);

	}

	@Test

	public void verifyClientSearchInClientPage() throws IOException {

		lp = new LoginPageClass(driver);

		db = new DashboardPage(driver);

		cl = new ClientPageClass(driver);

		lp.login("carol", "1q2w3e4r");

		db.clickOnclientPage();

		cl.typeNameInSearchBox(cl.readInvoiceContact(1, 0));

		cl.clickSearchButton();

		Boolean actresult = cl.displayNameInTable();

		Assert.assertTrue(actresult);

		System.out.println(actresult);

	}

}
