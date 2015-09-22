public class Car {
	public String color;
	public int wheel;
	
	public void forward() {
		System.out.println("forward");
	}
	
	public void backward() {
		System.out.println("backward");
	}
	
	public static void main(String[] args) {
		Car toyota = new Car();
		toyota.color="WHITE";
		toyota.wheel=4;
		
		Car isuzu = new Car();
		isuzu.color = "BLACK";
		isuzu.wheel = 10;
		
		System.out.println("TOYOTA COLOR = " + toyota.color);
		System.out.println("ISUZU COLOR=" + isuzu.color);
		
		toyota.forward();
	}
	
}
