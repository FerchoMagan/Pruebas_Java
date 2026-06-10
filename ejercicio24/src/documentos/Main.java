package documentos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Ingrese codigo: ");
		String codigoDocumento = sc.nextLine();
		char letra;
		boolean prefijoValido = false;
		boolean subfijoValido = false;
		System.out.println("Codigo: " + codigoDocumento);
		
		int largoCodigo = codigoDocumento.length();
		
		if ( largoCodigo == 7) {
			prefijoValido = true;
			subfijoValido = true;
			for (int i = 0; i < largoCodigo ; i++) {
				letra = codigoDocumento.charAt(i);

				if (i < 3 && (letra < 'A' || letra > 'Z')) {
					prefijoValido = false;
				}
				if (i > 3 && (letra < '0' || letra > '9')) {
					subfijoValido = false;
				}
			}
			if (prefijoValido) {
				System.out.println("Estado: Prefijo valido");
			} else {
				System.out.println("Estado: Prefijo invalido");

			}
			
			if (subfijoValido) {
				System.out.println("Estado: Subfijo valido");
			} else {
				System.out.println("Estado: Subfijo invalido");

			}	
		} else {
			System.out.println("Estado: Largo del codigo invalido");
		}

		
		sc.close();
	}
}
