package com.bridgelabz.employeewagecomp;

/**
 * Program to Calculate Wages till a condition of total working hours or days is
 * reached for a month - Assume 100 hours and 20 days
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

	public static void main(String[] args) {
		// Variable
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 1;

		/*
		 * Using Random function taking input either 0 or 1 or 2. Using Switch cases
		 * (0)_Default = Employee absent ,1 = full time and 0 = Part time . calculating
		 * monthly wage assuming total working days or total working hours reached are
		 * 20 days and 100 hrs.
		 */
		while ((totalEmpHrs <= MAX_HRS_IN_MONTH) && (totalWorkingDays <= MAX_WORKING_DAYS)) {
			int Emp_Check = (int) Math.floor(Math.random() * 10) % 3;

			switch (Emp_Check) {
			case IS_FULL_TIME:
				System.out.println("Employee Present : Full Time");
				empHrs = 8;
				break;

			case IS_PART_TIME:
				System.out.println("Employee is Present : Part Time");
				empHrs = 4;
				break;

			default:
				System.out.println("Employee is Absent");
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			totalWorkingDays++;
			System.out.println("Employee Wage is : " + empHrs);
			System.out.println();
		}
		// Calculating Monthly wage
		int totalMonthlyWage = totalEmpHrs * EMP_WAGE_PER_HR;
		System.out.println("Employee worked " + totalEmpHrs + " Hrs in " + (totalWorkingDays - 1) + " days.");
		System.out.println("Monthly Wage of employee is : " + totalMonthlyWage);
	}
}