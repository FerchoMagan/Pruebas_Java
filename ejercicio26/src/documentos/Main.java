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
		
		if (esLargoValido(largoCodigo) && esPrefijoValido(codigoDocumento) && esSufijoValido(codigoDocumento)){
				char letra;
				letra = codigoDocumento.charAt(3);
				if (letra != '-') {
						return false;
				}
				return true;
		} else {
			return false;
		}
	}
	public static boolean esLargoValido (int validarLargo) {
		
		if (validarLargo == 7) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean esSufijoValido (String codigoDocumento) {
		int largoCodigo = codigoDocumento.length();
		for (int i = 4; i < largoCodigo; i++) {
			char letra;
			letra = codigoDocumento.charAt(i);
			if (!esNumero(letra)) {
				return false; 
			}
		}
		return true;
	}

	public static boolean esPrefijoValido (String codigoDocumento) {
		for (int i = 0; i < 3; i++) {
			char letra;
			letra = codigoDocumento.charAt(i);
			if (!esLetraMayuscula(letra)) {
				return false; 
			}
		}
		return true;
	}
}
	

