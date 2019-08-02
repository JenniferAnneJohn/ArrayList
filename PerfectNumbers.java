package arraylistprgms;
import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumbers {

ArrayList sum=new ArrayList();
ArrayList perfect=new ArrayList();

public ArrayList perfectNum(ArrayList numbers,int n)
{
	
	for(int i=0;i<(int)numbers.size();i++)
	{
		int a=0;
		for(int j=1;j<(int)numbers.get(i);j++)
		{
			if((int)numbers.get(i)%j==0)
			{
				int factors=j;
				 a=a+factors;
			}
		}
		sum.add(a);
	}
	System.out.println("SUM IS:"+sum);
	
		for(int i=0;i<sum.size();i++)
		{			
		if((int)numbers.get(i)==(int)sum.get(i))
		{
			perfect.add((int)numbers.get(i)+" is a perfect number");
			//System.out.println(numbers.get(i)+" is a perfect number");
		}
		else
		{
			perfect.add(numbers.get(i)+" is not a perfect number");
			//System.out.println(numbers.get(i)+" is not a perfect number");
		}		
		}
		return perfect;		
}
}

