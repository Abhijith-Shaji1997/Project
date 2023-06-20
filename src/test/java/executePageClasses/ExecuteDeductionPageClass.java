package executePageClasses;

import org.testng.annotations.Test;

import elementRepository.DashboardPage;
import elementRepository.DeductionClass;
import elementRepository.LoginPageClass;

public class ExecuteDeductionPageClass extends BaseClass {

	DashboardPage db;

	LoginPageClass lp;

	DeductionClass dc;

	@Test
	public void verifyToAddANewDeduction() {

		lp = new LoginPageClass(driver);

		db = new DashboardPage(driver);

		dc = new DeductionClass(driver);

		lp.login("carol", "1q2w3e4r");

		db.clickOnDeductiontab();
		
		dc.clicOnAddDeduction();
		
		dc.typeNameOfWorker("Abhijith");
		
		dc.selectValueFromTextBox();
		
		dc.addTypeofWorker(3);
		
		dc.addAmountOfWorker("2342");
		
		dc.clickSaveButton();
	}

}
