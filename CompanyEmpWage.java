package com.bridgelabz.employeewagecomp;

public class CompanyEmpWage {

	// Variable Declaration
	public final String company;
	public final int empWagePerHr;
	public final int maxWorkingDays;
	public final int maxHrPerMonth;
	public int totalEmpWage;
	

// Parameterised Constructor
	public CompanyEmpWage(String company, int empWagePerHr, int workingDayPerMonth, int maxHrsPerMonth) {
		this.company = company;
		this.empWagePerHr = empWagePerHr;
		this.maxWorkingDays = workingDayPerMonth;
		this.maxHrPerMonth = maxHrsPerMonth;
	}

	// Setter : set total Employee wage
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	// To-string method: display purpose
	public String toString() {
		return "[Monthly wage should paid by " + company + " to emplyee: " + totalEmpWage + "]";
	}
}