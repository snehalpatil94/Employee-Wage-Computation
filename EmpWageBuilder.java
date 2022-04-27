package com.bridgelabz.employeewagecomp;

import java.util.ArrayList;

/**
 * Store the Daily Wage along with the Total Wage
 * 
 * @author : Snehal Patil
 *
 */

public class EmpWageBuilder implements IEmpWageBuilder {

	// Declared global variables
	public static final int IS_FUll_TIME = 1;
	public static final int IS_PART_TIME = 2;

	// ArrayList Declaration: Multiple companies
	public ArrayList<CompanyEmpWage> companyWageArrayList;

	// constructor
	public EmpWageBuilder() {
		super();
		companyWageArrayList = new ArrayList<CompanyEmpWage>();
	}

	/*
	 * Add companyEmpWage method to add company and passing information related of
	 * company to compute employee wage
	 */
	@Override
	public void addComapanyEmpWage(String company, int empWagePerHr, int maxWorkingDays, int maxHrPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empWagePerHr, maxWorkingDays, maxHrPerMonth);
		companyWageArrayList.add(companyEmpWage);
	}

	/*
	 * Method takes required information from company. Using Random function taking
	 * input either 0 or 1 or 2. Use of Switch cases. Calculate total employee wage.
	 */
	@Override
	public int empWageCalculation(CompanyEmpWage companyEmpWage) {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		System.out.println("Salary sheet of employee : ");
		System.out.println();

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
			System.out.println("Day : " + totalWorkingDays + "-> Working Hrs : " + empHrs);
		}

		// Calculate total employee wage
		return companyEmpWage.totalEmpWage = totalEmpHrs * companyEmpWage.empWagePerHr;
	}

	// Display array of company employee wage
	@Override
	public void displayEmpWage() {
		System.out.println("List of Company and its employee wage : ");
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		for (int i = 0; i < companyWageArrayList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyWageArrayList.get(i);
			companyEmpWage.setTotalEmpWage(empWageCalculation(companyEmpWage));
			System.out.println();
			System.out.println(companyEmpWage);
			System.out.println("--------------------------------------------------------------");
		}
	}

	public static void main(String[] args) {

		System.out.println("------------ Welcome to Employee Wage Computation ------------");
		System.out.println();
		System.out.println();

		EmpWageBuilder companyWageArrayList = new EmpWageBuilder();
		companyWageArrayList.addComapanyEmpWage("Nike", 50, 25, 150);
		companyWageArrayList.addComapanyEmpWage("TCS", 60, 26, 120);
		companyWageArrayList.addComapanyEmpWage("Amazon", 15, 25, 100);
		companyWageArrayList.addComapanyEmpWage("Apple", 30, 20, 100);

		companyWageArrayList.displayEmpWage();
	}
}