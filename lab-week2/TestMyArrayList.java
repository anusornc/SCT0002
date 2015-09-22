public class TestMyArrayList {
	public static void main(String[] args) {
		MyList c = new MyArrayList(5);
		System.out.println(" CHECK EMPTY LIST " + c.isEmpty());
		c.add("BANGKOK");
		c.add("PHUKET");
		c.add("BANGKOK");
		System.out.println("List size =" + c.size());

		System.out.println("c = " + c);
		System.out.println(" REMOVE PHUKET ");
		c.remove("PHUKET");
		System.out.println("c = " + c);
		System.out.println(c.contains("PHUKET"));
		System.out.println(c.contains("BANGKOK"));
	}
}
