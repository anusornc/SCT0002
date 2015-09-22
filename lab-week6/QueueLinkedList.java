/*
	Class : QueueLinkedList
*/

public class QueueLinkedList<T> implements Queue<T> {

    private int total;			// จำนวนข้อมูลในแถวคอย

    private Node first, last;	// กำหนดตัวชี้ Node first กับ last (head , tail)

	/*
		Internal Class Node
		อาจสร้างเป็น External ก็ได้
	*/
    private class Node {
        private T ele;		// ที่เก็บข้อมูล
        private Node next; 	// ตัวชี้ Node ถัดไป;
    }

	// Contructor ที่ไม่มี parameter
    public QueueLinkedList() { }


	/*
		เมธอด การนำข้อมูลเข้าสู่แถวคอย
		Parameter : ele (ข้อมูลที่จะนำเข้าแถวคอย)
	*/
    public QueueLinkedList<T> enqueue(T ele)
    {
        Node current = last;	// กำหนดตัวแปร current Node ให้มีค่าเท่ากับ last Node
        last = new Node();		// กำหนดให้ last Node ชี้ไปยัง Node ใหม่ที่สร้าง
        last.ele = ele;			// นำเข้ามูลเข้าไปจัดเก็บยัง Node ใหม่

        if (total++ == 0) first = last;	// ถ้าหากจำนวนข้อมูลในแถวคอยมีค่าเป็น 0 ให้ตัวชี้ Node first มีค่าเท่ากับ Node last
        else current.next = last; // ถ้าหากจำนวนข้อมูลในแถวคอยมีค่าไม่เท่ากับ 0 ให้ตัวชี้ Node ปัจจุบันมีค่าเท่ากับ Node last

        return this;	// คืนค่า Class นี้กลับออกไปยังผู้เรียก
    }

	/*
		เมธอด สำหรับการนำข้อมูลออกจากแถวคอย
	*/
    public T dequeue()
    {
    	// ถ้าหากจำนวนข้อมูลในแถวคอย มีขนาดเท่ากับ 0 ให้แสดงข้อผิดพลาด (ไม่ต้องลบเพราะไม่มีอะไรให้ลบ)
        if (total == 0) throw new java.util.NoSuchElementException();
        
        // กำหนดให้ข้อมูล ele เก็บข้อมูลที่จะนำออกจากแถวคอย (First In First Out ) คือตัวแรกที่นำเข้ามาใน Linked List 
        T ele = first.ele;
        
        // กำหนดให้ first ชี้ไปยัง Node ที่ติดกันเพื่อกำหนดให้เป็นตัวแรกที่จะนำออกจากแถวคอยในครั้งถัดไป
        first = first.next;
        
        // ทำการลดขนาดของจำนวนในแถวคอยแล้วตรวจสอบว่าจำนวนข้อมูลในแถวคอยเท่ากับ 0 หรือไม่ ถ้าใช่ให้ last=null 
        if (--total == 0) last = null;
        
        // คือค่าชนิดข้อมูลที่เก็บเอาไว้ก่อนลบออกจากแถวคอยกลับออกไป
        return ele;
    }

	/*
		เมธอดแสดงข้อมูลในแถวคอย
	*/
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node tmp = first;
        while (tmp != null) {
            sb.append(tmp.ele).append(", ");
            tmp = tmp.next;
        }
        return sb.toString();
    }

}
