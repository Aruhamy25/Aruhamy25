package org.hotel.testng;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BookingConfirmation extends BaseClass {
	
	@Parameters
	@Test(priority=4)
	private void bookingConfirmation() {
	
		waitFluent("order_no");
		WebElement ptOrderNo = locateById("order_no");
		String orderNumber = getAttribute(ptOrderNo);
		System.out.println(orderNumber);
	}
}
