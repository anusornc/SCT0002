public class Test {
	private int size;
	
	Test() {
		this.size = 0;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void setSize(int s) {
		this.size = s;
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.setSize(10);
		
		System.out.println("current Size = " + t.getSize());
	}
}
