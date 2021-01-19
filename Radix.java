//Grade Marks
package quiz;
import java.util.*;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Below");
		num=sc.nextLine();
		if(num.matches("[01]+"))
		{
			System.out.println("Binary radix =2");
		}
		else if(num.matches("[0-7]+"))
		{
			System.out.println("Octal Radix=8");
		}
		else if(num.matches("[0-9A-F]+"))
		{
			System.out.println("Hexa Radix=16");
		}
		else if(num.matches("[0-9]+"))
		{
			System.out.println("Decimal Radix=10");
		}
		else
		{
			System.out.println("Not a Number");
		}
	}

}
