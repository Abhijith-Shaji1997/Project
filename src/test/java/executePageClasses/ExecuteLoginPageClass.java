package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPageClass;

public class ExecuteLoginPageClass extends BaseClass {

	LoginPageClass lp;

	@Test
	public void verifyTheCurrentPageIsOpenWhileHittingTheUrl() {

		lp = new LoginPageClass(driver);

		String actresult = lp.getUrl();

		String expresult = "https://qabible.in/payrollapp/site/login";

		Assert.assertEquals(actresult, expresult);

	}

	@Test

	public void verifySuccessfullLogin() {

		lp = new LoginPageClass(driver);

		lp.login("carol", "1q2w3e4r");

		Boolean actresult = lp.isCaolThomasDisplayed();

		Assert.assertTrue(actresult);

	}
	
	@Test(dataProviderClass = DataProviderLogin.class,dataProvider = "DataProvider1")
	
	public void verifyUnSuccessfullLogin(String name,String pass) {
		
		lp = new LoginPageClass(driver);
		
		lp.login (name,pass);
		
		String actresult = lp.getTextOfIncorrectOfMessage();
		
		String expresult = "Incorrect username or password.";
		
		Assert.assertEquals(actresult,expresult);
		
		
	}

}
