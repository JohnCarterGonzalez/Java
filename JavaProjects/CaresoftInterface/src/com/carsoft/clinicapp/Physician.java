package com.carsoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	
	//TODO Constructor that takes an ID
	//TODO Implement HIPPAUSER
	
	public Physician (Integer id) {
		super(id);
	}
	
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(this.id == confirmedAuthID) {
			return true;
		} else {
			return false;
		}
	}
	
	public void newPatientNotes(String notes, String patientName, Date date) {
		String report = String.format("Datetime Submitted: %s /n", date);
		report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
	}

	@Override
	public boolean assignPin(int pin) {
		if (pin < 1000 && pin > 9999) {
			return false;
		}
		this.pin = pin;
		return true;
	}


}
