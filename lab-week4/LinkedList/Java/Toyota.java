public class Toyota {
	
	public static void main(String[] args) {
	
		Car toyota = new Car();
		
		toyota.color = "RED";
		toyota.wheel = 4;
		
		toyota.forward();
		toyota.backward();
		
		System.out.println(toyota.color);
	
	}

}
