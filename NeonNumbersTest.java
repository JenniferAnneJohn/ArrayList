package arraylistprgms;
import java.util.ArrayList;
import java.util.Scanner;

public class NeonNumbersTest {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	NeonNumbers nn=new  NeonNumbers();
			 
	ArrayList numbers=new ArrayList();			 
	Scanner scan=new Scanner(System.in);
	System.out.println("^^^^^^^ NEON NUMBERS ^^^^^^^");
	System.out.println("Enter the number of inputs :");
	int n=scan.nextInt();
			
	for(int i=0;i<n;i++)
	{
	System.out.println("Enter number"+(i+1)+" :");
	int input=scan.nextInt();
	numbers.add(input);
	}
	System.out.println("INPUT: "+numbers);
	//nn.findNum(numbers);
	ArrayList output=nn.findNum(numbers);
	for(int i=0;i<output.size();i++){
	System.out.println(output.get(i));
	}
	}
	}



