package com.bridgelabz.employeewagecomp;

/**
 * Program to Calculate Employee Daily Wage.
 * 
 * @author : Snehal Patil
 *
 */
public class EmployeeWageComputation {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation !");

		// Constants
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HR = 20;
		// Variables
		int empHrs = 0;
		int empWage = 0;

		/*
		 * Using Random function taking input either 0 or 1.calculating Daily wage
		 * accordingly
		 */
		int Emp_Check = (int) (Math.floor(Math.random() * 10) % 2);
		System.out.println("Random value for emp Attendence check is: " + Emp_Check);

		if (Emp_Check == IS_FULL_TIME) {
			System.out.println("Employee is present.");
			empHrs = 8;
		} else {
			System.out.println("Employee is Absent.");
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HR;
		System.out.println("Employee Wage is : " + empWage);
	}
}