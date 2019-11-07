package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.excercise33empleado.model.Employee;

class employeeTest {

	@Test
	void testCalculateBrute() 
	{
		//fail("Not yet implemented");
		Employee myEmployee= new Employee();
		//System.out.println("Brute salary: " +myEmployee.calculateBrute(salesEmployee, 0, 0));
		
		double actualValue=myEmployee.calculateBrute("salesEmployee", 0, 0);
		double expectedValue=1000;
		assertEquals(expectedValue,actualValue);
		
	}

}
