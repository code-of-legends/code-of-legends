//Autor Javi
package AceptaElReto;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class e185 {

	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		HashSet<String> si = new HashSet<String>();
		HashSet<String> no = new HashSet<String>();
		int num = in.nextInt();
		String val = "";
		String frase = "";
		if (num == 0) {
			return false;
		}
		
		for (int i = 0; i < num; i++) {
			val = in.next();
			if (val.equals("SI:")) {

				frase = in.nextLine().trim();
				si.addAll(Arrays.asList(frase.split(" ")));
				si.remove("FIN");
			} else if (val.equals("NO:")) {
				frase = in.nextLine().trim();
				no.addAll(Arrays.asList(frase.split(" ")));
				no.remove("FIN");
			}
		}
		no.removeAll(si);
		ArrayList<String> list = new ArrayList<String>(no);
		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {

			if (i == list.size() - 1) {
				System.out.println(list.get(i));
			} else {
				System.out.print(list.get(i) + " ");
			}
		}
		
		return true;
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}

}

