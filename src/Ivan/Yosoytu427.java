/**
 * @author iván hernán
 */
package Ivan;

import java.util.Scanner;

public class Yosoytu427 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ncasos=in.nextInt();
		for (int i = 0; i < ncasos; i++) {
			String palabra=in.next();
			String palabra2=in.next();
			if(palabra.equals("Luke")&&palabra2.equals("padre"))
				System.out.println("TOP SECRET");
			else
				System.out.println(palabra+", yo soy tu "+palabra2);
		}
	}
}