package demo;

public class Star8 {

	public static void main(String[] args) {
		   int num=5;
			for(int i=1;i<=num;i++)
			{
				for(int j=1;j<=i;j++)
					System.out.print("*");
				for(int k=1;k<=2*(num-i);k++)
					System.out.print(" ");
				for(int m=1;m<=i;m++)
					System.out.print("*");
				System.out.println();
			}      
		      
		 }

}
