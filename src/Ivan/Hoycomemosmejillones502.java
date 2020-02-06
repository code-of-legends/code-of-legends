package Ivan;

import java.util.Scanner;

public class Hoycomemosmejillones502 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		boolean continuar=true;
		do {
			int cant=in.nextInt();
			if(!in.hasNext())
				continuar=false;
			int [] mej=new int[cant];
			for (int i = 0; i < mej.length; i++) {
				mej[i]=in.nextInt();
			}
			int cont=0;
			for (int i = 1; i < mej.length; i++) {
				for (int j = 0; j < i; j++) {
					if(mej[i]<mej[j]) {
						mej[j]=mej[i];
						mej[i]=0;
						cont++;
					}
				}
			}
			cant-=cont;
			
			System.out.println(cant);
			
			
		}
		while (continuar);

	}

}
