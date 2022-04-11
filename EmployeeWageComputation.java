package com.bridgelabz.employeewagecomp;

/**
 * Program to Calculate Employee Wage Using Switch Cases.
 * 
 * @author : Snehal Patil
 *
 */
public class EmployeeWageComputation {
	// Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_WAGE_PER_HR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

		// Variables
		int empHrs = 0;
		int empWage = 0;

		/*
		 * Using Random function taking input either 0 or 1 or 2. Using Switch cases
		 * (0)_Default = Employee absent ,1 = full time and 0 = Part time . calculating
		 * wage accordingly
		 */
		int Emp_Check = (int) Math.floor(Math.random() * 10) % 3;
		System.out.println("Random value for emp Attendence check is: " + Emp_Check);

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
		System.out.println("Employee Wage is : " + empWage);
	}
}