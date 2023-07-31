package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPageClass;
import retryAnalyzer.RetryAnalyzerClass;

public class ExecuteLoginPageClass extends BaseClass {

	LoginPageClass lp;

	@Test( retryAnalyzer = RetryAnalyzerClass.class)
	public void verifyTheCurrentPageIsOpenWhileHittingTheUrl() {

		lp = new LoginPageClass(driver);

		String actresult = lp.getUrl();

		String expresult = "https://qabible.in/payrollapp/site/login";

		Assert.assertEquals(actresult, expresult);

	}

	@Test(  retryAnalyzer = RetryAnalyzerClass.class)

	public void verifySuccessfullLogin() {

		lp = new LoginPageClass(driver);

		lp.login("carol","1q2w3e4r");

		Boolean actresult = lp.isCaolThomasDisplayed();

		Assert.assertTrue(actresult);

	}

	@Test(retryAnalyzer = RetryAnalyzerClass.class)

	public void verifyUnSuccessfullLogin() {

		lp = new LoginPageClass(driver);

		lp.login("carol","1q2w34e43");

		String actresult = lp.getTextOfIncorrectOfMessage();

		String expresult = "Incorrect username or password.";

		Assert.assertEquals(actresult, expresult);

	}

}
