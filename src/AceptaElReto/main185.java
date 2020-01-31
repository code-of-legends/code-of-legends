package AceptaElReto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class main185 {

	public static void main(String[] args) {
		boolean continua = true;
		Scanner in = new Scanner(System.in);
		while (continua) {
			int numcasos = in.nextInt();
			if (numcasos == 0)
				continua = false;
			else {
				HashSet<String> guta = new HashSet<String>();
				ArrayList<String> noguta = new ArrayList<String>();
				for (int i = 0; i < numcasos; i++) {
					boolean mas = true;
					String si = in.next();
					if (si.equals("SI:")) {
						while (mas) {
							String poti = in.next();
							if (poti.equals("FIN"))
								mas = false;
							else
								guta.add(poti);
						}
					} else {
						while (mas) {
							String poti = in.next();
							if (poti.equals("FIN"))
								mas = false;
							else
								noguta.add(poti);
						}
					}
					for (int j = 0; j < noguta.size(); j++) {
						if (guta.contains(noguta.get(j))) {
							noguta.remove(noguta.get(j));
							j--;
						}
					}

				}
				Collections.sort(noguta);
				LinkedHashSet<String> nooguta = new LinkedHashSet<String>(noguta);
				Iterator<String> noit = nooguta.iterator();
				if (noguta.size() == 0)
					System.out.println();
				else {
					System.out.print(noit.next());
					for (int x = 1; x < nooguta.size(); x++) {
						System.out.print(" " + noit.next());
					}
					System.out.println();
				}

			}
		}

	}

}