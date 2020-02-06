package Ivan;
import java.util.Scanner;

public class Encadenandopalabras188 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String [] palabra= in.nextLine().split(" ");
			boolean igual=true;
			if(palabra.length==1)
				igual=true;
			else {
				for (int i = 0; i < palabra.length-1&&igual==true; i++) {
					String cad1=palabra[i].substring((palabra[i].length()-2),palabra[i].length());
					String cad2=palabra[i+1].substring(0,2);
					if(!cad1.equals(cad2))
						igual=false;
				
//					if(palabra[i].charAt(palabra[i].length()-2)==palabra[i].charAt(palabra[i].length()-1)
				}
			}
			if(igual)
				System.out.println("SI");
			else
				System.out.println("NO");
		}
	}

}