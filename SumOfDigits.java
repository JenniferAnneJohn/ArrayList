package arraylistprgms;
import java.util.ArrayList;
import java.util.Scanner;

	public class SumOfDigits {
	
	ArrayList sum=new ArrayList();
	ArrayList sum1=new ArrayList();
	ArrayList total=new ArrayList();
	
	public void sumOfDigits(ArrayList numbers)
	{
		for(int i=0;i<numbers.size();i++)
		{
			int s1;
			int remainder=0,s=0;
			int num=(int)numbers.get(i);
			
			while(num>0)
			{
				remainder=num%10;
				s=s+remainder;
				num=num/10;
			}
					
			s1=0;
			if(s>9)
			{
				while(s>0)
				{
				int rem=s%10;
				s1=s1+rem;
				s=s/10;
				}
			}
			sum.add(s);
			sum1.add(s1);
		}
			for(int i=0;i<sum.size();i++)
			{
				if((int)sum.get(i)!=0)//||(int)sum1.get(i)!=0 ) 
				{
				total.add(sum.get(i));
				}
				if((int)sum1.get(i)!=0)
				{
					total.add(sum1.get(i));	
				}
			}
		
		System.out.println("************ OUTPUT ************");
		System.out.println("INPUT: "+numbers);
		//System.out.println("The Sum of the digits is :"+sum);
		//System.out.println("The Sum of the digits is1 :"+sum1);
		System.out.println("The Sum of the digits is :"+total);
	}
	}


