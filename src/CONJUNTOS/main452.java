package CONJUNTOS;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class main452 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean continu = true;
		while (continu) {
			int numcas = Integer.parseInt(in.next());
			if (numcas == 0)
				continu = false;
			else {
				TreeSet<Integer> bolas = new TreeSet<Integer>();
				TreeSet<Integer> bolaspos = new TreeSet<Integer>();
				for (int i = 0; i < numcas; i++) {
					bolas.add(Integer.parseInt(in.next()));
				}

				for (Integer integer : bolas) {
					Iterator<Integer> paseador = bolas.iterator();
					while (paseador.hasNext()) {
						bolaspos.add(Math.abs(paseador.next() - integer));
					}
				} 
				Iterator<Integer> paseador1 = bolaspos.iterator();
				paseador1.next();
				System.out.print(paseador1.next());
				while (paseador1.hasNext()) {
					System.out.print(" " + paseador1.next());
				}
//				for (Integer integer : bolaspos) {
//					if (integer!=0) {
//						System.out.print(integer+" ");
//					}
//					
//				}
				System.out.println();
			}
		}
	}
}
