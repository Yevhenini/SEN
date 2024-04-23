package som_Vetsii;

import java.util.Scanner;

public class Help {
Scanner sc =  new Scanner(System.in);
int cislo;
	
	
	
public void ziskaj_cislo() {
	System.out.println("Zadaj cislo");
	cislo = sc.nextInt();
	je_kladne();
}
public void je_kladne () {
	if (cislo>=0) {
		System.out.println("Cislo je vetsie ako nula");
	}
	else {
		System.out.println("Cislo je mensie ako nula");
		ziskaj_cislo();
		
	}
}
	
}
