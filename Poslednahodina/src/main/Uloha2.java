package main;

import java.util.Scanner;

public class Uloha2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Zadaj cislo");
		int cislo= sc.nextInt();
		
		if (cislo>10) {
			System.out.println("cislo vacsie ako 10");
		}
		

		if (cislo<0) {
			System.out.println("Je zaporne");
		}
		
		System.out.println("Zadaj vek");
		int vek = sc.nextInt();
		
		if (vek>18) {
			System.out.println("Spravne");
		}
		else {
			System.out.println("Nespravne");
		}
		
		
		if(cislo%5==0) {
			System.out.println("Je delitelne 5");
			
		}
	
		System.out.println("Zadaj cisla: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x<y) {
			System.out.println("Usporiadane zotupne");
		}
		
		System.out.println("Vypis body: ");
		int body = sc.nextInt();
		 if(body>80) {
			 System.out.println("Vitazstvo");
		 }
		 else {
			 System.out.println("Prehra");
		 }
		 
		 boolean prvocislo = true;
		 for (int i = 2 ;i<=cislo/2; i++) {
			if (cislo%i==0) {
				prvocislo = false;
			}
			
		 }
		 System.out.println("Prvocislo: "+prvocislo);
		
		 
		 
		 
		 System.out.println("Zadaj rok");
		 int rok = sc.nextInt();
		 
		 if (rok%4==0) {
			 System.out.println("Rok je prestupny");
		 }
		 else {
			 System.out.println("Rok neni prvotny");
		 }
		
		
		

	}

}
