	package arraylistprgms;
	import java.util.ArrayList;
	import java.util.Iterator;

	public class OddEven {

		ArrayList numbers=new ArrayList();
		ArrayList even=new ArrayList();
		ArrayList odd=new ArrayList();
		
		
		public void getInput()
		{
			numbers.add(10);
			numbers.add(21);
			numbers.add(30);
			numbers.add(43);
			numbers.add(50);
			
		}
		
		public void even()
		{
			
			for(int i=0;i<numbers.size();i++)
			{
				if((int)numbers.get(i)%2==0)
				{
					even.add(numbers.get(i));
				}
				else
				{
					odd.add(numbers.get(i));
				}
		}
			
		}

		
		public void display()
		{
			System.out.println("OUTPUT:");
			System.out.println("Input :");
			System.out.println(numbers);
			System.out.println("Even numbers :");
			System.out.println(even);
			System.out.println("Odd numbers :");
			System.out.println(odd);
			
		}
	}

