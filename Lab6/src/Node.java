/**
 * 
 * @author glavin
 *
 * @param <T>
 */
public class Node<T> {
	T val;
	Node nextNode;
	
	/**
	 * 
	 * @param v
	 */
	public Node(T v) {
		nextNode = null;
		val = v;
	}
	
}
