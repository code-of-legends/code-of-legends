package Ivan;

import java.util.Arrays;
import java.util.Scanner;

public class main534 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {
			int n = in.nextInt();
			if (n == 0)
				continuar = false;
			else {
				int[] cubo = new int[n];

				for (int i = 0; i < cubo.length; i++) {
					cubo[i] = in.nextInt();
				}
				
				Arrays.sort(cubo);
//				int dif=0;
//				int max=0;
				int res=0;
				for (int i = 0; i < cubo.length-1; i+=2) {
					res=Math.max(res, Math.abs(cubo[i]-cubo[i+1]));
//					if(res>dif)
//						max=res;
//					dif=res;
		
				}
				

				System.out.println(res);
			}

		}

	}

}
