package arraylistprgms;
import java.util.ArrayList;

public class NeonNumbers {
ArrayList sqre=new ArrayList();
ArrayList sum=new ArrayList();
ArrayList neon=new ArrayList();
int sqreval;

	public ArrayList findNum(ArrayList numbers)
	{
 	for(int i=0;i<numbers.size();i++)
		{
		sqreval=(int)numbers.get(i)* (int) numbers.get(i);
		sqre.add(sqreval);
		}
		System.out.println("Square value is: "+sqre);
			
		for(int i=0;i<sqre.size();i++)
		{
			int val=(int)sqre.get(i);
			int s=0;
			while(val>0)
			{
			int rem=val%10;
			s=s+rem;
			val=val/10;
			}
			sum.add(s);
			
		}
		System.out.println("Sum of the square numbers is: "+sum);
			
		for(int i=0;i<numbers.size();i++)
		{
		if((int)numbers.get(i)==(int)sum.get(i))
		{
		neon.add((numbers.get(i)+" is a Neon number"));
		//System.out.println(numbers.get(i)+" is a Neon number");	
		}
		else
		{
		neon.add((numbers.get(i)+" is not a Neon number"));
		//System.out.println(numbers.get(i)+" is not a Neon number");		
		}
		}
		return neon;
	}		
	}


