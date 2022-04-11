package com.bridgelabz.employeewagecomp;

/**
 * Program to Calculate Wages of Employee for a Month assuming 20 Working Days
 * in a Month
 * 
 * @author : Snehal Patil
 *
 */
public class EmployeeWageComputation {
	// Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_WAGE_PER_HR = 20;
	public static final int NO_WORKING_DAYS = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

		// Variables
		int empHrs = 0, empWage = 0, TotalEmpWage = 0;

		/*
		 * Using Random function taking input either 0 or 1 or 2. Using Switch cases
		 * (0)_Default = Employee absent ,1 = full time and 0 = Part time . calculating
		 * monthly wage assuming total working days in a month are 20.
		 */
		for (int day = 1; day <= NO_WORKING_DAYS; day++) {
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
			empWage = empHrs * EMP_WAGE_PER_HR;
			TotalEmpWage += empWage;
			System.out.println("Employee Wage is : " + empWage);
			System.out.println();
		}
		// Monthly wage
		System.out.println("Monthly Wage of employee is : " + TotalEmpWage);
		System.out.println();
	}
}