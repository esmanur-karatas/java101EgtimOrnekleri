import java.util.Scanner;

public class fibonacciSerisi {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n1=0,n2=1,n3,i,n;
		System.out.print("Lütfen bir sayı giriniz: ");
		n = scan.nextInt();
		System.out.print(n1+" "+n2);
		
		for(i=2;i<n;++i) {  
		  n3=n1+n2;  
		  System.out.print(" "+n3);  
		  n1=n2;  
		  n2=n3;  
		    }
		 System.out.println();
		    }
		    
		}

