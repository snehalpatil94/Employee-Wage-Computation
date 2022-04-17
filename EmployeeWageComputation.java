package com.bridgelabz.employeewagecomp;

import java.util.Scanner;

/**
 * Program for Ability to save the Total Wage for Each Company
 * 
 * @author : Snehal Patil
 *
 */
public class EmployeeWageComputation {
	// Declared Constant
	public static final int IS_FUll_TIME = 1;
	public static final int IS_PART_TIME = 2;

	// Instance Variable
	private final String company;
	private final int emp_Wage_Per_Hr;
	private final int max_Working_Days;
	private final int maxHr_In_Month;
	private int totalEmpWage;
	private int totalEmpHrs;
	private int countFullTime;
	private int countPartTime;
	private int countAbsent;

	// Parameterised constructor calling
	public EmployeeWageComputation(String company, int emp_Wage_Per_Hr, int max_Working_Days, int maxHr_In_Month) {
		this.company = company;
		this.emp_Wage_Per_Hr = emp_Wage_Per_Hr;
		this.max_Working_Days = max_Working_Days;
		this.maxHr_In_Month = maxHr_In_Month;
	}

	/*
	 * Method takes required information from company. Using Random function taking
	 * input either 0 or 1 or 2. Use of Switch cases. Calculate total salary.
	 */
	public void empWageComputation() {
		// variables initialisation
		int empHrs = 0, totalWorkingDays = 0;

		while (totalEmpHrs <= maxHr_In_Month && totalWorkingDays < max_Working_Days) {
			totalWorkingDays++;

			int emp_Check = (int) Math.floor(Math.random() * 10) % 3;
			switch (emp_Check) {
			case IS_FUll_TIME:
				empHrs = 8;
				countFullTime++;
				break;

			case IS_PART_TIME:
				empHrs = 4;
				countPartTime++;
				break;

			default:
				empHrs = 0;
				countAbsent++;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day : " + totalWorkingDays + " Emp Hrs : " + empHrs);
		}

		// calculate total emp wage
		totalEmpWage = totalEmpHrs * emp_Wage_Per_Hr;
	}

	@Override
	public String toString() {
		return " Company : " + company + " \n Days Employee was present full time : " + countFullTime
				+ "\n Days Employee was present half time : " + countPartTime + "\n Days Employee was absent : "
				+ countAbsent + "\n Total Employee working hours : " + totalEmpHrs + "\n Total Employee Wage : "
				+ totalEmpWage + "";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

		// Initialise object with parameter
		EmployeeWageComputation nike = new EmployeeWageComputation("Nike", 50, 25, 150);
		EmployeeWageComputation tcs = new EmployeeWageComputation("TCS", 60, 26, 120);

		// Calling method using object
		nike.empWageComputation();
		System.out.println();
		System.out.println("Salary sheet : ");
		System.out.println(nike); // displaying NIKE object
		System.out.println("------------------------------------------------");

		tcs.empWageComputation();
		System.out.println();
		System.out.println("Salary sheet : ");
		System.out.println(tcs); // displaying TCS object
	}
}