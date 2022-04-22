package com.bridgelabz.employeewagecomp;

/**
 * Ability to manage Employee Wage of multiple companies
 * 
 * @author : Snehal Patil
 *
 */
public class EmpWageBuilder {

	// Declared global variables
	public static final int IS_FUll_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private int numberOfCompany = 0;

	// Array Declaration for Multiple companies
	private CompanyEmpWage[] companyWageArray;

	// Constructor of EmpWageComputation class and array initialisation
	public EmpWageBuilder() {
		companyWageArray = new CompanyEmpWage[5];
	}

	/*
	 * Add companyEmpWage method to add company and passing information related of
	 * company to compute employee wage
	 */
	private void addComapanyEmpWage(String company, int empWagePerHr, int maxWorkingDays, int maxHrPerMonth) {
		companyWageArray[numberOfCompany] = new CompanyEmpWage(company, empWagePerHr, maxWorkingDays, maxHrPerMonth);
		numberOfCompany++;

	}

	/*
	 * Method takes required information from company. Using Random function taking
	 * input either 0 or 1 or 2. Use of Switch cases. Calculate total employee wage.
	 */
	public int empWageCalculation(CompanyEmpWage companyEmpWage) {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		// Check total employee hour and total days not more than given limit
		while (totalEmpHrs <= companyEmpWage.maxHrPerMonth && totalWorkingDays < companyEmpWage.maxWorkingDays) {

			totalWorkingDays++;

			int emp_Check = (int) Math.floor(Math.random() * 10) % 3;

			switch (emp_Check) {
			case IS_FUll_TIME:
				empHrs = 8;
				break;

			case IS_PART_TIME:
				empHrs = 4;
				break;

			default:
				empHrs = 0;
			}

			// calculate total employee hours
			totalEmpHrs += empHrs;
		}

		// Calculate total employee wage
		return companyEmpWage.totalEmpWage = totalEmpHrs * companyEmpWage.empWagePerHr;
	}

	// Display array of company employee wage
	private void empWageCalculation() {
		for (int i = 0; i < numberOfCompany; i++) {
			companyWageArray[i].setTotalEmpWage(empWageCalculation(companyWageArray[i]));
			System.out.println(companyWageArray[i]);
			System.out.println("--------------------------------------------------------------");
		}
	}

	public static void main(String[] args) {

		System.out.println("---------- Welcome to Employee Wage Computation --------------");
		System.out.println();

		EmpWageBuilder companyWageArray = new EmpWageBuilder();
		companyWageArray.addComapanyEmpWage("Nike", 50, 25, 150);
		companyWageArray.addComapanyEmpWage("TCS", 60, 26, 120);
		companyWageArray.addComapanyEmpWage("Amazon", 15, 25, 100);
		companyWageArray.empWageCalculation();
	}

}