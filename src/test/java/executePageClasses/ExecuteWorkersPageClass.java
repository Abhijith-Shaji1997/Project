package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.ClientPageClass;
import elementRepository.DashboardPage;
import elementRepository.LoginPageClass;
import elementRepository.WorkersPageClass;

public class ExecuteWorkersPageClass extends BaseClass {

	LoginPageClass lp;

	DashboardPage db;

	ClientPageClass cl;

	WorkersPageClass wp;

	@Test
	public void verifyToCreateANewWorker() {

		lp = new LoginPageClass(driver);

		db = new DashboardPage(driver);

		cl = new ClientPageClass(driver);

		wp = new WorkersPageClass(driver);

		lp.login("carol", "1q2w3e4r");

		db.clickOnWorkersPage();

		wp.clickOnCreateWorkers();

		wp.selectGender(0);

		wp.selectBranch(1);

		wp.typeFirstName("Abhijith");

		wp.typeLastName("Shaji");

		wp.typeDateOfBirth("19-12-1997");

		wp.selectDivision(1);

		wp.typeAddressLine("Alappuzha,Kerala");

		wp.selectEmploymentType(2);

		wp.typePhoneNumber("7907390262");

		wp.selectPayslipMethod(1);

		wp.typeEmail("abhijith@gmail.com");

		wp.typeNiNumber("223344");

		wp.typePostCode("688003");

		wp.clickNextButton();

		wp.selectPaymentMethod(0);

		wp.clearStartDateBox();

		wp.typeStartDate("11-11-22");

		wp.typeAccountName("Abhijith Shaji");

		wp.typeAccountNumber("234243768");

		wp.typeSortCode("27654");

		wp.clickSaveButton();

		Boolean expresult = true;

		Boolean actresult = wp.IsWorkerNameDisplayedOrNot();

		Assert.assertEquals(expresult, actresult);

	}

	@Test

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
	
	@Test

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
