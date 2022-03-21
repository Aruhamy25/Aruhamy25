package org.testng;

public class Testng {
	
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
	<suite name="Suite">
	  <test name="Test">
	  
	  		 <parameter name="username" value="Aruchamy"></parameter>
		     <parameter name="password" value="aruchamy"></parameter>
		   
		     <parameter name="location" value="Sydney"></parameter>
		     <parameter name="hotels" value="Hotel Sunshine"></parameter>
		     <parameter name="room_type" value="Super Deluxe"></parameter>
		     <parameter name="room_nos" value="2 - Two"></parameter>
		     <parameter name="datepick_in" value="21/03/2022"></parameter>
		     <parameter name="datepick_out" value="22/03/2022"></parameter>
		     <parameter name="adult_room" value="2 - Two"></parameter>
		     <parameter name="child_room" value="2 - Two"></parameter>

			 <parameter name="first_name" value="Aruchamy"></parameter>
		     <parameter name="last_name" value="Eswaran"></parameter>
		     <parameter name="address" value="Palani"></parameter>
		     <parameter name="cc_num" value="1234123412341234"></parameter>
		     <parameter name="cc_type" value="VISA"></parameter>
		     <parameter name="cc_exp_month" value="July"></parameter>
		     <parameter name="cc_exp_year" value="2022"></parameter>
		     <parameter name="cc_cvv" value="123"></parameter>
		
	<classes>
	 <class name="org.hotel.Login"/>
	 <class name="org.hotel.SearchHotel"/>
	  <class name="org.hotel.SelectHotel"/>
	  <class name="org.hotel.BookHotel"/>
	   <class name="org.hotel.BookingConfirmation"/>
	</classes>
	  </test> <!-- Test -->
	</suite> <!-- Suite -->


}
