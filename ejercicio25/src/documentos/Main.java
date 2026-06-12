package documentos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Ingrese codigo: ");
		String codigoDocumento = sc.nextLine();
		final String COD_VALIDO = "Estado: Codigo valido";
		final String COD_INVALIDO = "Estado: Codigo invalido";
		
		System.out.println("Codigo: " + codigoDocumento);
		boolean codigoValido = validarCodigoDocumental(codigoDocumento);
		
		if (codigoValido) {
			System.out.println(COD_VALIDO);
		} else {
			System.out.println(COD_INVALIDO);
		}	
		sc.close();
	}
	
	public static boolean esLetraMayuscula(char caracter) {
	    return caracter >= 'A' && caracter <= 'Z';
	}
	
	public static boolean esNumero(char caracter) {
	    return caracter >= '0' && caracter <= '9';
	}
	
	public static boolean validarCodigoDocumental(String codigoDocumento) {
		int largoCodigo = codigoDocumento.length();
		char letra;
		
		if ( largoCodigo == 7) {
			
			for (int i = 0; i < largoCodigo ; i++) {
				letra = codigoDocumento.charAt(i);

				if (i < 3 && (!esLetraMayuscula(letra))) {
					return false;
				}
				if (i > 3 && (!esNumero(letra))) {
					return false;
				}
				if (i == 3 && letra != '-') {
					return false;
				}
			}
			return true;

		} else {
			return false;
		}
	}
	
	
	
}
