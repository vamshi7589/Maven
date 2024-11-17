package demo;

public class Star7 {

	public static void main(String[] args) {
		int num=5;
		for (int i = 1; i <=num; i++) 
		 {
	            for (int j = i; j <=num ; j++) 
	                System.out.print("*");
	            for (int k = 2; k < i*2 ; k++) 
	                System.out.print(" ");	            
	            for (int m = i; m <=num ; m++) 
	              System.out.print("*");
	             System.out.println();
		 }
	}
}

