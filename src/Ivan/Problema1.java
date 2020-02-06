package Ivan;

import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int[] A = new int[n];
		int[] B = new int[n];

		int res;

		for (int cont = 0; n > cont; cont++) {
			A[cont] = in.nextInt();
			B[cont] = in.nextInt();

		}
		for (int cont = 0; n > cont; cont++) {
			
			res = Math.abs(B[cont] - A[cont]);

			System.out.println(res);
		}
		in.close();
	}

}