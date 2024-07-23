package c2ct.sample.pro1;

public class BreakContinue {

	public static void main(String[] args) {
		for (int i = 5; i < 10; i++)
			{
			if (i == 5)
			break;
			System.out.println(i);
			}
			
			for (int k = 5; k < 15; k++)
			{
			// Odd numbers are skipped
			if (k%2 != 0)
			continue;
			// Even numbers are printed
			System.out.print(k + " ");
			}
	}
}
