package Lambda_Expressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
class Employee
{
	String ename;
	int salary;
	int exp;
	
	Employee(String ename, int salary, int exp)
	{
		this.ename=ename;
		this.salary=salary;
		this.exp=exp;
		
	}
}
public class Predicatee {

	public static void main(String[] args) {
		
		// Example 1: Check if a number is greater than 10 or not
		
		
		// Example 2: Check the length of the string is greater than 4 or not
		
		
		
		// Example 3: Print array elements whose size is greater than 4
		
		int arr[] = {5,10,15,20,25,30,35,40,45,50,55,60};
		
		Predicate<Integer> p1 = i -> i%2==0; // Check if number is even
		
		Predicate<Integer> p2 = i -> i>40; // check if num is >40
		
		
		
		
		
	}

}
