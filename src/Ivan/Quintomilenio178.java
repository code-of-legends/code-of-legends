package Ivan;
import java.util.Scanner;

public class Quintomilenio178 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numcasos = Integer.parseInt(in.nextLine());

		for (int i = 0; i < numcasos; i++) {

//			String titular = in.nextLine().toLowerCase();
			boolean si = false;
			int cont = 0;
			int pos = 0;
			String[] palabra = { in.nextLine().toLowerCase(), in.nextLine().toLowerCase() };
//			String palabra=in.nextLine().toLowerCase();
			palabra[0]=palabra[0].replace(" ","");
			palabra[1]=palabra[1].replace(" ","");
//			char[] palabra = in.nextLine().toLowerCase().toCharArray();
			if(palabra[1].length()==0)
				si=false;
			else {
			for (int j = 0; j < palabra[0].length() && si == false; j++) {
				if (pos<=palabra[1].length()-1 && palabra[0].charAt(j) == palabra[1].charAt(pos)) {
					cont++;
					pos++;

				}
				if (cont == palabra[1].length())
					si = true;

			}
			}
			if (si)
				System.out.println("SI");
			else
				System.out.println("NO");

		}

	}

}
