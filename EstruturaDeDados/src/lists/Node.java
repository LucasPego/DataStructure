package lists;

public class Node<T> {
	Node <T> previous;
	T data;
	Node<T> next;
	
	public Node (T data) {
		this.data = data;
	}
}
