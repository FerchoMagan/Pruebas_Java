package documentos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Ingrese codigo: ");
		String codigoDocumento = sc.nextLine();
		char letra;
		boolean prefijoValido = false;
		System.out.println("Codigo: " + codigoDocumento);
		
		int largoCodigo = codigoDocumento.length();
		
		if ( largoCodigo >= 3) {
			prefijoValido = true;
			
			for (int i = 0; i < 3; i++) {
				letra = codigoDocumento.charAt(i);
				
				if (letra < 'A' || letra > 'Z') {
					prefijoValido = false;
				}
			}
		} 
		if (prefijoValido) {
			System.out.println("Estado: Prefijo valido");
		} else {
			System.out.println("Estado: Prefijo invalido");

		}
		
		sc.close();
	}
}
