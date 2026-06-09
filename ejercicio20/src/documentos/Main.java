package documentos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		boolean largoValido;
		char guion = 's';
		System.out.print("Ingrese codigo: ");
		String codigoDocumento = sc.nextLine();
		
		int largoCadena = codigoDocumento.length();
		
		System.out.println("Codigo: " + codigoDocumento);
		System.out.println("Longitud: " + largoCadena);
		
		
		if (largoCadena == 7) {
			largoValido = true;
			guion = codigoDocumento.charAt(3);			
		} else {
			largoValido = false;
		}	
		
		if (largoValido && guion == '-') {
			System.out.println("Caracter posicion 3: " + guion);
			System.out.println("Estado: Formato base correcto");

		} else {			
			System.out.println("Estado: Formato base incorrecto");
		}

		
		sc.close();
	}
}
