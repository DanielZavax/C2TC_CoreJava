package c2ct.sample.pro1;

public class AccesModifier {
	private int a = 10;
	public int b = 15;
	protected int c = 20;
	int d = 25;
	

	public static void main(String[] args) {
		AccesModifier modif=new AccesModifier();
		System.out.println(modif.a);
		System.out.println(modif.b);
		System.out.println(modif.c);
		System.out.println(modif.d);
		 

	}

}
