public class TestMyLinkedList {
	public static void main(String[] args) {
		MyList c = new MyLinkedList();
		System.out.println(" CHECK EMPTY LIST " + c.isEmpty());
		c.add("BANGKOK");
		c.add("PHUKET");
		c.add("BANGKOK");
		c.add(1);
		System.out.println("List size =" + c.size());

		System.out.println("c = " + c);
		System.out.println(" REMOVE PHUKET ");
		c.remove("PHUKET");
		System.out.println("c = " + c);
		System.out.println(c.contains("PHUKET"));
		System.out.println(c.contains("BANGKOK"));
	}
}
