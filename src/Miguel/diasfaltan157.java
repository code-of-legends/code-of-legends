package Miguel;

import java.util.Scanner;

public class diasfaltan157 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int meses[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 0 };
		for (int pruebas = in.nextInt(); pruebas > 0; pruebas--) {
			int dias = in.nextInt();
			for (int mes = in.nextInt()-2; mes >= 0; mes--) {
				dias += meses[mes];
				
			}
			System.out.println(365-dias);

		}

	}

}