package Ivan;

import java.util.Arrays;
import java.util.Scanner;

public class main546 {

	public static void main(String[] args) {
		
		Scanner	in = new Scanner(System.in);
		
		int ncasos=in.nextInt();
		
		for (int i = 0; i < ncasos; i++) {
			int na = in.nextInt();
			int [] cral = new int [na];
			for (int j = 0; j < cral.length; j++) {
				cral[j]=in.nextInt();
			}
			int nm = in.nextInt();
			int [] crma = new int [nm];
			for (int j = 0; j < crma.length; j++) {
				crma[j]=in.nextInt();
			}
			
			Arrays.sort(crma);
			Arrays.sort(cral);
			
			for (int j = 0; j < crma.length-1; j++) {
				for (int j2 = 0; j2 < cral.length-1; j2++) {
					if(crma[j]==crma[j+1])
						System.out.print(crma[j]);
				}
			}
			
		}

	}

}
