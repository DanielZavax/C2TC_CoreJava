package c2ct.sample.pro2;

public class Child extends Parent{
	int b;
	void dispaly() {
		System.out.println(b);
	}

	public static void main(String[] args) {
		Child b = new Child();
		b.add();
		b.dispaly();

	}
}


