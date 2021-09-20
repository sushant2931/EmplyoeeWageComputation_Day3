package com.bridegelabz.emplyoeewagecomputation;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("......Welcome On Employee Wage Computation Program.....");
        int empPresesent = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == empPresesent){
            System.out.println("Employee is Present");
        }
        else
            System.out.println("Employee is Absent");
    }
}
