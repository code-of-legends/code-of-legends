package Ivan;

import java.util.Scanner;

public class Sendapirenaica485 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {
			int etapas = in.nextInt();

			if (etapas == 0)
				continuar = false;

			else {
				int[] dist = new int[etapas];
				int cont = 0;

				for (int i = 0; i < dist.length; i++) {
					dist[i] = in.nextInt();
					cont += dist[i];
				}
				System.out.print(cont+" ");
				for (int i = 0; i < dist.length-1; i++) {
					System.out.print(cont - dist[i]+" ");
					cont -= dist[i];
				}
			}

		}

	}

}
