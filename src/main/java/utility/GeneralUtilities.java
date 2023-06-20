package utility;

import org.apache.commons.io.input.CharSequenceInputStream;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.collect.Streams.IntFunctionWithIndex;

public class GeneralUtilities {

	public void clickElement(WebElement element) {

		element.click();

	}

	public void clearElement(WebElement element) {

		element.click();

	}

	public void typeElement(WebElement element, String text) {

		element.sendKeys(text);

	}

	public String getTextOfAnElement(WebElement element) {

		return element.getText();
	}

	public String getAttributeMethod(WebElement element, String value) {

		return element.getAttribute(value);
	}

	public Boolean isDisplayedOfMethod(WebElement element) {

		return element.isDisplayed();
	}

	public Boolean isEnabledMethod(WebElement element) {

		return element.isEnabled();
	}

	public Boolean isSelectedMethod(WebElement element) {

		return element.isSelected();
	}

	public void acceptAlert(WebDriver driver) {

		driver.switchTo().alert().accept();
	}

	public void alertSendKeys(WebDriver driver, String value) {

		driver.switchTo().alert().sendKeys(value);
	}

	public void selectByIndexDropDown(WebElement element, int index) {

		Select select = new Select(element);

		select.selectByIndex(index);
	}

	public String getCurrenturl(WebDriver driver) {

		return driver.getCurrentUrl();

	}

	public String getTitle(WebDriver driver) {

		return driver.getTitle();
	}

	public void selectByVisibleText(WebElement element, String text) {

		Select select = new Select(element);

		select.selectByVisibleText("Text");
	}

	public void SelectByValue(WebElement element, String value) {

		Select select = new Select(element);

		select.selectByValue(value);

	}

	public void alertDismiss(WebDriver driver) {

		driver.switchTo().alert().dismiss();
	}

	public void alertGetText(WebDriver driver) {

		driver.switchTo().alert().getText();
	}

	public void javaScriptScrollToElement(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();");
	}

	public void javaScriptClick(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();");

	}

	public void sendKeysClick(WebElement element, WebDriver driver) {

		Actions action = new Actions(driver);

		action.sendKeys(element,Keys.ENTER).build().perform();

	}
	


}
