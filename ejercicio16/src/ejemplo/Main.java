package ejemplo;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese edad:");
		int edad = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese su nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		sc.close();
	}
}
