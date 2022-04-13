package com.bridgelabz.employeewagecomp;

import java.util.Scanner;

/**
 * Compute Employee Wage for multiple companies
 * 
 * @author : Snehal Patil
 *
 */
public class EmployeeWageComputation {
	// Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	/*
	 * Method takes required information from company. Using Random function taking
	 * input either 0 or 1 or 2. Use of Switch cases. Print employee salary sheet
	 */
	public static void computeEmployeeWage() {
		// local variables
		int emp_Wage_Per_Hr;
		int max_Working_Days;
		int maxHr_In_Month;
		String company;
		int flag = 0;

		while (flag == 0) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the name of company : ");
			company = sc.next();
			System.out.print("Company's employee wage per hour : ");
			emp_Wage_Per_Hr = sc.nextInt();
			System.out.print("Compony's maximum working days in a month : ");
			max_Working_Days = sc.nextInt();
			System.out.print("Company's maximum working hours in a month : ");
			maxHr_In_Month = sc.nextInt();

			// Variable
			int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0, countFullTime = 0, countPartTime = 0,
					countAbsent = 0;

			while ((totalEmpHrs <= maxHr_In_Month) && (totalWorkingDays <= max_Working_Days)) {
				totalWorkingDays++;
				int Emp_Check = (int) Math.floor(Math.random() * 10) % 3;

				switch (Emp_Check) {
				case IS_FULL_TIME:
					empHrs = 8;
					countFullTime++;
					break;

				case IS_PART_TIME:
					empHrs = 4;
					countPartTime++;
					break;

				default:
					countAbsent++;
					empHrs = 0;
				}
				totalEmpHrs += empHrs;
			}
			// Calculating Monthly wage
			int totalMonthlyWage = totalEmpHrs * emp_Wage_Per_Hr;
			System.out.println();
			System.out.println("Days Employee was present full time : " + countFullTime);
			System.out.println("Days Employee was present half time : " + countPartTime);
			System.out.println("Days Employee was absent : " + countAbsent);
			System.out.println();
			System.out.println("Employee worked " + totalEmpHrs + " Hrs in " + totalWorkingDays + " days.");
			System.out.println();
			System.out.println("Monthly Wage of employee in " + company + " : Rs. " + totalMonthlyWage);
			System.out.println();

			// To take user choice to Continue or stop
			System.out.println("If you want to contiue ENTER 0 and if you want stop ENTER 1");
			flag = sc.nextInt();
			if (flag == 0) {
				continue;
			} else
				break;
		}
	}

	public static void main(String[] args) {

		computeEmployeeWage();
	}
}