package com.excercise33empleado.model;

public class Employee {
	
	private enum EmployeeTypes
	{
		salesEmployee,
		salesManager
	}
	
	public double calculateBrute(String employeeType,double salesPerMonth,int extraHours)
	{
		double bruteSalary=0, salarySales=0,salaryHours=0;
		final double SALARY_EMPLOYE=1000.0;
		final double SALARY_MANAGER=1500.0;
		final double SALES_FIRST_BONUS_LIMIT=1000.0;
		final double FIRST_BONUS=100.0;
		final double SALES_SECOND_BONUS_LIMIT=1500.0;
		final double SECOND_BONUS=200.0;
		final double EXTRA_HOURS_PLAYMENT=20.0;
		
		if(salesPerMonth >= SALES_FIRST_BONUS_LIMIT && salesPerMonth < SALES_SECOND_BONUS_LIMIT)
		{
			salarySales=100.0;
		}
		else if(salesPerMonth>=SALES_SECOND_BONUS_LIMIT)
		{
			salarySales=200;
		}
		
		
		return bruteSalary = (employeeType.equals(EmployeeTypes.salesEmployee.toString()))
				? SALARY_EMPLOYE + salarySales + salaryHours
				: SALARY_MANAGER + salarySales + salaryHours;
		
		
		/*other way
		double bruteSalary=0, salarySales=0, salaryHours=0;
		
		salarySales = (salesPerMonth >= 1000 && salesPerMonth < 1500) ? 100.0 : 200.0;
		salaryHours = extraHours * 20.0;

		return bruteSalary = (employeeType.equals("SalesEmployee")) ? 1000.0 + salarySales + salaryHours
				: 1500.0 + salarySales + salaryHours;
		*/
		
		/*other way
		if(employeeType.equals("salesEmployee"))
		{
			bruteSalary=1000.0;
		}
		else if(employeeType.equals("salesManagement"))
		{
			bruteSalary=1500.0;
		}
		*/
		
		
		
	}

}
