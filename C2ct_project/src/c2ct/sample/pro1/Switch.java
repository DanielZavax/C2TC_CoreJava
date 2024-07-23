package c2ct.sample.pro1;

public class Switch {

	public static void main(String[] args) {
		char x = 'd';
		switch (x)
		{
		case 'l':
		case 'L':
			System.out.println(x+" is a Letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+" is a Digit");
			break;
		case 'w':
		case 'W':
			System.out.println(x+" is a White Space");
			break;
		case 's':
		case 'S':
			System.out.println(x+" is a Speacial Symbol");
			default:
				System.out.println(x+" is other then Letter,digit,space or symbol");
			break;
		}
	}

}
