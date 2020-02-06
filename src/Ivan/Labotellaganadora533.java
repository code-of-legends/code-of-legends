package Ivan;

import java.util.Scanner;

public class Labotellaganadora533 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			int total=0;
			int maxp=0;
			int k=in.nextInt();
			int kilos=k*8;
			
			boolean continuar=true;
			int cont=1;
			do {
				
			int a=in.nextInt();
			if(a==0) 
				continuar=false;
			else{
				total+=a;
				if(total>=kilos && maxp==0) {
					maxp=cont;
				}
				cont++;
			}
			
			}while(continuar);
				
				
			if(total>=kilos)
				System.out.println(maxp);
			else
				System.out.println("SIGAMOS RECICLANDO");
			
			
		}

	}

}
