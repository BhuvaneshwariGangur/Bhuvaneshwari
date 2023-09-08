package com.xworkz.day21.app.dto;

import java.io.Serializable;

public class PrinterDTO implements Serializable{
	
	private int noOFPrinters;
	private String companyName;
	
	
	public PrinterDTO() {
		
	}


	@Override
	public String toString() {
		return "PrinterDTO [noOFPrinters=" + noOFPrinters + ", companyName=" + companyName + "]";
	}


	public int getNoOFPrinters() {
		return noOFPrinters;
	}


	public void setNoOFPrinters(int noOFPrinters) {
		this.noOFPrinters = noOFPrinters;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	
	

}
