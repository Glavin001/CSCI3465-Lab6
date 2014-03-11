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
	 * Add the value to the top of the stack.
	 * @param val
	 */
	public void push(T val)
	{
		Node<T> node = new Node<T>(val);
		node.nextNode = first;
		first = node;
	}
	
	/**
	 * Returns the value popped off the top of the stack.
	 * @return The value popped off the top of the stack. Null if not available.
	 */
	public T pop()
	{
		Node<T> temp = first;
		if (temp == null)
		{
			return null;
		}
		first = first.nextNode;
		return temp.val;
	}
	
    /**
     * Returns true if list is empty
     * @return
     */
    public boolean isEmpty() {
	    return first == null;
    }
    
	/**
	 * 
	 */
	public String toString()
	{
		String str = "";
		int i = 0;
		Node c = first;
		while (c != null)
		{
			if (i>0)
			{
				str += ", ";
			}
			str += c.val.toString();
			i++;
			c = c.nextNode;
		}
		return "["+str+"]";
	}
	
}


