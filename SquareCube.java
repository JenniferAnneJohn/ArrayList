
	package arraylistprgms;

	import java.util.ArrayList;

	public class SquareCube {

		ArrayList<Integer> numbers=new ArrayList<Integer>();
		ArrayList cube=new ArrayList();
		ArrayList square=new ArrayList();
		
		
		public void getInput()
		{
			numbers.add(10);
			numbers.add(20);
			numbers.add(30);
			numbers.add(40);
			numbers.add(50);
						
	//System.out.println("Elements inside numbers:"+numbers);
		}
		public void square()
		{
			
			for(int i=0;i<5;i++)
			{
			square.add(numbers.get(i) * numbers.get(i));
			}
		}
		public void cube()
		{
			
			for(int i=0;i<5;i++)
			{
				cube.add(numbers.get(i) * numbers.get(i) * numbers.get(i));
			}
		}
		public void display()
		{
			System.out.println("******** SQUARE AND CUBE VALUES ********");
			System.out.println("Input"+"\t"+"Square"+"\t"+" Cube");
			for(int i=0;i<numbers.size();i++)
			{
			System.out.println(numbers.get(i)+"\t "+square.get(i)+"\t "+cube.get(i));
			}
		}
	}


