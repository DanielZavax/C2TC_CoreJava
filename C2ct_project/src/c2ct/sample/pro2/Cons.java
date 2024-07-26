package c2ct.sample.pro2;

public class Cons {
	Cons() {
		System.out.println("normal");
		
	}
	 Cons(int a) {
		System.out.println("intiger: " +a);
	
	}
	Cons(float b)
	{
		System.out.println("float: "+b);
	}
	Cons(int a, float b, int c) {
		System.out.println("2 intiger: "+a +" " +b+" "+c);
	}
}
