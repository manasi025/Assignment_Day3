package day3;

import java.util.Scanner;

public class EmployeeWage1 {
	private static boolean full_time = false;
	public static int wage_per_hr = 20;
	public static int full_day_hr = 8;
	public static int part_time_hr = full_day_hr/2;
	public static int day_of_month = 20;
	
	public static void  uc1() 
	{
		int a = (int) ((Math.random()) * 10) % 2;
		if(a == 1) 
		{
			System.out.println("Employee is Present!!");
		}
		else 
		{
			System.out.println("Employee is Absent!!");
		}
	}
	public static void uc2( boolean x) 
	{
		if (x) 
		{
			int employee_wage = (wage_per_hr * full_day_hr);
			System.out.println("The wage of a full time employee is = $ " + employee_wage);
		}
		else 
		{
			System.out.println("-");
		}
		
	}
	public static void uc3( boolean x) 
	{
		if (x) 
		{
			int employee_wage = (wage_per_hr * full_day_hr);
			System.out.println("The wage of a full-time employee is = $ "+ employee_wage);
		}
		else
		{
			int employee_wage = (wage_per_hr * part_time_hr);
			System.out.println("The wage of a part time employee is = $ "+ employee_wage);
		}
		
	}
	public static void uc4(boolean x) 
	{
		if (x) 
		{
			System.out.println();
			int employee_wage = (wage_per_hr * full_day_hr * day_of_month);
			System.out.println("The wage of a full-time employee for a month is = $ "+ employee_wage);
		}
		else 
		{
			int employee_wage = (wage_per_hr*part_time_hr * day_of_month);
			System.out.println("The wage of a part-time employee for a month is = $ "+ employee_wage);
		}
	}
	public static void uc5(boolean x)
	{
		if (x)
		{
			System.out.println();
			int employee_wage = (wage_per_hr * 100);
			System.out.println("Full time employee wage for a month i.e 100hrs is = $ "+ employee_wage);
		}
		else 
		{
			int employee_wage = (wage_per_hr * part_time_hr * day_of_month);
			System.out.println("Part time employee wage for a month is = $ "+ employee_wage);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println( "Employee Wage Calculator");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		System.out.println(" Enter 0 : for Part-time employee ");
		System.out.println(" Enter 1 : for Full-time employee ");
		byte x = sc.nextByte() ;
		if (x == 0) 
		{
			boolean full_time = false;
		}
		else if (x==1) 
		{
			boolean full_time = true;
		}
		else 
		{
			System.out.println("Invalid!!");
		}
		System.out.println(" 1: To check if Employee is Present or Absent");
		System.out.println(" 2: To calculate Full-time Wage of an employee");
		System.out.println(" 3: To calculate Full-time or Part-time Wage of an employee");
		System.out.println(" 4: To calculate wage of the employee for 1 month");
		System.out.println(" 5: To calculate wage of the employee for a month with some condition");
		byte key = sc.nextByte();
		
		switch (key) 
		{
			case 1 : 	uc1();	          
				break;
				
			case 2 : 	uc2(full_time);  
				break;
				
			case 3 :	uc3(full_time);  
				break;
				
			case 4 : 	uc4(full_time);  
				break;
				
			case 5 : 	uc5(full_time);  
				break;
				
			default:    System.out.println("Invalid option!!");
		}	
	}
}
