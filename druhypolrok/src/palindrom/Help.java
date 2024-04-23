package palindrom;

import java.util.Scanner;

public class Help {
	Scanner sc = new Scanner(System.in);
	String otocene_slovo = "";
	//Bude zistovat ci zadane slovo je palindrom, vypis bude vyzerat nasledovnie: slovo x je palindrom;
	public void zisti_palindrom() {
	String slovo_klava = ziskaj_palindrom();
	otoc_slovo(slovo_klava);
	
	
	
	if(slovo_klava.equals(otocene_slovo)) {
		System.out.println("Slovo: "+slovo_klava+" je palindrom");
		
	}
	else {
		System.out.println("Slovo: "+slovo_klava+" nie je palindrom");
	}
	
		
	}
	
	
	private String ziskaj_palindrom(){
	
	System.out.println("Zadaj slovo");
	
	return sc.next().toLowerCase();	
	
	}
	
	
	private String otoc_slovo(String slovo) {
	
		
	for (int i = slovo.length() -1; i>= 0; i--) {
		
		otocene_slovo += slovo.charAt(i);
		}
	
	return otocene_slovo;
	
	}

		
		
	}


