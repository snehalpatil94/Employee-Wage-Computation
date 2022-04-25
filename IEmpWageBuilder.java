package com.bridgelabz.employeewagecomp;

import java.util.ArrayList;

public interface IEmpWageBuilder {
	public static final ArrayList<CompanyEmpWage> companyWageArrayList = new ArrayList<CompanyEmpWage>();

	public void addComapanyEmpWage(String company, int empWagePerHr, int maxWorkingDays, int maxHrPerMonth);

	public int empWageCalculation(CompanyEmpWage companyEmpWage);

	public void displayEmpWage();
}