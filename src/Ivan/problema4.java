package Ivan;

import java.util.Scanner;

public class problema4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[][] uvas = new int[num][3];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < 3; j++) {
				uvas[i][j] = in.nextInt();
			}
		}
		int aux = 0;
		int total = 0;
		for (int i = 0; i < num; i++) {
			int D = uvas[i][0] / uvas[i][2];
			int res = uvas[i][0] - D * uvas[i][2];
			if (uvas[i][1] - res <= 0)
				aux = uvas[i][1];
			else
				aux = uvas[i][0] - D * uvas[i][2];

			total = D * uvas[i][1] + aux;

			System.out.println(total);
		}

	}

}
