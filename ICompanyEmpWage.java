package com.bridgelabz.employeewagecomp;

public interface ICompanyEmpWage {
	public void addComapanyEmpWage(String company, int empWagePerHr, int maxWorkingDays, int maxHrPerMonth);
	public void empWageCalculation();
}