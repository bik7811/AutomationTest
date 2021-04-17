package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class HomePage extends TestBase {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css = "input[name='allbox']")
	WebElement toggleAll;
	
	@FindBy(css = "input[name='todo[3]']")
	WebElement removeSingleListItem;
	
	@FindBy(css = "input[value='Remove']")
	WebElement removeBtn;
	
	@FindBy(linkText  = "BikTest")
	WebElement newAddedCategory;
	
	@FindBy(css = "input[name='categorydata']")
	WebElement inputForAddCategory;
	
	@FindBy(css = "input[value='Add category']")
	WebElement addCategoryBtn;
	
	@FindBy(css = "button[onclick='myFunctionSky()']")
	WebElement skyBlueBackGround;
	
	@FindBy(css = "button[onclick='myFunctionWhite()']")
	WebElement whiteBackGround;
	
	@FindBy(css = "select[name='due_month']")
	WebElement monthDropdown;
	
	@FindBy(xpath = "//span[1]")
	WebElement dupCatCheck;
	
	
	public void checkToggleAll() {
		toggleAll.click();
		
	}
	
	public boolean verifyToggleAllSelected() {
		toggleAll.click();
		return toggleAll.isSelected();
	}
	
	public void removeAllItems() {
		toggleAll.click();
		removeBtn.click();
	}
	
	public void validateRemovalSingleItem() {
		removeSingleListItem.click();
		removeItem();
	}
	
	public boolean verifyRemovalSingleItem()  {
		removeSingleListItem.click();
		removeItem();
		return removeSingleListItem.isDisplayed();
		
	}
	
	public void removeItem() {
		removeBtn.click();
	}
	
	public void enterTextForAddCategory(String excelData) {
		inputForAddCategory.sendKeys(excelData);
		
	}
	
	public void addCategory() {
		addCategoryBtn.click();
	}
	
	public boolean checkNewAddedCategory() {
		return newAddedCategory.isDisplayed();
	}
	
	public String checkDuplicateCategory(String excelData) {
		inputForAddCategory.sendKeys(excelData);
		addCategoryBtn.click();
		return "BikTest";
		}
		
	
	public void dropDown() {
		monthDropdown.click();
		Select select = new Select(monthDropdown);
		List<WebElement> allMonthOptions = select.getOptions();
		int size = allMonthOptions.size();
		for(int i =1; i<size; i++) {
			String options = allMonthOptions.get(i).getText();
			System.out.println(options);
		}
	}
	
	public void setSkyBlueBackGround() {
		skyBlueBackGround.click();
	}
	
	public void setWhiteBackGround() {
		whiteBackGround.click();
	}
}
