package org.hotel.testng;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BookHotel extends BaseClass {
	
	@Parameters({"first_name","last_name","address","cc_num","cc_type","cc_exp_month","cc_exp_year","cc_cvv"})
	@Test(priority=4)
	private void bookingHotel(String firstname,String lastname,String address,String CreditCard,String ccType,String cc_exp_month,String cc_exp_year,String cvvNumber ) {
		
		waitFluent("first_name");
		WebElement txtFirstName = locateById("first_name");
		sendKeys(txtFirstName, firstname);

		WebElement txtLastName = locateById("last_name");
		sendKeys(txtLastName, lastname);

		WebElement txtAddress = locateById("address");
		sendKeys(txtAddress, address);
		
		WebElement txtCreditCard = locateById("cc_num");
		sendKeys(txtCreditCard,CreditCard);

		WebElement txtCType = locateById("cc_type");
		sendKeys(txtCType, ccType);
		
		WebElement txtCTypeMon = locateById("cc_exp_month");
		sendKeys(txtCTypeMon, cc_exp_month);
		
		WebElement yrr = locateById("cc_exp_year");
		sendKeys(yrr, cc_exp_year);
		
		WebElement txtCvv = locateById("cc_cvv");
		sendKeys(txtCvv, cvvNumber);
		
		WebElement clickBook = locateById("book_now");
		click(clickBook);
	}
}
