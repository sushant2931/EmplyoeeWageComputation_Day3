package com.bridegelabz.emplyoeewagecomputation;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("......Welcome On Employee Wage Computation Program.....");
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_WAGE_PER_HOUR = 20;

        int empHrs, empWage;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if(empCheck == IS_FULL_TIME)
            empHrs = 8;
        else if (empCheck == IS_PART_TIME)
            empHrs = 4;
        else
            empHrs = 0;

        empWage = empHrs * EMP_WAGE_PER_HOUR;
        System.out.println("Emp Hours : "+empHrs);
        System.out.println("Emp Wage : "+empWage);
    }
}
