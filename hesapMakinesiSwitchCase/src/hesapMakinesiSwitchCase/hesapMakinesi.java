package hesapMakinesiSwitchCase;

import java.util.Scanner;

public class hesapMakinesi {

	public static void main(String[] args) {
		
			int n1,n2,select;
			
			Scanner input = new Scanner(System.in);
			System.out.print("İlk Sayıyı Giriniz: ");
			n1=input.nextInt();
			System.out.print("İkinci Sayıyı Giriniz: ");
			n2=input.nextInt();
			
			System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
			System.out.print("Lütfen Seçiminizi Giriniz: ");
			select= input.nextInt();
			
			switch (select) {
			case 1: 
				    System.out.print("Toplam: " +(n1+n2));
				    break;
				
			case 2:
					System.out.print("Çıkarma: " +(n1-n2));
					break;
					
			case 3:
					System.out.print("Çarpma: "+(n1*n2));
					break;
					
			case 4:
				if (n2 !=0 ) {
					System.out.print("Bölme: " +(n1/n2));
				}else {
					System.out.println("Bir Sayı 0'a Bölünemez!!");
				}
			
					break;
			
			default:
			System.out.println("YANLIŞ SEÇİM LÜTFEN 1 İLE 4 ARASINDA BİR SAYI SEÇİNİZ!!");
			}

	}

}
