package com.bridgelabz.employeewagecomp;

/**
 * Program to Check Whether employee is full time or part time.Calculate wage..
 * 
 * @author : Snehal Patil
 *
 */
public class EmployeeWageComputation {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");

		// Constants
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_WAGE_PER_HR = 20;

		// Variable
		int empHrs = 0;
		int empWage = 0;

		/*
		 * Using Random function taking input either 0 or 1 or 2. calculating wage
		 * accordingly
		 */
		int Emp_Check = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println("Random value for emp Attendence check is: " + Emp_Check);

		if (Emp_Check == IS_FULL_TIME) {
			System.out.println("Employee Present : Full Time");
			empHrs = 8;
		} else if ((Emp_Check == IS_PART_TIME)) {
			System.out.println("Employee is Present : Part Time");
			empHrs = 4;
		} else {
			System.out.println("Employee is Absent");
			empHrs = 0;
		}
		empWage = empHrs * EMP_WAGE_PER_HR;
		System.out.println("Employee Wage is : " + empWage);
	}
}