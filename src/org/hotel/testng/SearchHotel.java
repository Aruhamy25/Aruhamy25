package org.hotel.testng;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchHotel extends BaseClass{
	
	
	@Parameters({"location","hotels","room_type","room_nos","datepick_in","datepick_out","adult_room","child_room"})
	@Test(priority=2)
	private void searchHotel(String location,String hotels,String room_type,String room_nos,String datepick_in,String datepick_out,String adult_room,String child_room ) {
		
		waitFluent("location");
		WebElement dDnlocation =  locateById("location");
		sendKeys(dDnlocation, location);
		
		WebElement dDnhotel =  locateById("hotels");
		sendKeys(dDnhotel, hotels);

		WebElement dDnRoomType =  locateById("room_type");
		sendKeys(dDnRoomType, room_type);
		
		WebElement dDnPerson =  locateById("room_nos");
		sendKeys(dDnPerson, room_nos);

		WebElement txtInDate =  locateById("datepick_in");
		sendKeys(txtInDate, datepick_in);

		WebElement txtOutDate =  locateById("datepick_out");
		sendKeys(txtOutDate, datepick_out);

		WebElement dDnAdult =  locateById("adult_room");
		sendKeys(dDnAdult, adult_room);

		WebElement dDnChild =  locateById("child_room");
		sendKeys(dDnChild, child_room);

		WebElement btnSearch =  locateById("Submit");
		 click(btnSearch);
	}
}
