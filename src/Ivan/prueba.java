package Ivan;

public class prueba {
	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int cant=in.nextInt();
		if (!in.hasNext())
			return false;
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
		return true;
	}

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba())
			;
	}
}