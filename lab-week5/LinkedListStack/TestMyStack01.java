import java.util.*;

public class TestMyStack01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String data="";
		while ( !data.equals("0")) {
			System.out.print("PLEASE INPUT MATH (0: TO EXIT):");
			data = input.nextLine();
		
			System.out.println("Checking math " + data + " Please wait");
			if (!checkSymbol(data) )
				System.out.println("มีวงเล็บ เปิด/ปิด ไม่ครบ");
			else
				System.out.println("มีวงเล็บ เปิด/ปิด ครบถ้วน");
		}
	}
	
	public static boolean checkSymbol(String input) {
		String openSymbol = "{([";
		String closeSymbol = "})]";
		Stack s = new MyArrayStack();
		
		// ให้วนในขณะที่ดัชนีมีค่าเท่ากับ 0 เรื่อยไปจนกว่าดัชนีจะมีค่าจำนวนมากกว่าจำนวนตัวอักษรที่รับเข้ามาจากแป้นพิมพ์
		for (int i = 0 ; i < input.length() ; i++) {		
			String c = input.substring(i,i+1);			// ตัดตัวอักษรตำแหน่ง (i,i+1) 1 ตัวอักษร
			if (openSymbol.indexOf(c) >= 0) {			// ตรวจสอบว่าใช่ตัวอักษรที่กำหนดไว้ใน openSymbol หรือไม่
				s.push(c);								// ถ้าใช่ push ลง stack
			} else {			
				// ถ้าไม่ใช่ตัวอักษรใน openSymbol ให้ตรวจสอบว่าเป็นตัวอักษรใน closeSymbol หรือไม่
				int k = closeSymbol.indexOf(c);	
				
				if (k >= 0) {	// ถ้าพบว่าเป็นตัวอักษรใน closeSymbol
					// ตรวจสอบต่อว่าสถานะ Stack ปัจจุบันว่างหรือ 
					// เมื่อดึงตำแหน่งตัวบนสุดของ Stack ออกมาแล้วมีค่าไม่ตรงกับตัวที่อยู่ใน ตำแหน่งเดียวกันกับ openSymbol
					// แสดงว่ามีตัวษรพิเศษค้างไว้ใน Stack ให้แสดงผลลัพธ์ว่าผิด ออกไปจาก เมธอด
					System.out.println("Top of stack = " + s.top());
					if ( s.isEmpty() || !s.pop().equals(openSymbol.substring(k,k+1))) {
						return false;
					}
				}
			
			}
		}
		// ถ้าตรวจสอบจากข้างบนพบว่าไม่ผิดเลย ให้ return ค่าสถานะของ Stack ออกไปจากเมธอด
		return s.isEmpty();
	}
	
}
