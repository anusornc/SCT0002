class Node {
	Object data;	// เก็บข้อมูล Object
	Node next;		// เอาไว้ชี้หรือเชื่อมโยงโหนดถัดไป
	
	// Constructor (ข้อมูลที่จะจัดเก็บไว้ในโหนด , ตำแหน่งของโหนดถัดไป)
	Node(Object item,Node next) { 
		this.data = item; 
		this.next = next; 
	} 

}
