package cursos;

public class Main {
	public static void main(String[] args) {
		String nombre = "Fernando";
		int edad = 32;
		boolean tieneDeuda = false;
		boolean cupoDisponible = true;

		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Tiene deuda: " + tieneDeuda);
		System.out.println("Cupo disponible: " + cupoDisponible);

		if (cupoDisponible && !tieneDeuda && edad >= 18) {
			System.out.println("Estado: Inscripcion aprobada");
		} else {
			System.out.println("Estado: Inscripcion desaprobada");
		}
	}
}
