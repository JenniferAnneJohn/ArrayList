package arraylistprgms;


import java.util.ArrayList;
import java.util.Scanner;

public class SumAverage {
ArrayList <Integer>number=new ArrayList<Integer>();
int n,sum;
public void getInput()
{
	System.out.println("****** SUM & AVERAGE ******");
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number of inputs: ");
	 n=scan.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		number.add(num);
		
	}
}
public void sum()
{
	sum=0;
	for(int i=0;i<n;i++)
	{
		sum=sum+number.get(i);
	}
	System.out.println("OUTPUT: ");
	System.out.println("The sum value is: "+sum);
}
public void average()
{
	int avg;
	avg=sum/n;
	System.out.println("The average is: "+avg);
}
}

