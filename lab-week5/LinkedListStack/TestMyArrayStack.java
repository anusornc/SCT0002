import java.util.*;

public class TestMyArrayStack {
	public static void main(String[] args) {
		Stack s = new MyArrayStack();
		Scanner input = new Scanner(System.in);
		System.out.print("INPUT STRING :");
		String word = input.nextLine();
		for(int i = 0 ; i < word.length() ; i++){
			s.push(word.substring(i,i+1));
		}
		int c = word.length();
		while (s.getSize()>0){
			System.out.print(s.pop());
		}
		System.out.println("");
	}
}
