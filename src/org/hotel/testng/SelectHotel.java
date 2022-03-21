package org.hotel.testng;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectHotel extends BaseClass {
	
	@Test(priority=3)
	private void selectHotel() {
	
		waitFluent("radiobutton_0");
		WebElement btnRadio = locateById("radiobutton_0");
		click(btnRadio);

		WebElement btncon = locateById("continue");
		click(btncon);
	}
}
