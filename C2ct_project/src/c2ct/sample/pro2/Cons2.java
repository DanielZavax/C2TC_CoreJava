package c2ct.sample.pro2;

public class Cons2 extends Cons{
	//@Override
	Cons2() {
		System.out.println("normal");
		
	}
	 Cons2(int a) {
		System.out.println("intiger: " +a);
	
	}
	Cons2(float b)
	{
		System.out.println("float: "+b);
	}
	Cons2(int a, float b, int c) {
		System.out.println("2 intiger: "+a +" " +b+" "+c);
	}
}
