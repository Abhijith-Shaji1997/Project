package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPageClass;
import retryAnalyzer.RetryAnalyzerClass;

public class ExecuteLoginPageClass extends BaseClass {

	LoginPageClass lp;

	@Test(groups = { "group1" }, retryAnalyzer = RetryAnalyzerClass.class)
	public void verifyTheCurrentPageIsOpenWhileHittingTheUrl() {

		lp = new LoginPageClass(driver);

		String actresult = lp.getUrl();

		String expresult = "https://qabible.in/payrollapp/site/login";

		Assert.assertEquals(actresult, expresult);

	}

	@Test(groups = {"group1" }, dataProviderClass = DataProviderLogin.class, dataProvider = "DataProvider2", retryAnalyzer = RetryAnalyzerClass.class)

	public void verifySuccessfullLogin(String name, String pass) {

		lp = new LoginPageClass(driver);

		lp.login(name, pass);

		Boolean actresult = lp.isCaolThomasDisplayed();

		Assert.assertTrue(actresult);

	}

	@Test(groups = {"group1" }, dataProviderClass = DataProviderLogin.class, dataProvider = "DataProvider1", retryAnalyzer = RetryAnalyzerClass.class)

	public void verifyUnSuccessfullLogin(String name, String pass) {

		lp = new LoginPageClass(driver);

		lp.login(name, pass);

		String actresult = lp.getTextOfIncorrectOfMessage();

		String expresult = "Incorrect username or password.";

		Assert.assertEquals(actresult, expresult);

	}

}
