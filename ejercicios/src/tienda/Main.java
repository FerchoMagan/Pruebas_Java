package tienda;

public class Main {
	public static void main(String[] args) { 
		String cliente = "Fernando"; 
		double subtotal = 25000;
		boolean esSocio = true;
		double descuento = 3000;
		double totalFinal;
		
		System.out.println("Cliente: " + cliente);
		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Socio: " + esSocio);
		
		if (esSocio) { 
			System.out.println("Descuento aplicado: $" + descuento); 
			totalFinal = subtotal - descuento; 
			} else {
				totalFinal = subtotal;
			} 
		System.out.println("Total final: $" + totalFinal); 
		}
}
