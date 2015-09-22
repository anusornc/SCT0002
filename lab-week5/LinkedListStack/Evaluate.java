import java.util.*;

public class Evaluate
{
	public static void main(String[] args)
	{
		Stack ops = new MyArrayStack();
		Stack vals = new MyArrayStack();
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		for
		if (s.equals("("))			;
		else if (s.equals("+"))	ops.push(s);
		else if (s.equals("-"))	ops.push(s);
		else if (s.equals("*"))	ops.push(s);
		else if (s.equals("/"))	ops.push(s);
		else if (s.equals("sqrt")) ops.push(s);
		else if (s.equals(")")) { // Pop, evaluate, and push result if token is ")".
			String op = ops.pop().toString();
			double v = (Double)(vals.pop());
			if (op.equals("+"))	v = (Double)vals.pop() + v;
			else if (op.equals("-"))	v = (Double)vals.pop() - v;
			else if (op.equals("*"))	v = (Double)vals.pop() * v;
			else if (op.equals("/"))	v = (Double)vals.pop() / v;
			else if (op.equals("sqrt")) v = Math.sqrt(v);
			vals.push(v);
		} // Token not operator or paren: push double value.
		else vals.push(Double.parseDouble(s));
	
		System.out.println(vals.pop());
	}
}
