package testrunner;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.makeAppointmentpage;
import setup.setup;

public class makeAppointmentTR extends setup {
	LoginPage loginpage;
	makeAppointmentpage Make_Appointment;

	@Test (priority = 1 , description = "Validate with make Appointment Page ")
	public void validateMakeAppointment() {
		Make_Appointment = new makeAppointmentpage(driver);
		Make_Appointment.checkymakeAppointmentpage(Makeappointment);
				
	}
	
	@Test (priority = 2, description = "validate HonkongCHC DropDown and Medicaid radio Button ")
	public void validate_2_DropDwon_radioButton() {
		Make_Appointment = new makeAppointmentpage(driver);
		Make_Appointment.chkHongkongCHCdropDwon(Makeappointment);
				
	}
	
	@Test (priority = 3, description = "validate SeoulCHC DropDown and Non radio Button ")
	public void validate_3_DropDwon_radioButton() {
		Make_Appointment = new makeAppointmentpage(driver);
		Make_Appointment.chkSeoulCHCdropDwon(Makeappointment);
				
	}
	
	@Test (priority = 4, description = "verify ScrollUp Button")
	public void verifyScrollUpButton() {
		Make_Appointment = new makeAppointmentpage(driver);
		Make_Appointment.ScrollupButton(Makeappointment);
				
	}
	
	@Test (priority = 5, description = "verify History Button")
	public void verifyHistoryButton() {
		Make_Appointment = new makeAppointmentpage(driver);
		Make_Appointment.HistoryButton(Makeappointment);
	}
	
	
	
}
