package demo;

public class Star6 {

	public static void main(String[] args) {
		int num=5;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int k=i;k<=num;k++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=1;i<=num;i++)
		{
			for(int j=i;j<num;j++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}


	}

}
