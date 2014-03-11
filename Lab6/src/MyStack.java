/**
 * 
 * @author glavin
 *
 * @param <T>
 */
public class MyStack<T> 
{

	private Node first;

	/**
	 * Constructor
	 */
	public MyStack() 
	{
		first = null;
	}
	
	/**
	 * 
	 * @param val
	 */
	public void push(T val)
	{
		Node<T> node = new Node<T>(val);
		node.nextNode = first;
		first = node;
	}
	
	/**
	 * 
	 * @return
	 */
	public T pop()
	{
		Node<T> temp = first;
		first = first.nextNode;
		return temp.val;
	}
	
    //Returns true if list is empty
    public boolean isEmpty() {
	    return first == null;
    }
    
	/**
	 * 
	 */
	public String toString()
	{
		/*
		Link currentLink = first;
	    System.out.print("List: ");
	    while(currentLink != null) {
		    currentLink.printLink();
		    currentLink = currentLink.nextLink;
	    }
	    System.out.println("");
	    */
		return first.val.toString();
	}
	
}


