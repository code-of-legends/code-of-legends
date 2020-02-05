/**
 * @author iván hernán
 */
package TABLAS_HASH;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class main270 {
	public static void main(String[] args) {
		boolean continua = true;
		Scanner in = new Scanner(System.in);
		while (continua) {
			int numcasos = Integer.parseInt(in.nextLine());
			if (numcasos == 0)
				continua = false;
			else {
				String alumno;
				String aprob;
				HashMap<String, Integer> notas = new HashMap<String, Integer>();
				for (int i = 0; i < numcasos; i++) {

					alumno = in.nextLine();
					aprob=in.nextLine();
					if(notas.containsKey(alumno)) {
					if (aprob.equals("CORRECTO"))
						notas.put(alumno,notas.get(alumno)+ 1);
					else {
						notas.put(alumno,notas.get(alumno)- 1);
					}
					}
					else {
						if(aprob.equals("CORRECTO"))
						notas.put(alumno,1);
						else
							notas.put(alumno,-1);
					}
				
				}
				for (int i = 0; i < notas.size(); i++) {

				
				}
				int notaa=0;
				TreeSet<String> not = new TreeSet<String>(notas.keySet());
				for (String string : not) {
					notaa=notas.get(string);
					if(notaa!=0) {
						System.out.println(string+", "+notaa);
					}
				}
				System.out.println("---");
			}
		}
	}
}
