package arraylistprgms;


	import java.util.ArrayList;
	import java.util.Scanner;

	public class PalindromeTest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Palindrome pal=new Palindrome();
			
			ArrayList<String> input=new ArrayList<String>();
			
			Scanner scan=new Scanner(System.in);
			System.out.println("****** STRING PALINDROME ******");
			System.out.println("Enter the number of inputs: ");
			int n=scan.nextInt();
			for(int i=0;i<n;i++)
			{
			System.out.println("Enter a word:"+(i+1)+" :");
			String s=scan.next();
			input.add(s);
			}
			System.out.println("****** PALINDROME ******");
			System.out.println("INPUT: "+input);
			//System.out.println("INPUT SIZE:"+input.size());
			
			pal.process(input);
			pal.check(input);
		}

	}


