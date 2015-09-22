public class TestQueueLinkedList {
	public static void main(String[] args) {
	
		Queue<String> q = new QueueLinkedList<>();
		
		// การใช้ method chaining (ลูกโซ่) เพื่อนำข้อมูลเข้าสู่แถวคอย
		q.enqueue("hello").enqueue(" World");
		
		// การใช้ method แบบธรรมดา เพื่อนำข้อมูลเข้าสู่แถวคอย
		q.enqueue(" Data ");
		q.enqueue(" Structure");
		
		System.out.println(q);
		
		// การใช้ method แบบธรรมดา เพื่อนำข้อมูลออกจากแถวคอย
		System.out.println("นำข้อมูล " +	q.dequeue() + " ออกจากแถวคอย");
		
		System.out.println(q);
	}
}
