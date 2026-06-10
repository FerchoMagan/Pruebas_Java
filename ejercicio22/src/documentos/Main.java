package documentos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Ingrese codigo: ");
		String codigoDocumento = sc.nextLine();
		
		int largoCadena = codigoDocumento.length();
		System.out.println("Codigo: " + codigoDocumento);
		System.out.println("Longitud: " + largoCadena);
		
		for (int i = 0; i < largoCadena; i++) {

			System.out.println("Posicion " + i + ": " + codigoDocumento.charAt(i) );
		}
		
		
		sc.close();
	}
}
