package arraylistprgms;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfDigitsTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigits sod=new SumOfDigits();
		ArrayList numbers=new ArrayList();
		System.out.println("********* SUM OF DIGITS ***********");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of inputs:");
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter number "+(i+1)+":");
			int input=scan.nextInt();
			numbers.add(input);
		}		
		sod.sumOfDigits(numbers);
}
}
