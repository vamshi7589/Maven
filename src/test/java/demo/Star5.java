package demo;

public class Star5 {

	public static void main(String[] args) {

		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = i; j < num; j++)
				System.out.print("");
			for (int k = i; k <= num; k++)
				System.out.print("*");
			System.out.println(" ");
		}

	}

}