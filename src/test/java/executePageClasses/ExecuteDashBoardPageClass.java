package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPage;
import elementRepository.LoginPageClass;
import retryAnalyzer.RetryAnalyzerClass;

public class ExecuteDashBoardPageClass extends BaseClass {

	DashboardPage db;

	LoginPageClass lp;

	@Test(groups = {"group1"},retryAnalyzer = RetryAnalyzerClass.class)
	public void verifySuccessfullLogin() {

		lp = new LoginPageClass(driver);

		lp.login("carol", "1q2w3e4r");

		Boolean actresult = lp.isCaolThomasDisplayed();

		Assert.assertTrue(actresult);

	}

	@Test(groups = {"group1"},retryAnalyzer = RetryAnalyzerClass.class)

	public void verifyLoginMessageIsDisplayedOrNot() {

		db = new DashboardPage(driver);

		lp = new LoginPageClass(driver);

		lp.login("carol", "1q2w3e4r");

		Boolean expresult = true;

		Boolean actresult = db.isWelcomeMessageDisplyed();

		Assert.assertEquals(expresult, actresult);

		System.out.println(actresult);

	}

	@Test(groups = {"group2"},retryAnalyzer = RetryAnalyzerClass.class)

	public void verifyLogoInDashBoardIsDisplayedOrNot() {

		db = new DashboardPage(driver);

		lp = new LoginPageClass(driver);

		lp.login("carol", "1q2w3e4r");

		Boolean actresult1 = db.isLogoDisplayed();

		Assert.assertTrue(actresult1);

	}
	
	@Test(groups = {"group2"},retryAnalyzer = RetryAnalyzerClass.class)
	
	public void verifyDeductionIsOpenOrNoT(){
		
		db = new DashboardPage(driver);

		lp = new LoginPageClass(driver);

		lp.login("carol", "1q2w3e4r");
		
		db.clickOnDeductiontab();
		
		Boolean actresult = db.isDeductionTabIsOpenOrNoT();
		
		Assert.assertTrue(actresult);
	}
}
