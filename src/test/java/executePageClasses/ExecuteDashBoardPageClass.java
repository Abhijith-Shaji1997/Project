package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPage;
import elementRepository.LoginPageClass;

public class ExecuteDashBoardPageClass extends BaseClass {

	DashboardPage db;

	LoginPageClass lp;

	@Test
	public void verifySuccessfullLogin() {

		lp = new LoginPageClass(driver);

		lp.login("carol", "1q2w3e4r");

		Boolean actresult = lp.isCaolThomasDisplayed();

		Assert.assertTrue(actresult);

	}

	@Test

	public void verifyLoginMessageIsDisplayedOrNot() {

		db = new DashboardPage(driver);

		lp = new LoginPageClass(driver);

		lp.login("carol", "1q2w3e4r");

		Boolean expresult = true;

		Boolean actresult = db.isWelcomeMessageDisplyed();

		Assert.assertEquals(expresult, actresult);

		System.out.println(actresult);

	}

	@Test

	public void verifyLogoInDashBoardIsDisplayedOrNot() {

		db = new DashboardPage(driver);

		lp = new LoginPageClass(driver);

		lp.login("carol", "1q2w3e4r");

		Boolean actresult1 = db.isLogoDisplayed();

		Assert.assertTrue(actresult1);

	}
	
	@Test
	
	public void verifyDeductionIsOpenOrNoT(){
		
		db = new DashboardPage(driver);

		lp = new LoginPageClass(driver);

		lp.login("carol", "1q2w3e4r");
		
		db.clickOnDeductiontab();
		
		Boolean actresult = db.isDeductionTabIsOpenOrNoT();
		
		Assert.assertTrue(actresult);
	}
}
