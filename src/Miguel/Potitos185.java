package Miguel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collections;

public class Potitos185 {
	static java.util.Scanner in;

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (gustan())
			;
	}

	public static boolean gustan() {
		int entradas = Integer.parseInt(in.nextLine());
		if (entradas == 0) {
			return false;
		} else {

			HashSet<String> noes = new HashSet<String>();
			noes.add(" ");
			HashSet<String> sies = new HashSet<String>();
			for (int i = 0; i < entradas; i++) {
				HashSet<String> comida = new HashSet<String>();
				comida.addAll(Arrays.asList(in.nextLine().split(" ")));
				if (comida.contains("NO:")) {
					noes.addAll(comida);
				} else if (comida.contains("SI:")) {
					sies.addAll(comida);
				}
			}
			noes.remove("NO:");
			noes.removeAll(sies);
			ArrayList<String> noes2 = new ArrayList<String>(noes);
			Collections.sort(noes2);
			String aux ="";
			for (String str : noes2) {
				if(!str.equals("FIN")) {
					aux +=(str + " ");
				}
				
			}
			
			System.out.println(aux.trim());
			return true;
		}
	}

}
