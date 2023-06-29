package executePageClasses;

import java.awt.AWTException;

import org.testng.annotations.Test;

import elementRepository.DashboardPage;
import elementRepository.LoginPageClass;
import elementRepository.TimeSheetPageClass;

public class ExecuteTimeSheetPageClass extends BaseClass {

	LoginPageClass lp;

	DashboardPage db;

	TimeSheetPageClass tp;

	@Test
	public void verifyCreateNewTimeSheet() throws AWTException {

		lp = new LoginPageClass(driver);
		
		db = new DashboardPage(driver);
		
		tp = new TimeSheetPageClass(driver);
		
		lp.login("carol", "1q2w3e4r");
		
		db.clickOnTimeSheetTab();
		
		tp.clickOnCreateTimeSheet();
		
		tp.clickOnBrowse();

		tp.uploadAnImage(System.getProperty("user.dir") + "\\src\\test\\resources\\sample.jpg");
	}

}
