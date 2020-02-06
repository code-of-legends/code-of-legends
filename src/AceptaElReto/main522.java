package AceptaElReto;

import java.util.Scanner;
import java.util.TreeSet;

public class main522 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int cont=0;
			String palabra1=in.next();
			String palabra2=in.next();
			String [] abecedario = {"a","b","c","ch","e","f", "g", "h", "i", "j", "k", "l", "ll", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
			
			TreeSet<String> minimo = new TreeSet<String>();
			minimo.add(palabra1);
			minimo.add(palabra2);
			String palabramin=minimo.pollFirst();
			if(palabra1.contains("ch")||palabra1.contains("ll")||palabra2.contains("ch")||palabra2.contains("ll")) {
			boolean continua=true;
			while (continua) {
				if(cont>=palabra1.length()||cont>=palabra2.length())
					continua=false;
				else {
				if(palabra1.charAt(cont)==palabra2.charAt(cont)) {
					cont++;
				}
				else {
					if(palabra1.charAt(cont)=='l'&&palabra2.charAt(cont)!='l'||palabra1.charAt(cont)=='h') {
						palabramin=palabra2;
					}
					else if(palabra2.charAt(cont)=='l'||palabra2.charAt(cont)=='h') {
						palabramin=palabra1;
					}
					else {
						palabramin=palabra1;
					}
					continua=false;
				}
				}
				
			}
			}
			System.out.println(palabramin);
		}
	}

}
