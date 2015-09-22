class MyLinkedList implements MyList {
	private Node pointerNode;
	private int size;
	
	public MyLinkedList() {
		this.pointerNode = null;
		this.size = 0;
	}
	
	public void add(Object element){
		// new node -> first node
		// pointerNode -> new node (new node become a first node) 
		this.pointerNode = new Node(element,this.pointerNode);
		++size;
	}
	
	public int size(){
		return this.size;
	}
	
	public boolean contains(Object element){
		return true;
	}
	
	public void remove(Object element){
		
	}

}
