package documentos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int DIAS_VENCIMIENTO = 365;
		
		
		System.out.print("Ingrese codigo: ");
		String codigoDocumento = sc.nextLine();
		
		System.out.print("Ingrese titulo: ");
		String tituloDocumento = sc.nextLine();
		
		System.out.print("Ingrese dias desde revision: ");
		int diasDesdeRevision = sc.nextInt();
		sc.nextLine();
		
		boolean vigenciaOk = DIAS_VENCIMIENTO >= diasDesdeRevision;
		
		System.out.println("Codigo: " + codigoDocumento);
		System.out.println("Titulo: " + tituloDocumento);
		System.out.println("Dias desde revision: " + diasDesdeRevision);
		
		if (vigenciaOk) {
			System.out.println("Estado: Vigente");
		} else {
			System.out.println("Estado: Vencido");
		}
		
		sc.close();
	}
}
