package com.bridgelabz.employeewagecomp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ability to get the Total Wage when queried by Company
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
	@Override
	public void displayEmpWage() {
		for (int i = 0; i < companyWageArrayList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyWageArrayList.get(i);

			int totalEmpWage = this.empWageCalculation(companyEmpWage);
			System.out.println("Do you want to print total wage of " + companyEmpWage.company);
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			String check = "yes";
			if (input.equalsIgnoreCase(check)) {

				System.out.println(
						"\nTotal Employee Wage for Company " + companyEmpWage.company + " is " + totalEmpWage + " INR");
				System.out.println(" -------------------------------------------------------------");
			} else {
				System.out.println("Thank You.....");
				System.out.println("--------------------------------------------------------------");
			}
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