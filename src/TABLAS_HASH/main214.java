/**
 * @author Ivan hernán
 */
package TABLAS_HASH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main214 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		boolean continu = true;
		while (continu) {
			int numreyes = Integer.parseInt(in.next());
			if (numreyes == 0)
				continu = false;
			else {
				ArrayList<String> reyes = new ArrayList<String>();
				for (int i = 0; i < numreyes; i++) {
					reyes.add(in.next());
				}
				int numabd = Integer.parseInt(in.next());
				ArrayList<String> abd = new ArrayList<String>();
				for (int i = 0; i < numabd; i++) {
					abd.add(in.next());
				}
				for (String string : abd) {
					System.out.println(Collections.frequency(reyes, string)+1);
					reyes.add(string);
				}
				System.out.println();
			}
		}
	}

}