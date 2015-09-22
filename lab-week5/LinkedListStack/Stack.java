public interface Stack {
	public void push(Object item); 	//(new-item :item-type) เพิ่มข้อมูลลงใน Stack
	public Object top(); 			//():item-type แสดงรายการที่อยู่บนสุดของ Stack
	public Object pop(); 			//() ดึงข้อมูลพร้อมลบข้อมูลรายการที่อยู่บนสุดของ Stack
	public boolean isEmpty(); 		//():Boolean เป็นค่าจริงเมื่อไม่มีข้อมูลใน Stack
	public int getSize(); 			//():Integer แสดงจำนวนข้อมูลใน Stack
}
