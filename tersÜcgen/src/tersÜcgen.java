import java.util.Scanner;

public class tersÜcgen {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n;
		System.out.print("Lütfen bir sayı giriniz: ");
		n= scan.nextInt();
		
		
		for (int i=n; i>=0; i--) {
			for (int j=1; j<=(n-i); j++) {
				System.out.print(" ");
				
			}
			for (int k=1; k<=(2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		

	}

}
