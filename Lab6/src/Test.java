import java.util.ArrayList;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Test 1:");
		
		MyStack s1 = new MyStack<String>();
		
		s1.push("test1");
		s1.push("test2");
		s1.push("test3");
		while (!s1.isEmpty())
		{
			System.out.println("Top:"+ s1);
			String tmp = (String) s1.pop();
			System.out.println("Popped: "+ tmp);				
		}
		
		System.out.println();
		System.out.println("Test 2:");
		
		MyStack s2 = new MyStack<ArrayList<String>>();
		
		for (int i=0; i<10; i++)
		{
			ArrayList<String> a = new ArrayList<String>();
			for (int j=0; j<i; j++)
			{
				a.add(i+":"+j);
			}
			s2.push(a);
		}		
		
		while (!s2.isEmpty())
		{
			System.out.println("Top:"+ s2);
			ArrayList<String> tmp = (ArrayList<String>) s2.pop();
			System.out.println("Popped: "+ tmp);				
		}
		
		
	}

}
