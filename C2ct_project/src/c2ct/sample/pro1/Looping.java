package c2ct.sample.pro1;

public class Looping {

	public static void main(String[] args) {
		int a=1;
		while(a<5) {
			System.out.println("yes");
			a++;
		}
		do {
			System.out.println("hi");
		}
		while(a>5);
		for(int i=0;i<5;i++) {
			System.out.println("hello");
		}
	}
       
}
