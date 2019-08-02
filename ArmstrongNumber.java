package arraylistprgms;
import java.util.LinkedList;
import java.util.Scanner;

public class ArmstrongNumber {
	
	LinkedList count=new LinkedList();
	LinkedList power=new LinkedList();
			
	public void logic(LinkedList numbers)
	{
		
		for(int i=0;i<numbers.size();i++)
		{			
		int a=(int)numbers.get(i);
		int c=0;
		while(a>0)
		{
			int rem=a%10;//3 5 1
			a=a/10;//15 1 0
			c++;// 1
		}		
		count.add(c);
		}
		//System.out.println("The number of digits in the number is:"+count);
		for(int i=0;i<numbers.size();i++)
		{
			int s=0,am = 0;
			int b=(int)numbers.get(i);//153
			int v=count.size();
			for(int j=0;j<v;j++)	
			{
				int p=(int) count.get(i);
				while(b>0)
				{
				int rem=b%10; //3 5 1
				b=b/10;//15 1 0				
				s=(int) Math.pow(rem,p);
				 am=am+s;
				}
			}
				power.add(am);
		}
		System.out.println("SUM OF THE POWER VALUES:"+power);	
	}	

	public void armNum(LinkedList numbers)
	{
		for(int i=0;i<numbers.size();i++)
		{
		if((int)power.get(i)==(int)numbers.get(i))
		{
			System.out.println(numbers.get(i)+" is an Armstrong Number");
		}else{
			System.out.println(numbers.get(i)+" is not an Armstrong Number");
		}
	}
}
}
	


	

		