package documentos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			

		
		System.out.print("Ingrese codigo: ");
		String codigoDocumento = sc.nextLine();
		
		int largoCadena = codigoDocumento.length();
		
		boolean largoValido = false;
		
		System.out.println("Codigo: " + codigoDocumento);
		
		boolean primeraLetra = false;
		boolean segundaLetra = false;
		boolean terceraLetra = false; 
		boolean cuartaLetra = false;
		boolean quintaLetra = false; 
		boolean sextaLetra = false;
		boolean septimaLetra = false;
		
		if (largoCadena == 7) {
			largoValido = true;	
			primeraLetra = codigoDocumento.charAt(0) >= 'A' && codigoDocumento.charAt(0) <= 'Z';
			segundaLetra = codigoDocumento.charAt(1) >= 'A' && codigoDocumento.charAt(1) <= 'Z';
			terceraLetra = codigoDocumento.charAt(2) >= 'A' && codigoDocumento.charAt(2) <= 'Z';
			cuartaLetra = codigoDocumento.charAt(3) == '-';
			quintaLetra = codigoDocumento.charAt(4) >= '0' && codigoDocumento.charAt(4) <= '9';
			sextaLetra = codigoDocumento.charAt(5) >= '0' && codigoDocumento.charAt(5) <= '9';
			septimaLetra = codigoDocumento.charAt(6) >= '0' && codigoDocumento.charAt(6) <= '9';
		}
		
		if (largoValido && primeraLetra && segundaLetra && terceraLetra && cuartaLetra && quintaLetra && sextaLetra && septimaLetra) {
			System.out.println("Estado: Codigo valido");

		} else {			
			System.out.println("Estado: Codigo invalido");
		}

		
		sc.close();
	}
}
