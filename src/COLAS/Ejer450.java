package COLAS;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ejer450 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linea1 = sc.nextLine();
		String[] num = linea1.split(" ");
		String lineaClave = sc.nextLine();
		int longClave = Integer.parseInt(num[0]);
		int longMensaje = Integer.parseInt(num[1]);
		String lineaMensaje = sc.nextLine();
		String valorStr;
		int contadorSolución = 0;
		int contador = 0; 
		boolean valor1Coincidente = false;

		PriorityQueue<String> mensaje = new PriorityQueue<String>();
		mensaje.addAll(Arrays.asList(lineaMensaje.split(" ")));
		lineaClave.replace(" ", "");

		
		
		valorStr = Character.toString(lineaClave.charAt(0));

		while(contador < lineaClave.length()) {
			for (String valorQueue : mensaje) {
			
			
			if (valorQueue.equalsIgnoreCase(valorStr)) {
				valor1Coincidente = true;
				contador++;
				contadorSolución++;
			}

			if (valor1Coincidente = true && contador < lineaClave.length()) {
				valorStr = Character.toString(lineaClave.charAt(contador));
				if (valorQueue.equalsIgnoreCase(valorStr)) {
					contadorSolución++;
					contador++;
				} 
			}
		}
		}
		System.out.println(contadorSolución);
		System.out.println(lineaClave.length());
	}

}
