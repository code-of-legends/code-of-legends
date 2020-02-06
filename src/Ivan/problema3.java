package Ivan;

import java.util.Arrays;

public class problema3 {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int P;
		P = in.nextInt();
		if (!in.hasNext())
			return false;
		int C= in.nextInt();
		int [][] L = new int[C][2];
		for (int i = 0; i < C; i++) {
			for (int j = 0; j < 2; j++) {
				L[i][j]=in.nextInt();
			}
			
		}
		
		for (int i = 0; i < L.length; i++) {
			for (int j = 0; j < L.length-1; j++) {
				if(L[i][j]>L[i][j+1]) {
					int aux=L[i][j];
					L[i][j]=L[i][j+1];
					L[i][j+1]=aux;
				}
			}
		}
		
		int cont=1;
		boolean bici=true;
		
		for (int i = 0; i < L.length; i++) {
				if(L[i][0]!=cont)
					bici=false;
				cont=L[i][i+1];
			
		}
		
		
		for (int i = 0; i < L.length; i++) {
			for (int j = 0; j < L.length; j++) {
				System.out.println(L[i][j]);
			}
		}
		
		return true;
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba());
	}
}