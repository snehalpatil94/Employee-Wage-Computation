package com.bridgelabz.employeewagecomp;

/**
 * Write a Class Method to Compute Employee Wage
 * 
 * @author : Snehal Patil
 *
 */
public class EmployeeWageComputation {
	// Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_WAGE_PER_HR = 20;
	public static final int MAX_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	/*
	 * Using Random function taking input either 0 or 1 or 2. Using Switch cases.
	 * Calculating monthly wage assuming total working days or total working hours
	 * reached are 20 days and 100 hrs.
	 */
	public static void computeEmployeeWage() {
		// Variable
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 1;
		int countFullTime = 0;
		int countPartTime = 0;
		int countAbsent = 0;

		while ((totalEmpHrs <= MAX_HRS_IN_MONTH) && (totalWorkingDays <= MAX_WORKING_DAYS)) {
			int Emp_Check = (int) Math.floor(Math.random() * 10) % 3;

			switch (Emp_Check) {
			case IS_FULL_TIME:
				System.out.println("Employee Present : Full Time");
				empHrs = 8;
				countFullTime++;
				break;

			case IS_PART_TIME:
				System.out.println("Employee is Present : Part Time");
				empHrs = 4;
				countPartTime++;
				break;

			default:
				System.out.println("Employee is Absent");
				empHrs = 0;
				countAbsent++;
			}
			totalEmpHrs += empHrs;
			System.out.println("Employee Wage is : " + empHrs);
			System.out.println();
			totalWorkingDays++;
		}
		// Calculating Monthly wage
		System.out.println("Days Employee was present full time : " + countFullTime);
		System.out.println("Days Employee was present half time : " + countPartTime);
		System.out.println("Days Employee was absent : " + countAbsent);
		System.out.println();
		int totalMonthlyWage = totalEmpHrs * EMP_WAGE_PER_HR;
		System.out.println("Employee worked " + totalEmpHrs + " Hrs in " + (totalWorkingDays - 1) + " days.");
		System.out.println();
		System.out.println("Monthly Wage of employee is : Rs. " + totalMonthlyWage);
	}

	public static void main(String[] args) {

		computeEmployeeWage();
	}
}