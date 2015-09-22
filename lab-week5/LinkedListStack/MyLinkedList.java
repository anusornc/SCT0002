class MyLinkedList implements MyList {
	private Node pointerNode;				// ตัวชี้โหนดของ Class
	private int  size;						// จำนวนโหนดที่มีใน Class

	// Constructor (เป็นเมธอดแรกที่จะทำงานทันทีหลังจาก Class ถูกสร้าง)
	public MyLinkedList(){
		this.pointerNode = null;			// กำหนดให้ ตัวชี้โหนด เก็บค่า null
		this.size = 0;						// กำหนดให้จำนวนโหนดเริ่มต้นเป็น 0
	}	

	// เมธอดเพิ่มข้อมูลใน Linked List
	//     class MyLinkedList       class Node
	// { size | pointerNode } ---> [Data | next]
	// 
	public void add(Object element){
		// ให้ Pointer ของ Class ชี้ไปยังโหนดใหม่ที่สร้าง
		// โดยโหนดใหม่ที่สร้างนั้นได้ชี้ไปยังโหนดที่ Pointer เคยชี้ (คือการแทรกข้อมูล)
		this.pointerNode = new Node(element, this.pointerNode); 
		++size;								// เพิ่มตัวนับจำนวนโหนด
	}
	
	// เมธอดลบข้อมูลออกจาก Linked List
	// รับข้อมูลที่ต้องการจะลบแล้วนำไปค้นหาใน Linked List เมื่อพบแล้วจะทำการลบออกจาก Liked List
	public void remove(Object element) {
		
		if (this.pointerNode == null) return;			// ถ้าตัวชี้โหนดเป็นค่าว่างจะไม่ลบ (เพราะไม่มีข้อมูลจะลบอยู่แล้ว)
		
		if (this.pointerNode.data.equals(element)) {	// ถ้าหากว่าโหนดแรกมีข้อมูลตรงกับข้อมูลที่จะลบ
			this.pointerNode = this.pointerNode.next; 	// กำหนดให้ตัวชี้โหนดชี้ไปยังโหนดถัดจากโหนดแรก (เพื่อลบโหนดแรกออกจาก การ Linked)
			--size; 									// ลดจำนวนตัวนับโหนดลง 1 ตัว
		} 
		else {								// ถ้าหากข้อมูลที่ตรวจสอบไม่ใช่โหนดแรก
			Node p = this.pointerNode;		// เริ่มค้นหาภายใน Linked List แบบ Sequential เริ่มที่โหนดแรกก่อน
			while( p.next != null && ! p.next.data.equals(element)) { // ทำการค้นหาไปเรื่อยจนกว่าจะเจอหรือไม่มีโหนดที่จะ Linked ต่อ (next == null)
				p = p.next;				// เลื่อนไปทีละโหนดใน Linked List
			}

			// skip linked delete node a->b->c ===> a->c , if node b want delete
			if (p.next != null) {		// ถ้าโหนดปัจจุบันไม่ใช่ค่า Null
				p.next = p.next.next; 	// ให้โหนดปัจจุบันชี้ ข้ามไปยังโหนดที่อยู่ติดกับโหนดที่ต้องการลบ
				--size;					// ลดจำนวนตัวนับโหนดลง 1 ตัว
			}
		}
	}
	
	/*
		เมธอดสำหรับตรวจสอบว่า Linked List มีข้อมูลหรือไม่
	*/
	public boolean isEmpty() {
		return this.size == 0;
	}

	/*
		เมธอดสำหรับตรวจสอบว่า มีข้อมูลที่ต้องการตรวจสอบอยู่ใน Linked List หรือไม่
	*/
	public boolean contains(Object element){
		Node node = this.pointerNode;			// ตั้งต้นที่โหนดที่ตัวชี้กำลังชี้อยู่ปัจจุบัน (โหนดแรก)
		while( node != null ) {					// วนจนไม่มีโหนดจะค้นหา
			if (node.data.equals(element)) return true;	// ถ้าพบให้แสดงว่าพบจริง
			node = node.next;					// ขยับโหนดไปยังโหนดถัดไป
		}
		return false; 	// แสดงว่าไม่พบข้อมูล (หาจากด้านบนจนหมดแล้ว)
	}

	/*
		เมธอดสำหรับแสดงจำนวน โหนดใน Linked List
	*/
	public int size() {
		return this.size;		// จำนวนโหนดถูกเก็บไว้ในตัวแปร size อยู่แล้วดังนั้นจึงสามารถนำไปใช้ได้เลย
	}
	
	public String toString() {
		Node node = this.pointerNode;			// ตั้งต้นที่โหนดที่ตัวชี้กำลังชี้อยู่ปัจจุบัน (โหนดแรก)
		String s = "";
		while( node != null ) {					// วนจนไม่มีโหนดจะค้นหา
			s = s+ node.data.toString()+"\n";
			node = node.next;					// ขยับโหนดไปยังโหนดถัดไป
		}
		return s;
	}
}
