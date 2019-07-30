package arraylistprgms;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class Factorial {
	ArrayList<Integer> number=new ArrayList<Integer>();
	ArrayList<Integer> factorial=new ArrayList<Integer>();
	int n;
	int fact;
	public void getInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("********** FACTORIAL VALUES **********");
		System.out.println("Enter number of inputs: ");
		n=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a number: ");
			int num=scan.nextInt();
			number.add(num);
		}
	}
	public void factorial()
	{
		
		for(int i=0;i<n;i++)
		{
			 fact=1;
			for(int j=1;j<=number.get(i);j++)
			{
			fact=fact*j;
			}
			factorial.add(fact);
			//System.out.println("FACTORIAL:"+fact);
			
		}
		//System.out.println("The values in factorial: "+factorial);
		
		System.out.println("The values in factorial arraylist: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(factorial.get(i));
		}

	}

	}


