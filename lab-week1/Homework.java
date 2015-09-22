public class Homework {

	public static void main(String[] args) {
	
		System.out.println("1. =" + (0 + 15) /2);
		System.out.println("2. =" + (2.0e-6 * 100000000.1));
		System.out.println("3. =" + (true && false || true && true));
		System.out.println(1 + 2 + "3");
		
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++)
		{
		   System.out.println(f);
		   f = f + g;
		   g = f - g;
		}
		
		double t = 9.0;
		while (Math.abs(t - 9.0/t) > .001)
			t = (9.0/t + t) / 2.0;
		System.out.println("%.5f\n",t);
	}
}
