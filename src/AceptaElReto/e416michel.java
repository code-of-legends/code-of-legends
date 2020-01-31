package AceptaElReto;

package aceptaelreto;

import java.util.HashSet;

public class e416michel {

	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		HashSet<String> hass = new HashSet <String>();
		int num=in.nextInt();
		if (num==0) {
			return false;
		}
		String [] arr= new String[num];
		for (int i = 0; i < num; i++) {
			arr[i]=in.next();
			arr[i]=arr[i].substring(0, arr[i].length()-4);
			hass.add(arr[i]);
		}
		if(hass.size()==arr.length) {
			System.out.println("NO");
		}else {
			System.out.println("SI");
		}
			

		return true;
		
	}
	

	public static void main(String args[]) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba());
	}

}