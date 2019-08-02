package arraylistprgms;
import java.util.ArrayList;
import java.util.Scanner;

	public class Palindrome {
	ArrayList <String>reverse=new ArrayList<String>();

	public void process(ArrayList<String> input)
	{
		for(int k=0;k<input.size();k++)
		{
			String test="";
			int l=input.get(k).length()-1;
			for(int i=l;i>=0;i--)
		{
		 test=test+input.get(k).charAt(i);
		}
		reverse.add(test);
		}		
		//System.out.println("Letters stored in the reverse order:"+reverse);
	}
	public void check(ArrayList<String> input)
	{
		for(int i=0;i<input.size();i++)
		{
		if(input.get(i).equals(reverse.get(i)))
		{
			System.out.println(input.get(i)+" is a palindrome");
		}
		else
		{
			System.out.println(input.get(i)+" is not a palindrome");
		}
		}
	}
	}

