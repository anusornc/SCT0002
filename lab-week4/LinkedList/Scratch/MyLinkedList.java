class Node {
	Object data;
	Node nextNode;
	
	public Node(Object item,Node next){
		this.data = item;
		this.nextNode = next;
	}
}

public class MyLinkedList implements MyList {
	private int size;			// numbers of Node in this class
	private Node pointerNode; 	// pointer to Node in this class
	
	public MyLinkedList(){
		this.size = 0;
		this.pointerNode = null;
	}
	
	public void add(Object element) {
		/*
			pointer -> new Node
		*/
		this.pointerNode = new Node(element,this.pointerNode);
		++size;
	}
	public void remove(Object element) {}
	
	public int size() {
		return this.size;
	}
	
	public boolean contains(Object element){
		return false;
	}
	
	public boolean isEmpty(){
		return this.size == 0;
	}
}
