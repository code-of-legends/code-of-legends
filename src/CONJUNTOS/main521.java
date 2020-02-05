/**
 * @author iván hernán
 */
package CONJUNTOS;

import java.util.HashSet;
import java.util.Scanner;

public class main521 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean continua=true;
		while(continua) {
			int P=Integer.parseInt(in.next());
			int L=Integer.parseInt(in.next());
			int A=Integer.parseInt(in.next());
			if(P==0&&L==0&&A==0)
				continua=false;
			else {
				HashSet<String> vp = new HashSet<String>();
				
				for (int i = 0; i < A;i++) {
					String linea=in.next();
					linea+=in.next();
					vp.add(linea);
				}
	
				int viviendas=(P*L);
				if(viviendas%2!=0)
					viviendas=viviendas/2+1;
				else
					viviendas/=2;
				
				if(vp.size()>=viviendas)
					System.out.println("EMPEZAMOS");
				else
					System.out.println("ESPERAMOS");
			}
		}

	}

}
