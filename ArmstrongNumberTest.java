package arraylistprgms;
import java.util.LinkedList;
import java.util.Scanner;

public class ArmstrongNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumber obj=new ArmstrongNumber();
		LinkedList numbers=new LinkedList();
		Scanner scan=new Scanner(System.in);
		System.out.println("****** AMSTRONG NUMBERS *******");		
		System.out.println("Enter the number of inputs: ");
		int n=scan.nextInt();		
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter a number"+(i+1)+":");
		int num=scan.nextInt();
		numbers.add(num);
		}
		System.out.println("INPUT:"+numbers);		
		obj.logic(numbers);
		obj.armNum(numbers);
	}

}
