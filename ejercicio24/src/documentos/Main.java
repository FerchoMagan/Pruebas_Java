package documentos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Ingrese codigo: ");
		String codigoDocumento = sc.nextLine();
		String codValido = "Estado: Codigo valido";
		String codInvalido = "Estado: Codigo invalido";
		char letra;
		boolean codValidado = false;
		System.out.println("Codigo: " + codigoDocumento);
		
		int largoCodigo = codigoDocumento.length();
		
		if ( largoCodigo == 7) {
			codValidado = true;
			for (int i = 0; i < largoCodigo ; i++) {
				letra = codigoDocumento.charAt(i);

				if (i < 3 && (letra < 'A' || letra > 'Z')) {
					codValidado = false;
				}
				if (i > 3 && (letra < '0' || letra > '9')) {
					codValidado = false;
				}
				if (i == 3 && letra != '-') {
					codValidado = false;
				}
			}
			if (codValidado) {
				System.out.println(codValido);
			} else {
				System.out.println(codInvalido);
			}	
		} else {
			System.out.println(codInvalido);
		}

		
		sc.close();
	}
}
