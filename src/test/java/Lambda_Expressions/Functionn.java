package Lambda_Expressions;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
class Employe
{
	String name;
	int salary;
	
	Employe(String name, int sal)
	{
		this.name = name;
		this.salary=sal;
		
	}
}
public class Functionn {

	public static void main(String[] args) {
		
		//Example 1: Find the square of a number
		
		
		// Example 2: Find the length of the string
		
		
		// Example 3: Convert a string to uppercase
		
		
		// Example 4: Find the length of the string and return it as a string
		
		
		//Employee emp = new Employee();
		
		Function<Employe, Integer> f4 = e -> {
			int sal = e.salary;
			if(sal>10000 && sal<=20000)
				return sal*10/100;
			if(sal>20000 && sal<=30000)
				return sal*20/100;
			if(sal>30000 && sal<=40000)
				return sal*30/100;
			else return sal*40/100;
		};
		
		//return emp details if bonus is >5000
	}

}
