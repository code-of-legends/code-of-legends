package Miguel;

import java.util.Arrays;
import java.util.Scanner;

public class desembalse535 {
	static java.util.Scanner in;
	public static boolean casosPrueba() {
		int D = Integer.parseInt(in.nextLine());
		if (D==0) {
			return false;
		}
		int[] alturas = new int [D];
		for (int i = 0; i < alturas.length; i++) {
			alturas[i] = in.nextInt();
		}
		//aqui empieza la parte que yo he realizado
		int agua = 0;
		for (int i = 0; i < alturas.length; i++) {
			agua += alturas[alturas.length-1] - alturas[i];
			
		}
		//aqui termina mi parte
		System.out.println(agua);
		in.nextLine();
		return true;
	}
	public static void main(String[] args) {
		in = new Scanner(System.in);
		while(casosPrueba()) {
			
		}
	}
}
