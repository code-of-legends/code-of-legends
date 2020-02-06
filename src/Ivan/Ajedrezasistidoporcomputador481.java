package Ivan;

import java.util.Scanner;

public class Ajedrezasistidoporcomputador481 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int pos;
		int pos2;
		
		boolean continuar=true;
		while(continuar) {
			pos=in.nextInt();
			pos2=in.nextInt();
			
			if (pos==0&&pos2==0) 
				continuar=false;
				
			else {
			String res="";
			switch (pos){
			case 1:
				res="h"+pos2;
				break;
			case 2:
				res="g"+pos2;
				break;
			case 3:
				res="f"+pos2;
				break;
			case 4:
				res="e"+pos2;
				break;
			case 5:
				res="d"+pos2;
				break;
			case 6:
				res="c"+pos2;
				break;
			case 7:
				res="b"+pos2;
				break;
			case 8:
				res="a"+pos2;
			}
			System.out.println(res);
			}
			
		}
	}

}
