package executePageClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.ClientPageClass;
import elementRepository.DashboardPage;
import elementRepository.LoginPageClass;
import elementRepository.WorkersPageClass;
import retryAnalyzer.RetryAnalyzerClass;

public class ExecuteWorkersPageClass extends BaseClass {

	LoginPageClass lp;

	DashboardPage db;

	ClientPageClass cl;

	WorkersPageClass wp;

	@Test(priority = 0, groups = { "group1" }, retryAnalyzer = RetryAnalyzerClass.class)
	public void verifyToCreateANewWorker() throws IOException {

		lp = new LoginPageClass(driver);

		db = new DashboardPage(driver);

		cl = new ClientPageClass(driver);

		wp = new WorkersPageClass(driver);

		lp.login("carol", "1q2w3e4r");

		db.clickOnWorkersPage();

		wp.clickOnCreateWorkers();

		wp.selectGender(0);

		wp.selectBranch(1);

		wp.typeFirstName(wp.readFirstName(10, 1));

		wp.typeLastName(wp.readLastName(11, 1));

		wp.typeDateOfBirth(wp.readDOB(12, 1));

		wp.selectDivision(1);

		wp.typeAddressLine(wp.readAddress(13, 1));

		wp.selectEmploymentType(2);

		wp.typePhoneNumber(wp.readPhone(14, 1));

		wp.selectPayslipMethod(1);

		wp.typeEmail(wp.readEmail(16, 1));

		wp.typeNiNumber(wp.readNiNumber(15, 1));

		wp.typePostCode(wp.readPostCode(17, 1));

		wp.clickNextButton();

		wp.selectPaymentMethod(0);

		

		

		wp.typeAccountName(wp.readAccountName(18, 1));

		wp.typeAccountNumber(wp.readAccountNumber(19, 1));

		wp.typeSortCode(wp.readSortCode(20, 1));

		wp.clickSaveButton();


		Boolean actresult = wp.IsWorkerNameDisplayedOrNot();

		Assert.assertTrue(actresult);

	}

	@Test(priority = 1, groups = { "group1" }, retryAnalyzer = RetryAnalyzerClass.class)

	public void verifyToSearchAWorker() {

		lp = new LoginPageClass(driver);

		db = new DashboardPage(driver);

		wp = new WorkersPageClass(driver);

		lp.login("carol", "1q2w3e4r");

		db.clickOnWorkersPage();

		wp.seachNameOfWorker("Abhijith");

		wp.seachByUsingPostCode("688003");

		wp.clickSearchButton();

		Boolean actresult = wp.isNameDisplayedOrNot();

		Assert.assertTrue(actresult);

	}

	@Test(priority = 2, groups = { "group1" }, retryAnalyzer = RetryAnalyzerClass.class)

	public void verifyDeleteAWorker() {

		lp = new LoginPageClass(driver);

		db = new DashboardPage(driver);

		wp = new WorkersPageClass(driver);

		lp.login("carol", "1q2w3e4r");

		db.clickOnWorkersPage();

		wp.seachNameOfWorker("Abhijith");

		wp.seachByUsingPostCode("688003");

		wp.clickSearchButton();

		wp.clickToDeleteWorker();

		wp.clickToAcceptAlert(driver);

	}

}
