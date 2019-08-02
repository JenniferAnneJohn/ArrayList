package arraylistprgms;
import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumbersTest {

	public static void main(String[] args) {
		
		PerfectNumbers pn=new PerfectNumbers();
		
			Scanner scan=new Scanner(System.in);
			System.out.println("****** PERFECT NUMBERS *******");
			ArrayList numbers=new ArrayList();
			System.out.println("Enter the number of inputs: ");
			int n=scan.nextInt();
			for(int i=0;i<n;i++)
			{
			System.out.println("Enter a number"+(i+1)+":");
			int num=scan.nextInt();
			numbers.add(num);
			}
		System.out.println("INPUT:"+numbers);
		ArrayList result=pn.perfectNum(numbers,n);
		System.out.println("OUTPUT:");
		for(int i=0;i<result.size();i++)
		{
		System.out.println(result.get(i));
		}
	}
}
