public class MyArrayStack implements Stack {
	private Object[] elementData = new Object[1];
	private int size = 0;
	
	//(new-item :item-type) เพิ่มข้อมูลลงใน Stack
	public void push(Object item){
		if (this.size == elementData.length) {
			Object[] newArray = new Object[2 * elementData.length];
			for(int i=0; i < elementData.length ; i++) {
				newArray[i] = elementData[i];
			}
			elementData = newArray;
		}
		elementData[size++] = item;
	}
	
	//():item-type แสดงรายการที่อยู่บนสุดของ Stack
	public Object top(){
		if (!isEmpty()) {
			return elementData[size-1];
		}
		return null;
	} 			
	
	//() ลบข้อมูลรายการที่อยู่บนสุดของ Stack
	public Object pop(){
		Object peek = top();
		elementData[--size] = null; // ลบ Stack ตัวบนสุด
		return peek;
	} 		
	
	//():Boolean เป็นค่าจริงเมื่อไม่มีข้อมูลใน Stack		
	public boolean isEmpty() {
		return this.size == 0;
	}		
	
	//():Integer แสดงจำนวนข้อมูลใน Stack
	public int getSize() {
		return this.size;
	}			
}
