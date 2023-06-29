import java.util.Scanner;

public class sinifGecme {

	public static void main(String[] args) {
		int mat,fizik,kimya,turkce,muzik;
		
		Scanner input=new Scanner(System.in);
		System.out.print("matematik notunuzu giriniz: ");
		mat= input.nextInt();
		System.out.print("fizik notunuzu giriniz: ");
		fizik=input.nextInt();
		System.out.print("kimya notunuzu giriniz: ");
		kimya=input.nextInt();
		System.out.print("turkce notunuzu giriniz: ");
		turkce=input.nextInt();
		System.out.print("müzik notunuzu giriniz: ");
		muzik=input.nextInt();
		
		double orta=(mat + fizik + kimya + turkce + muzik) / 5;
		
		if (orta<55) {
			System.out.println("üzgünüm kaldınız!");
			
		}else {
			System.out.println("Tebrikler Geçtiniz :) ");
			
		}
		System.out.println("Ortalamanız: "+orta);
       
	}

}
